package edu.neumont.csc110.a.monopoly;

import java.io.IOException;
import edu.neumont.csc110.a.utilities.ConsoleUI;

public class BoardLogic {
		
	public static void mainBoardLogic(Player player, Player[] Player, PropertyCards card, CommunityChanceText decks, int person, Banker banker) throws IOException{
		if(player.getPlayerPosition() == 7 || player.getPlayerPosition() == 22 || player.getPlayerPosition() == 36) {
			//chance tiles
			decks.chanceText(player, Player);
		} else if(player.getPlayerPosition() == 2 || player.getPlayerPosition() == 17 || player.getPlayerPosition() == 33){
			//community tiles
			decks.communityChestText(player, Player);
		} else {
			purchaseOrRent(card, player, Player, person, banker);
		}
	}
	private static void purchaseOrRent(PropertyCards card, Player player, Player[] Player, int person, Banker banker) throws IOException {
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
	}
	private static void auction(PropertyCards card, Player player, Player[] Player) {
		System.out.println("Not implemented yet");
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
	
	public static void Free_Parking() {
	
		
	}
	
	
	public static void Jail(Player player) {
		
	}
	
	
	public static void Chance() {
		
		
	}
	
	public static void Income_Tax(Player player) throws IOException {
	
	
	
	}
	
	public static void Community_Chest() {
	
		
	}
	
	public static void Go() {
		
		
	}
}

