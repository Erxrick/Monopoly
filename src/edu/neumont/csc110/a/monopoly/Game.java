package edu.neumont.csc110.a.monopoly;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import edu.neumont.csc110.a.utilities.ConsoleUI;

public class Game {
	static Player[] player = new Player[8];
	CommunityChanceText decks = new CommunityChanceText();
	BoardTiles allTheProperty = new BoardTiles();

	public void run() throws IOException {
		int person = pick_players();
		intitializeTheGame();
		boolean anyoneWin = false;
		for (int j = 0; j < person; j++) {
			Board.printMainBoard(player[j]);
		}
		while (!anyoneWin) {
			for (int i = 0; i < person; i++) {
				if (player[i].isPlayerInJail()) {
					Board.printMainBoard(player[i]);
					playerInJailTurn(player[i]);
				} else {
					Board.printMainBoard(player[i]);
					turn(player[i]);
				}

				anyoneWin = win(player[i]);
			}
		}

		// System.out.println("You rolled a " + roll());
	}

	private void intitializeTheGame() throws IOException {
		decks.resetBothDecks();
		allTheProperty.init();

	}

	private void turn(Player player) throws IOException {
		int diceRoll = 0;

		do {
			System.out.println(player.getName() + " would you like to:");
			String[] turnOptions = { "Roll the die", "Trade", "Buy or Sell houses" };
			int userSelection = ConsoleUI.promptForMenuSelection(turnOptions, false);

			switch (userSelection) {
			case 1:
				diceRoll = roll();
				// System.out.println("You rolled a " + roll());
				if (diceRoll == 0) {
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

		} while (diceRoll == 0 && player.isPlayerInJail() == true);
		Board.moveFromDice(diceRoll, player);

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
		return true;
	}

	private void playerInJailTurn(Player player) {

	}

	private void chanceORChest() {
		/*
		 * if(player[i].getPlayerPosition() = BoardLogic.Chance()){
		 * CommunityChanceText.chanceText(player, player); 
		 * }else if(player[i].getPlayerPosition() = BoardLogic.Community_Chest()){
		 * CommunityChanceText.communityChestText(player, player); }
		 */
	}

	private static void rent() {
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

	private static void jail() {
		// if(Player.setPlayerInJail == true){

		// }
		// you must either roll doubles to set jail = false,
		// use "get out of jail free" card,
		// or pay 50 money before rolling the dice.
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

	private static void sell_Houses() throws IOException {
		// when the property is chosen, can remove house to get money back.
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
		boolean valid = false;
		int person = ConsoleUI.promptForInt("How many players are playing?", 2, 8);
		ArrayList<Integer> chosen = new ArrayList<Integer>();

		for (int i = 0; i < person; i++) {
			player[i] = new Player();
		}

		for (int i = 1; i <= person; i++) {
			valid = false;

			player[i - 1].setName(ConsoleUI.promptForInput("What is player " + i + "'s name?", false));
			System.out.println("Player " + player[i - 1].getName() + ", what is the piece you wish to be?");
			String[] pieces = { "Thimble", "Wheel Barrel", "Shoe", "Dog", "Car", "Iron", "Hat", "Battleship" };

			while (valid == false) {
				int choose = ConsoleUI.promptForMenuSelection(pieces, false);

				boolean temp = chosen.contains(choose);
				if (temp == false) {
					chosen.add(choose);

					switch (choose) {
					case 1:

						System.out.println(player[i - 1].getName() + " has chosen the Thimble.");
						player[i - 1].setPiece("Thimble");
						player[i - 1].addMoney(1500);
						valid = true;
						break;
					case 2:

						System.out.println(player[i - 1].getName() + " has chosen the Wheel Barrel.");
						player[i - 1].setPiece("Wheel Barrel");
						player[i - 1].addMoney(1500);
						valid = true;
						break;
					case 3:

						System.out.println(player[i - 1].getName() + " has chosen the Shoe.");
						player[i - 1].setPiece("Shoe");
						player[i - 1].addMoney(1500);
						valid = true;
						break;
					case 4:

						System.out.println(player[i - 1].getName() + " has chosen the Dog.");
						player[i - 1].setPiece("Dog");
						player[i - 1].addMoney(1500);
						valid = true;
						break;
					case 5:

						System.out.println(player[i - 1].getName() + " has chosen the Car.");
						player[i - 1].setPiece("Car");
						player[i - 1].addMoney(1500);
						valid = true;
						break;
					case 6:

						System.out.println(player[i - 1].getName() + " has chosen the Iron.");
						player[i - 1].setPiece("Iron");
						player[i - 1].addMoney(1500);
						valid = true;
						break;
					case 7:

						System.out.println(player[i - 1].getName() + " has chosen the Hat.");
						player[i - 1].setPiece("Hat");
						player[i - 1].addMoney(1500);
						valid = true;
						break;
					case 8:

						System.out.println(player[i - 1].getName() + " has chosen the Battleship.");
						player[i - 1].setPiece("Battleship");
						player[i - 1].addMoney(1500);
						valid = true;
						break;
					}
				}
			}
		}
		return person;
	}

	public int roll() {
		Random rando = new Random();
		final int times = 2;

		int[] rolls1 = new int[times];
		int[] rolls2 = new int[times];
		int[] rolls3 = new int[times];

		for (int i = 0; i < times; i++) {
			rolls1[i] = rando.nextInt(6) + 1;
			System.out.print(rolls1[i] + " ");
		}

		if (rolls1[0] == rolls1[1]) {
			for (int i = 0; i < times; i++) {
				rolls1[i] = rando.nextInt(6) + 1;
				System.out.print(rolls2[i] + " ");
			}

		} else {
			rolls2[0] = 0;
			rolls2[1] = 0;
		}

		if (rolls2[0] == rolls2[1] && rolls2[1] != 0) {
			for (int i = 0; i < times; i++) {
				rolls3[i] = rando.nextInt(6) + 1;
				System.out.print(rolls3[i] + " ");
			}
		} else {
			rolls3[0] = 0;
			rolls3[1] = 0;
		}

		if (rolls3[0] == rolls3[1] && rolls3[1] != 0) {
			return 0;
		}
		return sum(rolls1, rolls2, rolls3);
	}

	public static int sum(int[] array, int[] array1, int[] array2) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		for (int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}

		for (int i = 0; i < array2.length; i++) {
			sum = sum + array2[i];
		}
		return sum;
	}
}