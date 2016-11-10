package edu.neumont.csc110.a.monopoly;

import java.util.ArrayList;
import java.util.Random;

public class CommunityChanceText {
	
	ArrayList<Integer> communityChest = new ArrayList<Integer>();
	ArrayList<Integer> chance = new ArrayList<Integer>();
	
	public void resetDeck() {
		communityChest = new ArrayList<Integer>();
		for(int i=0;i<16;i++) {
			Random rng = new Random();
			int number = rng.nextInt(16);
			for(int j=0;j<communityChest.size() || j<16;j++) {
				if(!communityChest.contains(number)) {
					communityChest.add(number);
				} else if(number<16){
					number++;
				}
			}
		}
		chance = new ArrayList<Integer>();
		for(int i=0;i<16;i++) {
			Random rng = new Random();
			int number = rng.nextInt(16);
			for(int j=0;j<communityChest.size() || j<16;j++) {
				if(!chance.contains(number)) {
					chance.add(number);
				} else if(number<16){
					number++;
				}
			}
		}
	}
	
	public void communityChestText(){
		int comNum = 0;
		if(comNum == 0){
			System.out.println("Advance to Go (Collect $200)");
			comNum++;
		}
		else if(comNum == 1){
			System.out.println("Doctor's fee—Pay $50");
			comNum++;
		}
		else if(comNum == 2){
			System.out.println("From sale of stock you get $50");
			comNum++;
			
		}
		else if(comNum == 3){
			System.out.println("Get Out of Jail Free");
			comNum++;
		}
		else if(comNum == 4){
			System.out.println("Go to Jail–Go directly to jail–Do not pass Go–Do not collect $200");
			comNum++;
		}
		else if(comNum == 5){
			System.out.println("Holiday Fund matures—Receive $100");
			comNum++;
		}
		else if(comNum == 6){
			System.out.println("Income tax refund–Collect $20");
			comNum++;
		}
		else if(comNum == 7){
			System.out.println("It is your birthday—Collect $10");
			comNum++;
		}
		else if(comNum == 8){
			System.out.println("Life insurance matures–Collect $100");
			comNum++;
		}else if(comNum == 9){
			System.out.println("Pay hospital fees of $100");
			comNum++;
		}else if(comNum == 10){
			System.out.println("Pay school fees of $150");
			comNum++;
		}else if(comNum == 11){
			System.out.println("Receive $25 consultancy fee");
			comNum++;
		}else if(comNum == 12){
			System.out.println("You are assessed for street repairs–$40 per house–$115 per hotel");
			comNum++;
		}else if(comNum == 13){
			System.out.println("You have won second prize in a beauty contest–Collect $10");
			comNum++;
		}
		else if(comNum == 14){
			System.out.println("Bank error in your favor—Collect $200");
			comNum++;
		}
		else if(comNum == 15){
			System.out.println("It is your birthday—Collect $10");
			comNum++;
		}
		else if(comNum == 16){
			System.out.println("Grand Opera Night—Collect $50 from every player for opening night seats");
			comNum = 0;
		}
		
		
		
		
	}
		// if Statement Incrementing chaNum after printing text
	public void chanceText(){
		int chaNum = 0;
		if(chaNum == 0){
			System.out.println("Advance to Go (Collect $200)");
			chaNum++;
		}
		else if(chaNum == 1){
			System.out.println("Advance to Illinois Ave—If you pass Go, collect $200");
			chaNum++;
		}
		else if(chaNum == 2){
			System.out.println("Advance to St. Charles Place – If you pass Go, collect $200");
			chaNum++;
		}
		else if(chaNum == 3){
			System.out.println("Advance token to nearest Utility. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total ten times the amount thrown.");
			chaNum++;
		}
		else if(chaNum == 4){
			System.out.println("Advance token to the nearest Railroad and pay owner twice the rental to which he/she {he} is otherwise entitled. If Railroad is unowned, you may buy it from the Bank.");
			chaNum++;
		}
		else if(chaNum == 5){
			System.out.println("Bank pays you dividend of $50");
			chaNum++;
		}
		else if(chaNum == 6){
			System.out.println("Get Out of Jail Free");
			chaNum++;
		}
		else if(chaNum == 7){
			System.out.println("Go Back 3 Spaces");
			chaNum++;
		}
		else if(chaNum == 8){
			System.out.println("Go to Jail–Go directly to Jail–Do not pass Go, do not collect $200");
			chaNum++;
		}
		else if(chaNum == 9){
			System.out.println("Pay poor tax of $15");
			chaNum++;
		}
		else if(chaNum == 10){
			System.out.println("Take a trip to Reading Railroad–If you pass Go, collect $200");
			chaNum++;
		}
		else if(chaNum == 11){
			System.out.println("Take a walk on the Boardwalk–Advance token to Boardwalk");
			chaNum++;
		}
		else if(chaNum == 12){
			System.out.println("You have been elected Chairman of the Board–Pay each player $50");
			chaNum++;
		}
		else if(chaNum == 13){
			System.out.println("Your building and loan matures—Collect $150");
			chaNum++;
		}
		else if(chaNum == 14){
			System.out.println("You have won a crossword competition—Collect $100");
			chaNum++;
		}
		else if(chaNum == 15){
			System.out.println("Make general repairs on all your property–For each house pay $25–For each hotel $100");
			chaNum = 0;
		}
	}
}


