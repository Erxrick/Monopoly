package edu.neumont.csc110.a.monopoly;

import java.io.IOException;
import java.util.Random;

import edu.neumont.csc110.a.utilities.ConsoleUI;

public class BoardLogic {
		
	public static void mainBoardLogic(Player player, Player[] Player, PropertyCards card, CommunityChanceText decks, int person, Banker banker, BoardTiles allTheProperty, int sumOfDiceRoll) throws IOException{
		if(player.getPlayerPosition() == 7 || player.getPlayerPosition() == 22 || player.getPlayerPosition() == 36) {
			//chance tiles
			decks.chanceText(player, Player, person, banker, allTheProperty);
		} else if(player.getPlayerPosition() == 2 || player.getPlayerPosition() == 17 || player.getPlayerPosition() == 33){
			//community tiles
			decks.communityChestText(player, Player, person, banker, allTheProperty);
		} else if(player.getPlayerPosition() == 4) {
			System.out.println("Pay Income Tax");
			String[] choice = {"Pay $200", "Pay 10%"};
			int userSelection = ConsoleUI.promptForMenuSelection(choice, false);
			if(userSelection == 1){
				player.addMoney(-200);
			}
			if(userSelection == 2){
				player.addMoney((int)-(player.getMoney() * .1));
			}
		} else if(player.getPlayerPosition() == 10) {
			System.out.println("You are visiting jail.");
		} else if(player.getPlayerPosition() == 20) {
			System.out.println("You at free parking.");
		} else if(player.getPlayerPosition() == 30) {
			System.out.println("Go to jail. Go directly to jail. Do not pass Go. Do not collect $200.");
			player.setPlayerInJail(true);
			player.addMoney(-200);
		} else if(player.getPlayerPosition() == 38) {
			System.out.println("Pay Luxury Tax of $75.");
			player.addMoney(-75);
		} else {
			purchaseOrRent(card, player, Player, person, banker, allTheProperty, sumOfDiceRoll);
		}
	}
	public static void purchaseOrRent(PropertyCards card, Player player, Player[] Player, int person, Banker banker, BoardTiles allTheProperty, int sumOfDiceRoll) throws IOException {
		fullSet(player, allTheProperty);
		if(card.isBought() == true) {
			if(player.getPlayerPosition() == 12 || player.getPlayerPosition() == 28) {
				if(sumOfDiceRoll == 0) {
					int num = sum(roll());
					System.out.println("You rolled " + num + ".");
					for(int i=0;i<Player.length;i++) {
						if((player.getPlayerPosition() == 12 && Player[i].ownProperty(allTheProperty.Water_Works)) || (player.getPlayerPosition() == 28 &&Player[i].ownProperty(allTheProperty.Water_Works))) {
							System.out.println(player.getName() + " you have to pay $" + (num * 10) + " to " + Player[i].getName());
							player.addMoney(-10 * num);
						}
					}
				} else {
					for(int i=0;i<Player.length;i++) {
						if(Player[i].ownProperty(allTheProperty.Water_Works) && Player[i].ownProperty(allTheProperty.Electric_Company)) {
							System.out.println(player.getName() + " you have to pay $" + (sumOfDiceRoll * 10) + " to " + Player[i].getName());
							player.addMoney(-10 * sumOfDiceRoll);
						} else {
							System.out.println(player.getName() + " you have to pay $" + (sumOfDiceRoll * 4) + " to " + Player[i].getName());
							player.addMoney(-4 * sumOfDiceRoll);
						}
					}
				}
			} else if(player.getPlayerPosition() == 5 || player.getPlayerPosition() == 15 || player.getPlayerPosition() == 25 || player.getPlayerPosition() == 35) {
				if(sumOfDiceRoll == 0) {
					for(int i=0;i<Player.length;i++) {
							if((player.getPlayerPosition() == 5 && Player[i].ownProperty(allTheProperty.Reading_Railroad)) || (player.getPlayerPosition() == 15 && Player[i].ownProperty(allTheProperty.Pennsylvania_Railroad)) || (player.getPlayerPosition() == 25 && Player[i].ownProperty(allTheProperty.BO_Railroad)) || (player.getPlayerPosition() == 35 && Player[i].ownProperty(allTheProperty.Short_Line))) {
								System.out.println(player.getName() + " you have to pay $" + (allTheProperty.Reading_Railroad.getRentRailRoad(player.getNumberOfRailRoads(allTheProperty)) * 2) + " to " + Player[i].getName());
								player.addMoney(-2 * allTheProperty.Reading_Railroad.getRentRailRoad(player.getNumberOfRailRoads(allTheProperty)));
							}
					}
				} else {
					for(int i=0;i<Player.length;i++) {
						if((player.getPlayerPosition() == 5 && Player[i].ownProperty(allTheProperty.Reading_Railroad)) || (player.getPlayerPosition() == 15 && Player[i].ownProperty(allTheProperty.Pennsylvania_Railroad)) || (player.getPlayerPosition() == 25 && Player[i].ownProperty(allTheProperty.BO_Railroad)) || (player.getPlayerPosition() == 35 && Player[i].ownProperty(allTheProperty.Short_Line))) {
							System.out.println(player.getName() + " you have to pay $" + (allTheProperty.Reading_Railroad.getRentRailRoad(player.getNumberOfRailRoads(allTheProperty))) + " to " + Player[i].getName());
							player.addMoney(allTheProperty.Reading_Railroad.getRentRailRoad(player.getNumberOfRailRoads(allTheProperty)));
						}
					}
				}
			}else {
				for(int i=0;i<person;i++) {
					if(Player[i].ownProperty(card)){
						if(player.getMoney() > card.getPropertyRentWhenLandedOn()) {
							if(card.isFullSet() && card.getHouse() == 0) {
								System.out.println("You pay $" + (card.getPropertyRentWhenLandedOn() * 2) + " to " + Player[i].getName());
							} else {
								System.out.println("You pay $" + card.getPropertyRentWhenLandedOn() + " to " + Player[i].getName());
							}
							Player[i].addMoney(card.getPropertyRentWhenLandedOn());
						} else {
							//add removing the player's property when they cant mortgage anymore
						}
					}
				}
				player.addMoney(card.getPropertyRentWhenLandedOn() * -1);
			}
		} else {
			//this is where its bought
			card.printCardAscii();
			System.out.println("This card costs: " + card.getPrice());
			System.out.println(player.getName() + " would you like to:");
			String[] buyOptions = {"Buy this property", "Auction this Property"};
			int buy = ConsoleUI.promptForMenuSelection(buyOptions, false);
			switch(buy) {
//				case 0:
//					break;
				case 1:
					if(player.getMoney() > card.getPrice()) {
						player.buyFromBanker(card, banker);
						break;
					} else {
						System.out.println("You cannot afford " + card.getName());
					}
				case 2:
					auction(card, player, Player);
					break;
			}
		}	
	}
	private static void auction(PropertyCards card, Player player, Player[] Player) throws IOException {
		System.out.println("The bidding for " + card.getName() + " will start at $1.");
		int minimumBid = 0;
		for(int i=0;i<Player.length;i++) {
			Player[i].setBidding(true);
		}
		boolean loop = true;
		boolean buyer = false;
		while(loop) {
			int amountOfBidders = 0;
			for(int i=0;i<Player.length;i++) {
			//	if(buyer = false) {
					if(Player[i].getStillBidding() == true && Player[i].getMoney() > minimumBid) {	
						boolean choice = ConsoleUI.promptForBool(Player[i].getName() + " would you like to bid on " + card.getName() + "? (yes/no)", "yes", "no");
						if(choice) {
							System.out.println("How much would you like to bid?");
							minimumBid = ConsoleUI.promptForInt("The minimun bid is " + (minimumBid + 1), minimumBid, Player[i].getMoney());
							amountOfBidders++;
						} else {
							Player[i].setBidding(false);
						}
					} else {
						Player[i].setBidding(false);
					}
			//	}
			}
			if(amountOfBidders == 1) {
				loop = false;
				buyer = true;
			} else if(amountOfBidders == 0) {
				System.out.println("No one won the auction.");
				loop = false;
			}
		}
		if(buyer = true) {
			for(int i=0;i<Player.length;i++) {
				if(Player[i].getStillBidding() == true) {
					System.out.println(Player[i].getName() + " you have bought " + card.getName() + " for $" + minimumBid);
					Player[i].addMoney(-1 * minimumBid);
					Player[i].addPropertyToCollection(card);
				}
			}
		}
	}
	public static void Luxury_Tax(Player player) {
		player.addMoney(-75);	
	}
	
	
	public static void fullSet(Player player, BoardTiles allTheProperty){
		
		if(player.ownProperty(allTheProperty.Mediterranean_Avenue) && player.ownProperty(allTheProperty.Baltic_Avenue)){
			allTheProperty.Mediterranean_Avenue.setFullSet(true);
			allTheProperty.Baltic_Avenue.setFullSet(true);
		}
			else{
				allTheProperty.Mediterranean_Avenue.setFullSet(false);
				allTheProperty.Baltic_Avenue.setFullSet(false);
			}
		if(player.ownProperty(allTheProperty.Connecticut_Avenue) && player.ownProperty(allTheProperty.Oriental_Avenue) && player.ownProperty(allTheProperty.Vermont_Avenue)){
			allTheProperty.Connecticut_Avenue.setFullSet(true);
			allTheProperty.Oriental_Avenue.setFullSet(true);
			allTheProperty.Vermont_Avenue.setFullSet(true);
		}
			else{
				allTheProperty.Connecticut_Avenue.setFullSet(false);
				allTheProperty.Oriental_Avenue.setFullSet(false);
				allTheProperty.Vermont_Avenue.setFullSet(false);
			}
		if(player.ownProperty(allTheProperty.StCharles_Place) && player.ownProperty(allTheProperty.States_Avenue) && player.ownProperty(allTheProperty.Virginia_Avenue)){
			allTheProperty.StCharles_Place.setFullSet(true);
			allTheProperty.States_Avenue.setFullSet(true);
			allTheProperty.Virginia_Avenue.setFullSet(true);
		}
			else{
				allTheProperty.StCharles_Place.setFullSet(false);
				allTheProperty.States_Avenue.setFullSet(false);
				allTheProperty.Virginia_Avenue.setFullSet(false);
			}
		
		if(player.ownProperty(allTheProperty.StJames_Place) && player.ownProperty(allTheProperty.Tennessee_Avenue) && player.ownProperty(allTheProperty.New_York_Avenue)){
			allTheProperty.StJames_Place.setFullSet(true);
			allTheProperty.Tennessee_Avenue.setFullSet(true);
			allTheProperty.New_York_Avenue.setFullSet(true);
		}
			else{
				allTheProperty.StJames_Place.setFullSet(false);
				allTheProperty.Tennessee_Avenue.setFullSet(false);
				allTheProperty.New_York_Avenue.setFullSet(false);
			}
		if(player.ownProperty(allTheProperty.Kentucky_Avenue) && player.ownProperty(allTheProperty.Indiana_Avenue) && player.ownProperty(allTheProperty.Illinois_Avenue)){
			allTheProperty.Kentucky_Avenue.setFullSet(true);
			allTheProperty.Indiana_Avenue.setFullSet(true);
			allTheProperty.Illinois_Avenue.setFullSet(true);
		}
			else{
				allTheProperty.Kentucky_Avenue.setFullSet(false);
				allTheProperty.Indiana_Avenue.setFullSet(false);
				allTheProperty.Illinois_Avenue.setFullSet(false);
			
		}
		if(player.ownProperty(allTheProperty.Atlantic_Avenue) && player.ownProperty(allTheProperty.Ventor_Avenue) && player.ownProperty(allTheProperty.Marvin_Gardens)){
			allTheProperty.Ventor_Avenue.setFullSet(true);
			allTheProperty.Atlantic_Avenue.setFullSet(true);
			allTheProperty.Marvin_Gardens.setFullSet(true);
		}
			else{
				allTheProperty.Ventor_Avenue.setFullSet(false);
				allTheProperty.Atlantic_Avenue.setFullSet(false);
				allTheProperty.Marvin_Gardens.setFullSet(false);
		}
		if(player.ownProperty(allTheProperty.Pacific_Avenue) && player.ownProperty(allTheProperty.North_Carolina_Avenue) && player.ownProperty(allTheProperty.Pennslvania_Avenue)){
			allTheProperty.Pacific_Avenue.setFullSet(true);
			allTheProperty.North_Carolina_Avenue.setFullSet(true);
			allTheProperty.Pennslvania_Avenue.setFullSet(true);
		}
			else{
				allTheProperty.Pacific_Avenue.setFullSet(false);
				allTheProperty.North_Carolina_Avenue.setFullSet(false);	
				allTheProperty.Pennslvania_Avenue.setFullSet(false);
		}
		if(player.ownProperty(allTheProperty.Park_Place) && player.ownProperty(allTheProperty.Boardwalk)){
			allTheProperty.Boardwalk.setFullSet(true);
			allTheProperty.Park_Place.setFullSet(true);
			
		} 
			else{
				allTheProperty.Boardwalk.setFullSet(false);
				allTheProperty.Park_Place.setFullSet(false);	
		}
	}
	
	
	
	
	public static void Chance() {
		
		
	}
	

	
	public static void Community_Chest() {
	
		
	}
	
	public static void Go() {
		
		
	}
	public static int[] roll() {
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


	public static int sum(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
}

