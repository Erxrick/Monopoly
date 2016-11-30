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
		for (int i = 0; i < person; i++) {
			System.out.println(playerarray[i].getName() + " roll to determine turn order.");
			ConsoleUI.promptForInput("", true);
			playerarray[i].setTurnOrderRoll(sum(roll()));
			System.out.println(playerarray[i].getName() + " rolled: " + playerarray[i].getTurnOrderRoll());
		}
		for (int i = 0; i < person; i++) {
			playerOrderRolls[i] = playerarray[i].getTurnOrderRoll();
		}
		Arrays.sort(playerOrderRolls, Collections.reverseOrder());
		// Arrays.sort(playerOrderRolls);

		for (int i = 0; i < person; i++) {
			int temper = 0;
			for (int j = 0; j < person; j++) {
				if (playerOrderRolls[i] == playerarray[j].getTurnOrderRoll()) {
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
			String[] turnOptions = { "Roll the die", "Trade", "Property Management", "View your properties", "Debug" };
			int userSelection = ConsoleUI.promptForMenuSelection(turnOptions, false);

			switch (userSelection) {
			case 1:
				diceRoll = roll();
				sumOfDiceRoll = sum(diceRoll);
				timesRolled++;
				player.addPlayerPosition(sumOfDiceRoll);
				// sumOfDiceRoll = 0;
				Board.setMainBoard(playerarray, person);
				Board.printMainBoard();
				printPlayerMoney(playerarray, player, person);
				System.out.println(player.getName() + ", you rolled: ");
				for (int i = 0; i < 2; i++) {
					System.out.print(diceRoll[i] + " ");
				}
				System.out.println();
				PropertyCards card = allTheProperty.PropCards[player.getPlayerPosition()];

				BoardLogic.mainBoardLogic(player, playerarray, card, decks, playerarray.length, banker, allTheProperty,
						sumOfDiceRoll);
				sumOfDiceRoll = 0;
				// System.out.println("You rolled a " + roll());

				if (timesRolled == 3 && diceRoll[0] == diceRoll[1]) {
					player.setPlayerInJail(true);
					// move player to jail
					// make jail turn
				}
				break;
			case 2:

				trading(player, person);

				printPlayerMoney(playerarray, player, person);
				break;
			case 3:
				int otherUserSelection = -1;
				String[] otherOptions = { "Buy Houses", "Sell Houses", "Mortgage" };
				do {
					otherUserSelection = ConsoleUI.promptForMenuSelection(otherOptions, true);
					switch (otherUserSelection) {
					case 0:
						break;
					case 1:

						buy_Houses(player);
						printPlayerMoney(playerarray, player, person);
						break;
					case 2:

						sell_Houses(player);
						printPlayerMoney(playerarray, player, person);
						break;
					case 3:
						mortgageChoice(player);
						printPlayerMoney(playerarray, player, person);
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

					BoardLogic.mainBoardLogic(player, playerarray, debugcard, decks, person, banker, allTheProperty, 0);
					break;
				case 2:
					player.addMoney(ConsoleUI.promptForInt("How much money would you like to add?", -20000, 20000));
				}
			}
			// Board.printMainBoard();
		} while ((diceRoll[0] == diceRoll[1]) && player.isPlayerInJail() == false);
		System.out.println();
		// Board.printMainBoard();
		secondHalfOfTheTurn(player, person);
	}

	private void secondHalfOfTheTurn(Player player, int person) throws IOException {
		boolean endTurn = false;
		do {
			int otherSelection = -1;
			if (player.getMoney() < 0) {
				System.out.println(
						"You can't end your turn with less than $0 or you will be removed from the game \n and all your property will be given to the \n player that you owe money to.");
			}

			String[] turnOptions4 = { "End Turn", "Trade", "Property Management", "View your properties",
					"Go Bankrupt" };

			printPlayerMoney(playerarray, player, person);
			System.out.println(player.getName() + " would you like to:");
			otherSelection = ConsoleUI.promptForMenuSelection(turnOptions4, false);
			switch (otherSelection) {
			case 1:
				endTurn = true;
				break;
			case 2:

				trading(player, person);
				break;
			case 3:
				int otherUserSelection = -1;
				String[] otherOptions = { "Buy Houses", "Sell Houses", "Mortgage" };
				do {
					otherUserSelection = ConsoleUI.promptForMenuSelection(otherOptions, true);
					switch (otherUserSelection) {
					case 0:
						break;
					case 1:

						buy_Houses(player);
						printPlayerMoney(playerarray, player, person);
						break;
					case 2:

						sell_Houses(player);
						printPlayerMoney(playerarray, player, person);
						break;
					case 3:
						mortgageChoice(player);
						printPlayerMoney(playerarray, player, person);
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
		if (player.getMoney() < 0) {
			if (allTheProperty.PropCards[player.getPlayerPosition()].isBought() == true) {
				PropertyCards card = allTheProperty.PropCards[player.getPlayerPosition()];
				for (int i = 0; i < person; i++) {
					if (playerarray[i].ownProperty(card)) {
						for (int j = 0; j < player.lengthOfProperties(); j++) {
							playerarray[i].addPropertyToCollection(player.getProperty().get(j));
						}
					}
				}
				removeThisPlayer(player);
			} else {
				removeThisPlayerToBank(player);
			}
		}
	}

	private void mortgageChoice(Player player) throws IOException {
		int temp = 1;
		if (player.anythingMortgaged() == true) {
			temp = 2;
		}
		String[] options = new String[temp];
		if (player.anythingMortgaged() == true) {
			options[0] = "Mortgage";
			options[1] = "Unmortgage";
		} else {
			options[0] = "Mortgage";
		}
		switch (ConsoleUI.promptForMenuSelection(options, true)) {
		case 0:
			break;
		case 1:
			mortgage(player);
			break;
		case 2:
			unmortgage(player);
			break;
		}
	}

	private void removeThisPlayer(Player player) {
		ArrayList<Player> newSetOfPlayers = new ArrayList<Player>();
		for (int i = 0; i < playerarray.length; i++) {
			if (player != playerarray[i]) {
				newSetOfPlayers.add(playerarray[i]);
			}
		}

		// for(int i=0;i<newSetOfPlayers.size();i++) {
		// if(newSetOfPlayers.get(i).ownProperty(allTheProperty.PropCards[player.getPlayerPosition()]))
		// {
		// for(int j=0;j<player.getProperty().size();j++) {
		// newSetOfPlayers.get(i).addPropertyToCollection(player.getProperty().get(j));
		// }
		// }
		// }

		Player[] newPlayerArray = new Player[playerarray.length - 1];
		newSetOfPlayers.toArray(newPlayerArray);
		playerarray = new Player[newPlayerArray.length];
		playerarray = newPlayerArray;

	}

	private void removeThisPlayerToBank(Player player) {
		player.giveAllPropertyToBanker(banker);
		ArrayList<Player> newSetOfPlayers = new ArrayList<Player>();
		for (int i = 0; i < playerarray.length; i++) {
			if (player != playerarray[i]) {
				newSetOfPlayers.add(playerarray[i]);
			}
		}
		Player[] newPlayerArray = new Player[playerarray.length - 1];
		newSetOfPlayers.toArray(newPlayerArray);
		playerarray = new Player[newPlayerArray.length];
		playerarray = newPlayerArray;

	}

	private boolean win() {
		// rework this
		if (playerarray.length == 1) {
			return true;
		}
		return false;
	}

	private void playerInJailTurn(Player player, int person) throws IOException {
		System.out.println(player.getName() + " you are in jail.");
		String[] optionsWCard = { "Pay $50 before rolling", "Roll for doubles", "Trading", "Property Management",
				"Use get out of Jail card" };
		String[] options = { "Pay $50 before rolling", "Roll for doubles", "Trading", "Property Management" };
		int userSelection = 0;

		if (player.getTurnsInJail() >= 3) {
			if (player.getMoney() > 49) {
				System.out.println("You pay $50 to get out of jail.");
				player.addMoney(-50);
				player.setPlayerInJail(false);
				player.setTurnsInJail(0);
				turn(player, person);
			} else {
				removeThisPlayerToBank(player);
			}
		} else {
			boolean loopBreaker = false;
			while (loopBreaker == false) {
				if (player.getGetOutOfJailCard() == 0) {
					userSelection = ConsoleUI.promptForMenuSelection(options, false);
				} else if (player.getGetOutOfJailCard() > 0) {
					userSelection = ConsoleUI.promptForMenuSelection(optionsWCard, false);
				}
				switch (userSelection) {
				case 1:
					if (player.getMoney() > 49) {
						player.addMoney(-50);
						player.setPlayerInJail(false);
						player.setTurnsInJail(0);
						turn(player, person);
						loopBreaker = true;
					} else {
						System.out.println(player.getName() + " you do not have enough money.");
					}
					break;
				case 2:
					int[] jailRoll = roll();
					System.out.println("You rolled: " + jailRoll[0] + " " + jailRoll[1]);
					if (jailRoll[0] == jailRoll[1]) {
						System.out.println("You have escaped jail.");
						player.setPlayerInJail(false);
						player.addPlayerPosition(jailRoll[0] + jailRoll[1]);
						Board.setMainBoard(playerarray, person);
						Board.printMainBoard();
						printPlayerMoney(playerarray, player, person);
						System.out.println();
						PropertyCards card = allTheProperty.PropCards[player.getPlayerPosition()];
						BoardLogic.mainBoardLogic(player, playerarray, card, decks, person, banker, allTheProperty,
								sum(jailRoll));
						player.setTurnsInJail(0);
						secondHalfOfTheTurn(player, person);
					} else if (jailRoll[0] != jailRoll[1]) {
						secondHalfOfTheTurn(player, person);
						player.addTurnsInJail(1);
					}
					loopBreaker = true;
					break;
				case 3:
					trading(player, playerarray.length);
					break;
				case 4:
					mortgageChoice(player);
					break;
				case 5:
					System.out.println("You use your Get Out of Jail Free card.");
					player.setPlayerInJail(false);
					if (player.getGetOutOfJailCard1() > 0) {
						player.setGetOutOfJailCards1(-1);
					} else {
						player.setGetOutOfJailCards2(-1);
					}
					player.setTurnsInJail(0);
					turn(player, person);
					loopBreaker = true;
					break;
				}
			}
		}
	}

	private void printPlayerMoney(Player[] Player, Player player, int person) {
		System.out.println("Player's Money:");

		for (int z = 0; z < playerarray.length; z++) {
			System.out.println(playerarray[z].getName() + ": $" + playerarray[z].getMoney());
		}
	}

	private void unmortgage(Player player) throws IOException {
		// // when all houses have been sold, you can mortgage property for
		// money
		// if ()
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < player.getProperty().size(); i++) {
			if (player.getProperty().get(i).isIsmortgaged() == true) {
				temp.add(i);
			}
		}
		for (int i = 0; i < temp.size(); i++) {
			System.out.println(i + ": " + player.getProperty().get(temp.get(i)).getName());
		}
		int userSelection = ConsoleUI.promptForInt("Select a property to unmortgage", 0, temp.size());
		int pay2Unmortgage = player.getProperty().get(temp.get(userSelection)).getUnMortgage();
		player.getProperty().get(temp.get(userSelection)).setIsmortgaged(false);
		player.addMoney(-pay2Unmortgage);
	}

	private void mortgage(Player player) throws IOException {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		boolean canMortgage = false;
		for (int i = 0; i < player.getProperty().size(); i++) {
			if (player.getProperty().get(i).isIsmortgaged() == false) {
				temp.add(i);
				canMortgage = true;
			}
		}
		if (canMortgage = true) {
			for (int i = 0; i < temp.size(); i++) {
				System.out.println(i + ": " + player.getProperty().get(temp.get(i)).getName());
			}
			int userSelection = ConsoleUI.promptForInt("Select a property to mortgage", 0, temp.size());
			int pay2mortgage = player.getProperty().get(temp.get(userSelection)).getMortgage();
			player.getProperty().get(temp.get(userSelection)).setIsmortgaged(true);
			player.addMoney(pay2mortgage);
		} else {
			System.out.println("Sorry, you have nothing to trade.");
		}
	}

	// }
	// // if players money is in the negatives.
	// // when mortgaged, you cannot get money from players that land on it.

	private static void trading(Player player, int person) throws IOException {
		// can trade with a player for property, with property, money, or get
		// out of jail free cards.
		ArrayList<String> playerList = new ArrayList<String>();
		for (int i = 0; i < playerarray.length; i++) {
			playerList.add(playerarray[i].getName());
		}
		System.out.println("Who are you trading with?");
		boolean cont = false;
		int playerNum = -1;
		do {
			playerNum = ConsoleUI.promptForMenuSelectionWithArrayList(playerList, false) - 1;
			if (playerarray[playerNum].getName().equals(player.getName())) {
				System.out.println("Sorry you can't trade with yourself!");
				cont = true;
			} else {
				cont = false;
			}
		} while (cont == true);
		System.out.println("At any time other than deciding the value of money traded, you may enter 0 to quit.");
		if (playerNum < 8 && playerNum >= 0) {
			ArrayList<PropertyCards> currentPlayerProperty = player.getProperty();
			ArrayList<PropertyCards> tradingPlayerProperty = playerarray[playerNum].getProperty();
			System.out.println("YOUR ITEMS");
			System.out.println();
			System.out.println("[1]Money: " + player.getMoney());
			System.out.println("[2]Get out of Jail free cards: " + player.getGetOutOfJailCard());
			int playerLength = currentPlayerProperty.size();
			if (playerLength != 0) {
				for (int i = 3; i < playerLength + 3; i++) {
					System.out.print("[" + i + "]" + currentPlayerProperty.get(i - 3).getName() + " - ");
				}
			}
			System.out.println();
			System.out.println();
			System.out.println("THEIR ITEMS");
			System.out.println();
			System.out.println("[1]Money: " + playerarray[playerNum].getMoney());
			System.out.println("[2]Get out of Jail free cards: " + playerarray[playerNum].getGetOutOfJailCard());
			int player2Length = tradingPlayerProperty.size();
			if (player2Length != 0) {
				for (int i = 3; i < player2Length + 3; i++) {
					System.out.print("[" + i + "]" + tradingPlayerProperty.get(i - 3).getName() + " - ");
				}
			}
			System.out.println();
			int tradeSelectionGive = 0;
			int tradeSelectionGet = 0;
			boolean cont2 = true;
			boolean cont3 = true;
			do {
				tradeSelectionGive = ConsoleUI.promptForInt("What are you giving?", 0,
						currentPlayerProperty.size() + 3);
				if(tradeSelectionGive == 0) {
					return;
				}
				if (tradeSelectionGive == 2 && player.getGetOutOfJailCard() == 0) {
					System.out.println("Sorry, you don't have any GOOJF cards!");
					cont2 = true;
				} else {
					cont2 = false;
				}
			} while (cont2);
			
			do {
				tradeSelectionGet = ConsoleUI.promptForInt("What are you getting?", 0,
						tradingPlayerProperty.size() + 3);
				if(tradeSelectionGet == 0) {
					return;
				}
				if (tradeSelectionGet == 2 && playerarray[playerNum].getGetOutOfJailCard() == 0) {
					System.out.println("Sorry they don't have any GOOJF cards!");
					cont3 = true;
				} else if(tradeSelectionGive == 1){
					System.out.println("You can't trade money for money!");
					cont3 = true;
				} else {
					cont3 = false;
				}
			} while (cont3);

			int amountMoneyTraded = 0;
			if (tradeSelectionGive == 1 && player.getMoney() > 0) {
				amountMoneyTraded = ConsoleUI.promptForInt("How much are you giving to the player?", 1,
						player.getMoney());
			}
			if (tradeSelectionGet == 1 && playerarray[playerNum].getMoney() > 0) {
				amountMoneyTraded = ConsoleUI.promptForInt("How much are you getting from the player?", 1,
						playerarray[playerNum].getMoney());
			}
			String prompt = "Player " + playerarray[playerNum].getName()
					+ ", are you certain you agree to this trade? (Yes/No)";
			boolean confirmation = ConsoleUI.promptForBool(prompt, "Yes", "No");
			if (confirmation) {
				boolean invalidTrade = false;
				if (tradeSelectionGive == 1) {
					player.addMoney(-amountMoneyTraded);
					playerarray[playerNum].addMoney(amountMoneyTraded);
				} else if (tradeSelectionGive == 2) {
					if (player.getGetOutOfJailCard() > 0) {
						if (player.getGetOutOfJailCard1() > 0) {
							player.setGetOutOfJailCards1(-1);
							playerarray[playerNum].setGetOutOfJailCards1(1);
						} else {
							player.setGetOutOfJailCards2(-1);
							playerarray[playerNum].setGetOutOfJailCards2(1);
						}
						// player.setGetOutOfJailCards(-1);
						// this is the old one beefore shufflng
						// playerarray[playerNum].setGetOutOfJailCards(1);

					} else {
						invalidTrade = true;
						System.out.println("Sorry you can't have negative jail cards!");
					}

				} else {
					PropertyCards card = player.removeProperty(tradeSelectionGive);
					playerarray[playerNum].addProperty(card);
				}
				if (tradeSelectionGet == 1 && invalidTrade != true) {
					player.addMoney(amountMoneyTraded);
					playerarray[playerNum].addMoney(-amountMoneyTraded);
				} else if (tradeSelectionGive == 2 && invalidTrade != true) {
					if (playerarray[playerNum].getGetOutOfJailCard() > 0) {
						if (playerarray[playerNum].getGetOutOfJailCard1() > 0) {
							player.setGetOutOfJailCards1(1);
							playerarray[playerNum].setGetOutOfJailCards1(-1);
						} else {
							player.setGetOutOfJailCards2(1);
							playerarray[playerNum].setGetOutOfJailCards2(-1);
						}
						// playerarray[playerNum].setGetOutOfJailCards(-1);
						// player.setGetOutOfJailCards(1);
						// old stuff before shuffling
					} else {
						invalidTrade = true;
						System.out.println("Sorry you can't have negative jail cards!");
					}

				} else {
					PropertyCards card2 = playerarray[playerNum].removeProperty(tradeSelectionGet);
					// tradingPlayerProperty[tradeSelectionGet];
					player.addProperty(card2);
				}
			} else {
				System.out.println(playerarray[playerNum].getName() + " did not want to trade.");
			}
		}
	}

	private void sell_Houses(Player player) throws IOException {
		BoardLogic.fullSet(player, allTheProperty);

		ArrayList<Integer> temp = new ArrayList<Integer>();
		if (player.getAbleToDoHouseStuff() == true) {
			for (int i = 0; i < player.getProperty().size(); i++) {
				if (player.getProperty().get(i).getHouse() > 0) {
					temp.add(i);
				}
			}
			for (int i = 0; i < temp.size(); i++) {
				System.out.println(i + ": " + player.getProperty().get(temp.get(i)).getName());
			}
			int userSelection = ConsoleUI.promptForInt("Select a property to subtract a house from", 0, temp.size());
			player.getProperty().get(temp.get(userSelection)).addHouse(-1);
			player.addMoney((int) (player.getProperty().get(temp.get(userSelection)).getHouseCost() * .5));
		}
	}

	private void buy_Houses(Player player) throws IOException {
		BoardLogic.fullSet(player, allTheProperty);

		ArrayList<Integer> temp = new ArrayList<Integer>();
		if (player.getAbleToDoHouseStuff() == true) {
			for (int i = 0; i < player.getProperty().size(); i++) {
				if (player.getProperty().get(i).isFullSet() == true && player.getProperty().get(i).getHouse() < 6) {
					temp.add(i);
				}
			}
			for (int i = 0; i < temp.size(); i++) {
				System.out.println(i + ": " + player.getProperty().get(temp.get(i)).getName());
			}
			int userSelection = ConsoleUI.promptForInt("Select a property to add a house to", 0, temp.size());
			player.getProperty().get(temp.get(userSelection)).addHouse(1);
			player.addMoney(-(player.getProperty().get(temp.get(userSelection)).getHouseCost()));
		}
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