package edu.neumont.csc110.a.monopoly;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import edu.neumont.csc110.a.utilities.ConsoleUI;

public class Game {
	static Player[] playerarray;
	CommunityChanceText decks = new CommunityChanceText();
	BoardTiles allTheProperty = new BoardTiles();
	static Banker banker = new Banker();

	public void run() throws IOException {
		int person = pick_players();
		intitializeTheGame();
		playerarray = setPlayerOrder(person);
		boolean anyoneWin = false;
		for (int j = 0; j < person; j++) {
			playerarray[j].addPlayerPosition(0);
			Board.setMainBoard(playerarray, playerarray.length);
		}
		// Board.printMainBoard();
		while (anyoneWin == false) {
			for (int i = 0; i < playerarray.length; i++) {
				if (playerarray[i].isPlayerInJail() == true) {
					Board.printMainBoard();
					playerInJailTurn(playerarray[i], playerarray.length);
				} else {
					Board.printMainBoard();
					turn(playerarray[i], playerarray.length);
				}
				anyoneWin = win();
				//if (win()) break;
			}
		}
		for (int i = 0; i < playerarray.length; i++) {
			if (playerarray[i].getMoney() > 0) {
				System.out.println(playerarray[i].getName() + " wins!");
			}
		}
	}

	private void intitializeTheGame() throws IOException {
		decks.resetBothDecks();
		allTheProperty.init();
		banker.bankinit(allTheProperty);

	}
	
	private Player[] setPlayerOrder(int person) throws IOException {
		Player[] playerOrder = new Player[person];
		Integer[] playerOrderRolls = new Integer[person];
		for(int i=0;i<person;i++) {
			System.out.println(playerarray[i].getName() + " roll to determine turn order.");
			ConsoleUI.promptForInput("", true);
			playerarray[i].setTurnOrderRoll(sum(roll()));
			System.out.println(playerarray[i].getName() + " rolled: " + playerarray[i].getTurnOrderRoll());
		}
		for(int i=0;i<person;i++) {
			playerOrderRolls[i] = playerarray[i].getTurnOrderRoll();
		}
		Arrays.sort(playerOrderRolls, Collections.reverseOrder());
		//Arrays.sort(playerOrderRolls);
		
		for(int i=0;i<person;i++) {
			int temper = 0;
			for(int j=0;j<person;j++) {
				if(playerOrderRolls[i] == playerarray[j].getTurnOrderRoll()) {
					temper = j;
					playerarray[j].setTurnOrderRoll(-100);
					break;
				}
			}
			Player player = playerarray[temper];
			playerOrder[i] = player;
		}
		
		return playerOrder;
	}
		
