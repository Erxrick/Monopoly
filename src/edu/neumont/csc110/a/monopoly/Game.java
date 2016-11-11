package edu.neumont.csc110.a.monopoly;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Game {
	static Player[] player = new Player[8];
	
	public void run() throws IOException {
		pick_players();
		//System.out.println("You rolled a " + roll());
	}
	
	public static void pick_players() throws IOException{
		edu.neumont.csc110.a.utilities.ConsoleUI inputui = new edu.neumont.csc110.a.utilities.ConsoleUI();
		boolean valid = false;
		int person = inputui.promptForInt("How many players are playing?", 2, 8);
		ArrayList<Integer> chosen = new ArrayList<Integer>();
		for(int i=0;i<person;i++) {
			player[i] = new Player();
		}
		for(int i=1; i<=person;i++){
			valid = false;
			player[i-1].setName(inputui.promptForInput("What is player "+i+"'s name?", false));
			System.out.println("Player "+ player[i-1].getName() +", what is the piece you wish to be?");
			String[] pieces = {"Thimble", "Wheel Barrel", "Shoe", "Dog", "Car", "Iron", "Hat", "Battleship"};
			
			while(valid == false){
				int choose = inputui.promptForMenuSelection(pieces, false);
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