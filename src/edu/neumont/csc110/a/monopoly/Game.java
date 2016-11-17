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
				player[j].setPlayerPosition(0);
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
		banker.bankinit();

	}

	private void turn(Player player, Player[] Player, int person) throws IOException {
		int[] diceRoll = new int[2];
		int sumOfDiceRoll = 0;
		int timesRolled = 0;

		do {
			System.out.println(player.getName() + " would you like to:");
			String[] turnOptions = { "Roll the die", "Trade", "Buy or Sell houses" };
			int userSelection = ConsoleUI.promptForMenuSelection(turnOptions, false);

			switch (userSelection) {
			case 1:
				diceRoll = roll();
				sumOfDiceRoll = sum(diceRoll);
				timesRolled++;
				player.setPlayerPosition((player.getPlayerPosition() + sumOfDiceRoll));
				Board.setMainBoard(Player, person);
				Board.printMainBoard();
				PropertyCards card = allTheProperty.PropCards[player.getPlayerPosition()];
				if(player.getPlayerPosition() == 7 || player.getPlayerPosition() == 22 || player.getPlayerPosition() == 36) {
					//chance tiles
					decks.chanceText(player, Player);
				} else if(player.getPlayerPosition() == 2 || player.getPlayerPosition() == 17 || player.getPlayerPosition() == 33){
					//community tiles
					decks.communityChestText(player, Player);
				} else {
					purchaseOrRent(card, player, Player, person);
				}
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
			}
			Board.printMainBoard();
		} while ((diceRoll[0] == diceRoll[1]) && player.isPlayerInJail() == false);
		
		
		boolean endTurn = false;
		do {
			int otherSelection = -1;
			String[] turnOptions3 = { "End Turn", "Trade", "Buy or Sell houses" };
			String[] turnOptions4 = { "End Turn", "Trade", "Buy or Sell houses", "Go Bankrupt" };
			if (player.getMoney() < 0) {
				otherSelection = ConsoleUI.promptForMenuSelection(turnOptions3, false);
			} else {
				otherSelection = ConsoleUI.promptForMenuSelection(turnOptions4, false);
			}
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

	private static void purchaseOrRent(PropertyCards card, Player player, Player[] Player, int person) throws IOException {
		//idk if this is being built elsewhere, but feel free to let me know if it is that way I can rework it
		
		
		if(card.isBought() == true) {
			for(int i=0;i<person;i++) {
				if(Player[i].ownProperty(card)){
					System.out.println("You pay $" + card.getPropertyRentWhenLandedOn() + " to " + Player[i].getName());
					Player[i].addMoney(card.getPropertyRentWhenLandedOn());
				}
			}
			player.addMoney(card.getPropertyRentWhenLandedOn() * -1);
		} else {
			//this is where its bought
			System.out.println("Would you like to:");
			String[] buyOptions = {"Buy this property", "Auction this Property"};
			int buy = ConsoleUI.promptForMenuSelection(buyOptions, true);
			switch(buy) {
				case 0:
					break;
				case 1:
					player.buyFromBanker(card, banker);
					break;
				case 2:
					auction(card, player, Player);
					break;
			}
		}
		
		
		//sorry jasper
		
		/*
		 * if(player is on Mediterranean_Avenue){
		 * Mediterranean_Avenue.getRent(); subtract money from current player
		 * and add it to owner. }else if(player is on Baltic_Avenue){
		 * Baltic_Avenue.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on Oriental_Avenue){
		 * Oriental_Avenue.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on Vermont_Avenue){
		 * Vermont_Avenue.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on Connecticut_Avenue){
		 * Connecticut_Avenue.getRent(); subtract money from current player and
		 * add it to owner. }else if(player is on StCharles_Place){
		 * StCharles_Place.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on States_Avenue){
		 * States_Avenue.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on Virginia_Avenue){
		 * Virginia_Avenue.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on StJames_Place){
		 * StJames_Place.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on Tennessee_Avenue){
		 * Tennessee_Avenue.getRent(); subtract money from current player and
		 * add it to owner. }else if(player is on New_York_Avenue){
		 * New_York_Avenue.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on Kentucky_Avenue){
		 * Kentucky_Avenue.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on Indiana_Avenue){
		 * Indiana_Avenue.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on Illinois_Avenue){
		 * Illinois_Avenue.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on Atlantic_Avenue){
		 * Atlantic_Avenue.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on Ventor_Avenue){
		 * Ventor_Avenue.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on Marvin_Gardens){
		 * Marvin_Gardens.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on Pacific_Avenue){
		 * Pacific_Avenue.getRent(); subtract money from current player and add
		 * it to owner. }else if(player is on North_Carolina_Avenue){
		 * North_Carolina_Avenue.getRent(); subtract money from current player
		 * and add it to owner. }else if(player is on Pennslvania_Avenue){
		 * Pennslvania_Avenue.getRent(); subtract money from current player and
		 * add it to owner. }else if(player is on Park_Place){
		 * Park_Place.getRent(); subtract money from current player and add it
		 * to owner. }else if(player is on Boardwalk){ Boardwalk.getRent();
		 * subtract money from current player and add it to owner. }else
		 * if(player is on Reading_Railroad){ Reading_Railroad.getRent();
		 * subtract money from current player and add it to owner. }else
		 * if(player is on Pennsylvania_Railroad){
		 * Pennsylvania_Railroad.getRent(); subtract money from current player
		 * and add it to owner. }else if(player is on BO_Railroad){
		 * BO_Railroad.getRent(); subtract money from current player and add it
		 * to owner. }else if(player is on Short_Line){ Short_Line.getRent();
		 * subtract money from current player and add it to owner. }else
		 * if(player is on Electric_Company){ Electric_Company.getRent();
		 * subtract money from current player and add it to owner. }else
		 * if(player is on Water_Works){ Water_Works.getRent(); subtract money
		 * from current player and add it to owner. }
		 */
	}

	private static void auction(PropertyCards card, Player player, Player[] Player) {
		System.out.println("Not implemented yet");
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
			System.out.print(rolls[i] + " ");
		}
		System.out.println();
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