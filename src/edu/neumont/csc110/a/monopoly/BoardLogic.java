package edu.neumont.csc110.a.monopoly;

import java.io.IOException;
import edu.neumont.csc110.a.utilities.ConsoleUI;

public class BoardLogic {
		
	public static void mainBoardLogic(Player player, Player[] Player, PropertyCards card, CommunityChanceText decks, int person, Banker banker) throws IOException{
		if(player.getPlayerPosition() == 7 || player.getPlayerPosition() == 22 || player.getPlayerPosition() == 36) {
			//chance tiles
			decks.chanceText(player, Player, person);
		} else if(player.getPlayerPosition() == 2 || player.getPlayerPosition() == 17 || player.getPlayerPosition() == 33){
			//community tiles
			decks.communityChestText(player, Player, person);
		} else if(player.getPlayerPosition() == 10) {
			System.out.println("You are visiting jail.");
		} else if(player.getPlayerPosition() == 20) {
			System.out.println("You at free parking.");
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
		} else if(player.getPlayerPosition() == 30) {
			System.out.println("Go to jail. Go directly to jail. Do not pass Go. Do not collect $200.");
		} else if(player.getPlayerPosition() == 38) {
			System.out.println("Pay Luxury Tax of $75.");
			player.addMoney(-75);
		} else {
			purchaseOrRent(card, player, Player, person, banker);
		}
	}
	private static void purchaseOrRent(PropertyCards card, Player player, Player[] Player, int person, Banker banker) throws IOException {
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
			card.printCardAscii();
			System.out.println("This card costs: " + card.getPrice());
			System.out.println("Would you like to:");
			String[] buyOptions = {"Buy this property", "Auction this Property"};
			int buy = ConsoleUI.promptForMenuSelection(buyOptions, false);
			switch(buy) {
//				case 0:
//					break;
				case 1:
					player.buyFromBanker(card, banker);
					break;
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
		while(true) {
			int amountOfBidders = 0;
			for(int i=0;i<Player.length;i++) {
				if(Player[i].getStillBidding() == true && Player[i].getMoney() > minimumBid) {	
					//System.out.println(Player[i].getName() + " would you like to bid");
					boolean choice = ConsoleUI.promptForBool(Player[i].getName() + " would you like to bid on " + card.getName() + "?", "yes", "no");
					if(choice) {
						System.out.println("How much would you like to bid?");
//						System.out.println("The minimun bid is " + minimumBid);
						minimumBid = ConsoleUI.promptForInt("The minimun bid is " + (minimumBid + 1), minimumBid, Player[i].getMoney());
						amountOfBidders++;
					} else {
						Player[i].setBidding(false);
					}
				} else {
					Player[i].setBidding(false);
				}
			}
			if(amountOfBidders == 1) {
				break;
			}
		}
		for(int i=0;i<Player.length;i++) {
			if(Player[i].getStillBidding() == true) {
				System.out.println(Player[i].getName() + " you have bought " + card.getName() + " for $" + minimumBid);
				Player[i].addMoney(-1 * minimumBid);
			}
		}
	}
	public static void Luxury_Tax(Player player) {
		player.addMoney(-75);	
	}
	
	public static void Go_To_Jail(Player player) {
		player.setPlayerInJail(true);
		player.setPlayerPosition(10);
		//Only needed if player passing go gives them 200$
		player.addMoney(-200);
	}
	
	public static void fullSet(Player player){
		
	}
	
	
	
	
	public static void Chance() {
		
		
	}
	

	
	public static void Community_Chest() {
	
		
	}
	
	public static void Go() {
		
		
	}
}

