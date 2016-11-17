package edu.neumont.csc110.a.monopoly;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import edu.neumont.csc110.a.utilities.ConsoleUI;

public class Game {
	static Player[] player = new Player[8];
	CommunityChanceText decks = new CommunityChanceText();
	BoardTiles allTheProperty = new BoardTiles();
	static Banker banker = new Banker();
	
	
	public void run() throws IOException {
		int person = pick_players();
		intitializeTheGame();
		boolean anyoneWin = false;
		for (int j = 0; j < person; j++) {
				player[j].addPlayerPosition(0);
				Board.setMainBoard(player, person);
		}
		//Board.printMainBoard();
		while (!anyoneWin) {
			for (int i = 0; i < person; i++) {
					if(player[i].isPlayerInJail() == true) {
						Board.printMainBoard();
						playerInJailTurn(player[i]);
					} else {
						Board.printMainBoard();
						turn(player[i], player, person);
					}
				anyoneWin = win(player[i]);
			}
		}

		// System.out.println("You rolled a " + roll());
	}

	private void intitializeTheGame() throws IOException {
		decks.resetBothDecks();
		allTheProperty.init();
		banker.bankinit(allTheProperty);

	}

	private void turn(Player player, Player[] Player, int person) throws IOException {
		int[] diceRoll = new int[2];
		int sumOfDiceRoll = 0;
		int timesRolled = 0;

		do {
			System.out.println(player.getName() + " would you like to:");
			String[] turnOptions = { "Roll the die", "Trade", "Buy or Sell houses", "View your properties" };
			int userSelection = ConsoleUI.promptForMenuSelection(turnOptions, false);

			switch (userSelection) {
			case 1:
				diceRoll = roll();
				sumOfDiceRoll = sum(diceRoll);
				timesRolled++;
				player.addPlayerPosition(sumOfDiceRoll);
				sumOfDiceRoll = 0;
				Board.setMainBoard(Player, person);
				Board.printMainBoard();
				System.out.println("You rolled: ");
				for (int i = 0; i < 2; i++) {
					System.out.print(diceRoll[i] + " ");
				}
				System.out.println();
				PropertyCards card = allTheProperty.PropCards[player.getPlayerPosition()];
				BoardLogic.mainBoardLogic(player, Player, card, decks, person, banker);
				// System.out.println("You rolled a " + roll());
				if (timesRolled == 3) {
					player.setPlayerInJail(true);
					// move player to jail
					// make jail turn
				}
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
						break;
					case 2:
						sell_Houses();
						break;
					}

				} while (otherUserSelection != 0);
				break;
			case 4:
				if(player.lengthOfProperties()>0) {
					System.out.println("These are your properties " + player.getName());
					for(int i=0;i<player.lengthOfProperties();i++) {
						player.printAsciiOwned(i);
					} 
				}else if(player.lengthOfProperties() == 0) {
					System.out.println("You currently don't own any properties");
				}
				break;
			}
			Board.printMainBoard();
		} while ((diceRoll[0] == diceRoll[1]) && player.isPlayerInJail() == false);
		
		
		boolean endTurn = false;
		do {
			int otherSelection = -1;
			String[] turnOptions4 = { "End Turn", "Trade", "Buy or Sell houses", "View your properties", "Go Bankrupt" };
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
							break;
						case 2:
							sell_Houses();
							break;
						}
				} while (otherUserSelection != 0);
				break;
			case 4:
				if(player.lengthOfProperties()>0) {
					System.out.println("These are your properties " + player.getName());
					for(int i=0;i<player.lengthOfProperties();i++) {
						player.printAsciiOwned(i);
					} 
				}else if(player.lengthOfProperties() == 0) {
					System.out.println("You currently don't own any properties");
				}
				break;
			case 5:
				endTurn = true;
				break;
			}
		} while (endTurn == false);
		// prompt for roll, trade, buy house, sell house, done
		// move player
		// option to buy or if bought have to pay rent
		// trade buy house sell house end turn
	}

	private boolean win(Player player) {
		//needs to be made still
		return false;
	}

	private void playerInJailTurn(Player player) {
		// you must either roll doubles to set jail = false,
		// use "get out of jail free" card,
		// or pay 50 money before rolling the dice.
	
	}

	private void chanceORChest() {
		/*
		 * if(player[i].getPlayerPosition() = BoardLogic.Chance()){
		 * CommunityChanceText.chanceText(player, player); 
		 * }else if(player[i].getPlayerPosition() = BoardLogic.Community_Chest()){
		 * CommunityChanceText.communityChestText(player, player); }
		 */
	}
	

	private static void mortgage() {
		// when all houses have been sold, you can mortgage property for money
		// if players money is in the negatives.
		// when mortgaged, you cannot get money from players that land on it.
	}

	private static void trading() throws IOException {
		// can trade with a player for property, with property, money, or get
		// out of jail free cards.
		String[] players = {};
		System.out.println("Which player are you trading with?");
		ConsoleUI.promptForMenuSelection(players, false);
		ConsoleUI.promptForInput("What are you giving?", false);
		ConsoleUI.promptForInput("What are you getting?", false);
	}

		
	private void sell_Houses() throws IOException {
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

	private static void buy_property() throws IOException {
		// when bought it will subtract the money from the player,

		boolean buy = ConsoleUI.promptForBool("Will you buy this property(y/n)", "y", "n");

		if (buy == true) {
			// player[i].buyFromBanker(card, bank);
			// player[i].addMoney(-Price);
		} else {
			System.out.println("That is your choice.");
		}

		// subtract property card from bank,
		// and give the player the property card.
	}

	private static int pick_players() throws IOException {
		int person = ConsoleUI.promptForInt("How many players are playing?", 2, 8);
		ArrayList<String> pieces = new ArrayList<String>(Arrays.asList("Thimble", "Wheel Barrel", "Shoe", "Dog", "Car", "Iron", "Hat", "Battleship"));

		for (int i = 0; i < person; i++) {
			player[i] = new Player();
		}

		for (int i = 0; i < person; i++) {
			player[i].setName(ConsoleUI.promptForInput("What is player " + (i+1) + "'s name?", false));
			System.out.println("Player " + player[i].getName() + ", what is the piece you wish to be?");
			int choose = (ConsoleUI.promptForMenuSelectionWithArrayList(pieces, false) - 1);
			player[i].setPiece(pieces.get(choose));
			System.out.println(player[i].getName() + " has chosen the " + player[i].getPiece() + ".");
			player[i].setStartingMoney();
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
			//System.out.print(rolls[i] + " ");
		}
		//System.out.println();
		return rolls;
	}

	public static int sum(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

}