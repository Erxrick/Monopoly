package edu.neumont.csc110.a.monopoly;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import edu.neumont.csc110.a.utilities.ConsoleUI;

public class CommunityChanceText {
	private int cardnum1;
	private boolean jailCard1;
	private boolean jailCard2;
	private int cardnum2;
	
	ArrayList<Integer> communityChest = new ArrayList<Integer>();
	ArrayList<Integer> chance = new ArrayList<Integer>();

	public void resetBothDecks() {
		resetChanceDeck();
		resetCommunityDeck();
	}
	
	private void resetCommunityDeck() {
		cardnum1 = 0;
		jailCard1 = true;
		communityChest = new ArrayList<Integer>();
		for(int i=0;i<17;i++) {
			Random rng = new Random();

			int number = rng.nextInt(17);
			for(int j=0;j<communityChest.size() || j<17;j++) {
				if(!communityChest.contains(number)) {
					communityChest.add(number);
				} else if(number<16){
					number++;
				}
			}
		}
	}
	private void resetChanceDeck() {
		cardnum2 = 0;
		jailCard2 = true;
		chance = new ArrayList<Integer>();

		for(int i=0;i<17;i++) {
			Random rng = new Random();

			int number = rng.nextInt(17);
			for(int j=0;j<communityChest.size() || j<17;j++) {
				if(!chance.contains(number)) {
					chance.add(number);
				} else if(number<16){
					number++;
				}
			}
		}
	}
	

