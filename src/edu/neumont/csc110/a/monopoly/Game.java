package edu.neumont.csc110.a.monopoly;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import edu.neumont.csc110.a.utilities.ConsoleUI;

public class Game {
	static Player[] player = new Player[8];
	
	public void run() throws IOException {
		pick_players();
		//System.out.println("You rolled a " + roll());
	}
	
	private static void chance(){
		//when you land on this space,
		//draw a chance card.
	}
	
	private static void chest(){
		//when you land on this space
		//draw a community chest card
	}
	
	private static void rent(){
		//if someone else owns the property you land on,
		//take the rent from current player, and give it to the owner of the property.
	}
	
	private static void jail(){
		//when player in jail = true, end that players turn,
		//you must either roll doubles to set jail = false,
		//use "get out of jail free" card,
		//or pay 50 money before rolling the dice.
	}
	
	private static void mortgage(){
		//when all houses have been sold, you can mortgage property for money.
		//when mortgaged, you cannot get money from players that land on it.
	}
	
	private static void trading(){
		//can trade with a player for property, with property.
	}
	
	private static void sell_houses(){
		//when the property is chosen, can remove house to get money back.
	}
	
	private static void Buy_houses(){
		//when the property is chosen, can add house to property, for money, if you have all corresponding colors.
		//after four houses have been built, remove the houses and put hotel.
	}
	
	private static void sell_property(){
		//when their isn't any houses on it, it can be sold to other players for a set price.
		//taking money from the buyer and giving it to the seller.
		//giving the property to buyer, from seller.
	}
	
	private static void buy_property(){
		//when bought it will subtract the money from the player,
		//subtract property card from bank,
		//and give the player the property card.
	}
	
	private static void pick_players() throws IOException{
		boolean valid = false;
		int person = ConsoleUI.promptForInt("How many players are playing?", 2, 8);
		ArrayList<Integer> chosen = new ArrayList<Integer>();
		for(int i=0;i<person;i++) {
			player[i] = new Player();
		}
		for(int i=1; i<=person;i++){
			valid = false;
			player[i-1].setName(ConsoleUI.promptForInput("What is player "+i+"'s name?", false));
			System.out.println("Player "+ player[i-1].getName() +", what is the piece you wish to be?");
			String[] pieces = {"Thimble", "Wheel Barrel", "Shoe", "Dog", "Car", "Iron", "Hat", "Battleship"};
			
			while(valid == false){
				int choose = ConsoleUI.promptForMenuSelection(pieces, false);
				boolean temp = chosen.contains(choose); 
				if(temp == false) {
					chosen.add(choose);
					switch(choose){
					case 1:
						System.out.println(player[i-1].getName()+" has chossen the Thimble.");
						player[i-1].setPiece("Thimble");
						valid = true;
						break;
					case 2:
						System.out.println(player[i-1].getName()+" has chossen the Wheel Barrel.");
						player[i-1].setPiece("Wheel Barrel");
						valid = true;
						break;
					case 3:
						System.out.println(player[i-1].getName()+" has chossen the Shoe.");
						player[i-1].setPiece("Shoe");
						valid = true;
						break;
					case 4:
						System.out.println(player[i-1].getName()+" has chossen the Dog.");
						player[i-1].setPiece("Dog");
						valid = true;
						break;
					case 5:
						System.out.println(player[i-1].getName()+" has chossen the Car.");
						player[i-1].setPiece("Car");
						valid = true;
						break;
					case 6:
						System.out.println(player[i-1].getName()+" has chossen the Iron.");
						player[i-1].setPiece("Iron");
						valid = true;
						break;
					case 7:
						System.out.println(player[i-1].getName()+" has chossen the Hat.");
						player[i-1].setPiece("Hat");
						valid = true;
						break;
					case 8:
						System.out.println(player[i-1].getName()+" has chossen the Battleship.");
						player[i-1].setPiece("Battleship");
						valid = true;
						break;
					}
				}
			}
		}
	}
	
	public int roll(){
		Random rando = new Random();
		final int times = 2;
		int[] rolls = new int[times];
		for(int i = 0; i < times; i++){
			rolls[i] = rando.nextInt(6)+1;
			System.out.print(rolls[i] + " ");
		}
		return sum(rolls);
	}
	public static int sum(int[] array){
		int sum = 0;
		for(int i=0; i<array.length; i++){
			sum=sum+array[i];
		}
		return sum;
	}
}