	private void turn(Player player, int person) throws IOException {
		int[] diceRoll = new int[2];
		int sumOfDiceRoll = 0;
		int timesRolled = 0;

		do {
			printPlayerMoney(playerarray, player, person);
			System.out.println(player.getName() + " would you like to:");
			String[] turnOptions = { "Roll the die", "Trade", "Buy or Sell houses", "View your properties", "Debug" };
			int userSelection = ConsoleUI.promptForMenuSelection(turnOptions, false);

			switch (userSelection) {
			case 1:
				diceRoll = roll();
				sumOfDiceRoll = sum(diceRoll);
				timesRolled++;
				player.addPlayerPosition(sumOfDiceRoll);
				sumOfDiceRoll = 0;
				Board.setMainBoard(playerarray, person);
				Board.printMainBoard();
				printPlayerMoney(playerarray, player, person);
				System.out.println(player.getName() + ", you rolled: ");
				for (int i = 0; i < 2; i++) {
					System.out.print(diceRoll[i] + " ");
				}
				System.out.println();
				PropertyCards card = allTheProperty.PropCards[player.getPlayerPosition()];
				BoardLogic.mainBoardLogic(player, playerarray, card, decks, person, banker, allTheProperty);
				// System.out.println("You rolled a " + roll());
				if (timesRolled == 3 && diceRoll[0] == diceRoll[1]) {
					player.setPlayerInJail(true);
					// move player to jail
					// make jail turn
				}
				break;
			case 2:
				trading();
				printPlayerMoney(playerarray, player, person);
				break;
			case 3:
				int otherUserSelection = -1;
				String[] otherOptions = { "Buy Houses", "Sell Houses" };
				do {
					otherUserSelection = ConsoleUI.promptForMenuSelection(otherOptions, true);
					switch (otherUserSelection) {
					case 0:
						break;
					case 1:
						buy_Houses();
						printPlayerMoney(playerarray, player, person);
						break;
					case 2:
						sell_Houses();
						printPlayerMoney(playerarray, player, person);
						break;
					}

				} while (otherUserSelection != 0);
				break;
			case 4:
				if (player.lengthOfProperties() > 0) {
					System.out.println("These are your properties " + player.getName());
					for (int i = 0; i < player.lengthOfProperties(); i++) {
						player.printAsciiOwned(i);
					}
				} else if (player.lengthOfProperties() == 0) {
					System.out.println("You currently don't own any properties");
				}
				break;
			case 5:
				System.out.println("You have entered debug mode.");
				String[] debugoptions = { "Move Player Postion", "Add Money" };
				int debugselection = ConsoleUI.promptForMenuSelection(debugoptions, false);
				switch (debugselection) {
				case 1:
					player.setPlayerPosition(
							ConsoleUI.promptForInt("What number tile would you like to move to?", 0, 39));
					PropertyCards debugcard = allTheProperty.PropCards[player.getPlayerPosition()];
					BoardLogic.mainBoardLogic(player, playerarray, debugcard, decks, person, banker, allTheProperty);
					break;
				case 2:
					player.addMoney(ConsoleUI.promptForInt("How much money would you like to add?", -20000, 20000));
				}
			}
			// Board.printMainBoard();
		} while ((diceRoll[0] == diceRoll[1]) && player.isPlayerInJail() == false);

		Board.printMainBoard();
		secondHalfOfTheTurn(player, person);
		// prompt for roll, trade, buy house, sell house, done
		// move player
		// option to buy or if bought have to pay rent
		// trade buy house sell house end turn
	}