	public void communityChestText(Player player, Player[] otherPlayers, int person, Banker banker, BoardTiles allTheProperty){
		while(true) {
			int comNum = communityChest.get(cardnum1);
			cardnum1++;
			int temp = 0;
			for(int i=0;i<otherPlayers.length;i++) {
				if(otherPlayers[i].getGetOutOfJailCard1() > 0) {
					temp++;
				}
			}
			if(temp == 0) {
				jailCard1 = true;
			}
			if(comNum == 0 && jailCard1 == true){
				System.out.println("Get Out of Jail Free");
				player.setGetOutOfJailCards1(1);
				jailCard1 = false;
				break;
			
			}
			else if(comNum == 1){
				System.out.println("Doctor's fee—Pay $50");
				player.addMoney(-50);
				break;
				
			}
			else if(comNum == 2){
				System.out.println("From sale of stock you get $50");
				player.addMoney(50);
				break;
				
				
			}
			else if(comNum == 3){
				System.out.println("Grand Opera Night—Collect $50 from every player for opening night seats");
				int transferValue = 0;
				for(int i=0;i<person;i++) {
					if(otherPlayers[i].getMoney() > 0) {
						otherPlayers[i].addMoney(-50);
						transferValue += 50;
					}
				}
				player.addMoney(transferValue);
				break;
			
			}
			else if(comNum == 4){
				System.out.println("Go to Jail–Go directly to jail–Do not pass Go–Do not collect $200");
				player.setPlayerInJail(true);
				player.setPlayerPosition(10);
				player.addMoney(-200);
				break;
			
			}
			else if(comNum == 5){
				System.out.println("Holiday Fund matures—Receive $100");
				player.addMoney(100);
				break;
	
			}
			else if(comNum == 6){
				System.out.println("Income tax refund–Collect $20");
				player.addMoney(20);
				break;
		
			}
			else if(comNum == 7){
				System.out.println("It is your birthday—Collect $10");
				player.addMoney(10);
				break;
				
			}
			else if(comNum == 8){
				System.out.println("Life insurance matures–Collect $100");
				player.addMoney(100);
				break;
			
			}else if(comNum == 9){
				System.out.println("Pay hospital fees of $100");
				player.addMoney(-100);
				break;
			}else if(comNum == 10){
				System.out.println("Pay school fees of $150");
				player.addMoney(-150);
				break;
				
			}else if(comNum == 11){
				System.out.println("Receive $25 consultancy fee");
				player.addMoney(25);
				break;
				
			}else if(comNum == 12){
				System.out.println("You are assessed for street repairs–$40 per house–$115 per hotel");
				player.addMoney(-1 *((player.getHouseTotal() * 40) + (player.getHotelTotal() * 115)));
				break;
				
			}else if(comNum == 13){
				System.out.println("You have won second prize in a beauty contest–Collect $10");
				player.addMoney(10);
				break;
				
			}
			else if(comNum == 14){
				System.out.println("Bank error in your favor—Collect $200");
				player.addMoney(200);
				break;
				
			}
			else if(comNum == 15){
				System.out.println("You inherit 100$");
				player.addMoney(100);
				break;
			
			}
			else if(comNum == 16){
				System.out.println("Advance to Go (Collect $200)");
				player.setPlayerPosition(0);
				break;
			} 
			if(cardnum1 == 17) {
				resetCommunityDeck();
			}
		}
		
	}
		// if Statement Incrementing chaNum after printing text
	public void chanceText(Player player, Player[] otherPlayers, int person, Banker banker, BoardTiles allTheProperty) throws IOException{
		while(true) {
			int chaNum = chance.get(cardnum2);
			cardnum2++;
			int temp = 0;
			for(int i=0;i<otherPlayers.length;i++) {
				if(otherPlayers[i].getGetOutOfJailCard2() > 0) {
					temp++;
				}
			}
			if(temp == 0) {
				jailCard2 = true;
			}
			if(chaNum == 0 && jailCard2 == true){
				System.out.println("Get Out of Jail Free");
				player.setGetOutOfJailCards2(1);
				jailCard2 = false;
				break;
			}
			else if(chaNum == 1){
				System.out.println("Advance to Illinois Ave—If you pass Go, collect $200");
				player.setPlayerPosition(24);
				BoardLogic.purchaseOrRent(allTheProperty.PropCards[player.getPlayerPosition()], player, otherPlayers, otherPlayers.length, banker, allTheProperty, 0);
				break;
			}
			else if(chaNum == 2){
				System.out.println("Advance to St. Charles Place – If you pass Go, collect $200");
				player.setPlayerPosition(11);
				BoardLogic.purchaseOrRent(allTheProperty.PropCards[player.getPlayerPosition()], player, otherPlayers, otherPlayers.length, banker, allTheProperty, 0);
				break;
			}
			else if(chaNum == 3){
				System.out.println("Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown.");
				if(player.getPlayerPosition() > 12 && player.getPlayerPosition() < 28) {
					player.setPlayerPosition(28);
					BoardLogic.purchaseOrRent(allTheProperty.Water_Works, player, otherPlayers, otherPlayers.length, banker, allTheProperty, 0);
				} else if(player.getPlayerPosition() < 12 && player.getPlayerPosition() > 12) {
					player.setPlayerPosition(12);
					BoardLogic.purchaseOrRent(allTheProperty.Water_Works, player, otherPlayers, otherPlayers.length, banker, allTheProperty, 0);
				}
				break;
			}
			else if(chaNum == 4){
				System.out.println("Advance token to the nearest Railroad and pay owner twice the rental to which he/she {he} is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.");
				if(player.getPlayerPosition() < 5 && player.getPlayerPosition() > 35) {
					player.setPlayerPosition(5);
					BoardLogic.purchaseOrRent(allTheProperty.Reading_Railroad, player, otherPlayers, otherPlayers.length, banker, allTheProperty, 0);
				} else if(player.getPlayerPosition() > 5 && player.getPlayerPosition() < 15) {
					player.setPlayerPosition(15);
					BoardLogic.purchaseOrRent(allTheProperty.Pennsylvania_Railroad, player, otherPlayers, otherPlayers.length, banker, allTheProperty, 0);
				} else if(player.getPlayerPosition() > 15 && player.getPlayerPosition() < 25) {
					player.setPlayerPosition(25);
					BoardLogic.purchaseOrRent(allTheProperty.BO_Railroad, player, otherPlayers, otherPlayers.length, banker, allTheProperty, 0);
				} else if(player.getPlayerPosition() > 25 && player.getPlayerPosition() < 35) {
					player.setPlayerPosition(35);
					BoardLogic.purchaseOrRent(allTheProperty.Short_Line, player, otherPlayers, otherPlayers.length, banker, allTheProperty, 0);
				}
				break;
			}
			else if(chaNum == 5){
				System.out.println("Bank pays you dividend of $50");
				player.addMoney(50);
				break;
			}
			else if(chaNum == 6){
				System.out.println("Make general repairs on all your property–For each house pay $25–For each hotel $100");
				player.addMoney(-1 *((player.getHouseTotal() * 25) + (player.getHotelTotal() * 100)));
				
				break;
			}
			else if(chaNum == 7){
				System.out.println("Go Back 3 Spaces");
				player.addPlayerPosition(-3);
				if(player.getPlayerPosition() == 4) {
					System.out.println("Pay Income Tax");
					String[] choice = {"Pay $200", "Pay 10%"};
					int userSelection = ConsoleUI.promptForMenuSelection(choice, false);
					if(userSelection == 1){
						player.addMoney(-200);
					}
					if(userSelection == 2){
						player.addMoney((int)-(player.getMoney() * .1));
					}
				} else if(player.getPlayerPosition() == 33) {
					communityChestText(player, otherPlayers, person, banker, allTheProperty);
				} else {
					BoardLogic.purchaseOrRent(allTheProperty.PropCards[player.getPlayerPosition()], player, otherPlayers, otherPlayers.length, banker, allTheProperty, 0);
				}
				break;
			}
			else if(chaNum == 8){
				System.out.println("Go to Jail–Go directly to Jail–Do not pass Go, do not collect $200");
				player.setPlayerInJail(true);
				player.setPlayerPosition(10);
				player.addMoney(-200);
				break;
			}
			else if(chaNum == 9){
				System.out.println("Pay poor tax of $15");
				player.addMoney(-15);
				
				break;
			}
			else if(chaNum == 10){
				System.out.println("Take a trip to Reading Railroad–If you pass Go, collect $200");				
				player.setPlayerPosition(5);
				BoardLogic.purchaseOrRent(allTheProperty.PropCards[player.getPlayerPosition()], player, otherPlayers, otherPlayers.length, banker, allTheProperty, 0);
				break;
			}
			else if(chaNum == 11){
				System.out.println("Take a walk on the Boardwalk");
				player.setPlayerPosition(39);
				BoardLogic.purchaseOrRent(allTheProperty.PropCards[player.getPlayerPosition()], player, otherPlayers, otherPlayers.length, banker, allTheProperty, 0);
				break;
			}
			else if(chaNum == 12){
				System.out.println("You have been elected Chairman of the Board–Pay each player $50");
				int transferValue = 0;
				for(int i=0;i<person;i++) {
					if(otherPlayers[i].getMoney() > 0) {
						otherPlayers[i].addMoney(50);
						transferValue += 50;
					}
				}
				player.addMoney(transferValue * -1);
				player.addMoney(50);
				break;
			}
			else if(chaNum == 13){
				System.out.println("Your building and loan matures—Collect $150");
				player.addMoney(150);
				break;
			}
			else if(chaNum == 14){
				System.out.println("You have won a crossword competition—Collect $100");
				player.addMoney(100);
				break;
			}
			else if(chaNum == 15){
				System.out.println("Advance to Go (Collect $200)");
				player.setPlayerPosition(0);
				break;
			}
			if(cardnum2 == 16) {
				resetCommunityDeck();
			}
		}
	}
}