	private void secondHalfOfTheTurn(Player player, int person) throws IOException {
		boolean endTurn = false;
		do {
			int otherSelection = -1;
			if(player.getMoney()<0) {
				System.out.println("You can't end your turn with less than $0 or you will be removed from the game \n and all your property will be given to the \n player that you owe money to.");
			}
			
			String[] turnOptions4 = { "End Turn", "Trade", "Buy or Sell houses", "View your properties",
					"Go Bankrupt" };
			printPlayerMoney(playerarray, player, person);
			System.out.println(player.getName() + " would you like to:");
			otherSelection = ConsoleUI.promptForMenuSelection(turnOptions4, false);
			
			switch (otherSelection) {
			case 1:
				endTurn = true;
				break;
			case 2:
				trading();
				break;
			case 3:
				int otherUserSelection = -1;
				String[] otherOptions = { "Buy Houses", "Sell Houses" };
				do {
					otherUserSelection = ConsoleUI.promptForMenuSelection(otherOptions, true);
					switch (otherUserSelection) {
					case 0:
						break;
					case 1:
						buy_Houses();
						printPlayerMoney(playerarray, player, person);
						break;
					case 2:
						sell_Houses();
						printPlayerMoney(playerarray, player, person);
						break;
					}
				} while (otherUserSelection != 0);
				break;
			case 4:
				if (player.lengthOfProperties() > 0) {
					System.out.println("These are your properties " + player.getName());
					for (int i = 0; i < player.lengthOfProperties(); i++) {
						player.printAsciiOwned(i);
					}
				} else if (player.lengthOfProperties() == 0) {
					System.out.println("You currently don't own any properties");
				}
				break;
			case 5:
				removeThisPlayerToBank(player);
				endTurn = true;
				break;
			}
		} while (endTurn == false);
		if(player.getMoney() < 0) {
			PropertyCards card = allTheProperty.PropCards[player.getPlayerPosition()];
			for(int i=0;i<person;i++) {
				if(playerarray[i].ownProperty(card)){
					for(int j=0;j<player.lengthOfProperties();j++) {
							playerarray[i].addPropertyToCollection(card);
					}
				}
			}
			removeThisPlayer(player);
		}
	}
	private void removeThisPlayer(Player player) {
		ArrayList<Player> newSetOfPlayers = new ArrayList<Player>();
		for(int i=0;i<playerarray.length;i++) {
			if(player != playerarray[i]) {
				newSetOfPlayers.add(playerarray[i]);
			}
		}
		Player[] newPlayerArray = new Player[playerarray.length-1];
		newSetOfPlayers.toArray(newPlayerArray);
		playerarray = new Player[newPlayerArray.length];
		playerarray = newPlayerArray;
		
	}
	private void removeThisPlayerToBank(Player player) {
		player.giveAllPropertyToBanker(banker);
		ArrayList<Player> newSetOfPlayers = new ArrayList<Player>();
		for(int i=0;i<playerarray.length;i++) {
			if(player != playerarray[i]) {
				newSetOfPlayers.add(playerarray[i]);
			}
		}
		Player[] newPlayerArray = new Player[playerarray.length-1];
		newSetOfPlayers.toArray(newPlayerArray);
		playerarray = new Player[newPlayerArray.length];
		playerarray = newPlayerArray;
		
	}
 	private boolean win() {
		//rework this
		if(playerarray.length == 1) {
			return true;
		}
		return false;
	}

	private void playerInJailTurn(Player player, int person) throws IOException {
		String[] optionsWCard = {"Pay $50 before rolling", "Roll for doubles", "Use get out of Jail card"}; 
		String[] options = {"Pay $50 before rolling", "Roll for doubles"}; 
		int userSelection = 0;
		if(player.getTurnsInJail() >= 3) {
			System.out.println("You pay $50 to get out of jail.");
			player.addMoney(-50);
			turn(player, person);
		} else {
			if(player.getGetOutOfJailCard() == 0) {
				userSelection = ConsoleUI.promptForMenuSelection(options, false);
			} else if(player.getGetOutOfJailCard() > 0) {
				userSelection = ConsoleUI.promptForMenuSelection(optionsWCard, false);
			}
			switch (userSelection) {
				case 1:
					player.addMoney(-50);
					player.setPlayerInJail(false);
					turn(player, person);
					break;
				case 2:
					int[] jailRoll = roll();
					System.out.println("You rolled: " + jailRoll[0] + " " + jailRoll[1]);
					if(jailRoll[0] == jailRoll[1]) {
						System.out.println("You have escaped jail.");
						player.addPlayerPosition(jailRoll[0] + jailRoll[1]);
						Board.setMainBoard(playerarray, person);
						Board.printMainBoard();
						printPlayerMoney(playerarray, player, person);
						System.out.println();
						PropertyCards card = allTheProperty.PropCards[player.getPlayerPosition()];
						BoardLogic.mainBoardLogic(player, playerarray, card, decks, person, banker, allTheProperty);
						secondHalfOfTheTurn(player, person);
					} else if(jailRoll[0] != jailRoll[1]) {
						secondHalfOfTheTurn(player, person);
						player.addTurnsInJail(1);
					}
					break;
				case 3:
					System.out.println("You use your Get Out of Jail Free card.");
					player.setGetOutOfJailCard(-1);
					turn(player, person);
					break;
			}
		}
		// you must either roll doubles to set jail = false,
		// use "get out of jail free" card,
		// or pay 50 money before rolling the dice.

	}

	private void printPlayerMoney(Player[] Player, Player player, int person) {
		System.out.println("Player's Money:");
		for (int z = 0; z < playerarray.length; z++) {
			System.out.println(playerarray[z].getName() + ": $" + playerarray[z].getMoney());
		}
	}

//	private static void mortgage() {
//		System.out.println("Not implemented yet");
//		// when all houses have been sold, you can mortgage property for money
//		// if players money is in the negatives.
//		// when mortgaged, you cannot get money from players that land on it.
//	}

	private static void trading() throws IOException {
		System.out.println("Not fully implemented yet");
		// can trade with a player for property, with property, money, or get
		// out of jail free cards.
		String[] players = {};
		System.out.println("Which player are you trading with?");
		ConsoleUI.promptForMenuSelection(players, false);
		ConsoleUI.promptForInput("What are you giving?", false);
		ConsoleUI.promptForInput("What are you getting?", false);
	}

	private void sell_Houses() throws IOException {
		System.out.println("Not fully implemented yet");
		int sell = ConsoleUI.promptForInt("How many houses do you wish to sell?", 1, 5);
		switch (sell) {
		case 1:
			// player[i].addMoney(half the cost of one house);
			// player[i].addHouseTotal(-1);
			break;
		case 2:
			// player[i].addMoney(half the cost of two houses);
			// player[i].addHouseTotal(-2);
			break;
		case 3:
			// player[i].addMoney(half the cost of three houses);
			// player[i].addHouseTotal(-3);
			break;
		case 4:
			// player[i].addMoney(half the cost of four houses);
			// player[i].addHouseTotal(-4);
			break;
		case 5:
			// player[i].addMoney(-cost of four houses and hotel);
			break;
		}
	}

	private static void buy_Houses() throws IOException {
		System.out.println("Not implemented yet");
		// when the property is chosen, can add house to property, for money, if
		// you have all corresponding colors.
		int house = ConsoleUI.promptForInt("How many houses do you wish to buy?", 1, 5);

		switch (house) {
		case 1:
			// player[i].addMoney(-cost of one house);
			// player[i].addHouseTotal(1);
			break;
		case 2:
			// player[i].addMoney(-cost of two houses);
			// player[i].addHouseTotal(2);
			break;
		case 3:
			// player[i].addMoney(-cost of three houses);
			// player[i].addHouseTotal(3);
			break;
		case 4:
			// player[i].addMoney(-cost of four houses);
			// player[i].addHouseTotal(4);
			break;
		case 5:
			// player[i].addMoney(-cost of four houses and hotel);
			break;
		}

		// after four houses have been built, remove the houses and put hotel.
	}

	private static int pick_players() throws IOException {
		int person = ConsoleUI.promptForInt("How many players are playing?", 2, 8);
		playerarray = new Player[person];
		ArrayList<String> pieces = new ArrayList<String>(
				Arrays.asList("Thimble", "Wheel Barrel", "Shoe", "Dog", "Car", "Iron", "Hat", "Battleship"));

		for (int i = 0; i < person; i++) {
			playerarray[i] = new Player();
		}

		for (int i = 0; i < person; i++) {
			playerarray[i].setName(ConsoleUI.promptForInput("What is player " + (i + 1) + "'s name?", false));
			System.out.println("Player " + playerarray[i].getName() + ", what is the piece you wish to be?");
			int choose = (ConsoleUI.promptForMenuSelectionWithArrayList(pieces, false) - 1);
			playerarray[i].setPiece(pieces.get(choose));
			System.out.println(playerarray[i].getName() + " has chosen the " + playerarray[i].getPiece() + ".");
			playerarray[i].setStartingMoney();
			pieces.remove(choose);
		}
		return person;
	}

	public int[] roll() {
		Random rando = new Random();
		final int times = 2;
		int[] rolls = new int[times];

		for (int i = 0; i < times; i++) {
			rolls[i] = rando.nextInt(6) + 1;
			// System.out.print(rolls[i] + " ");
		}
		// System.out.println();
		return rolls;
	}

	public int sum(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

}