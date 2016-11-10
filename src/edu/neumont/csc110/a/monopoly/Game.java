package edu.neumont.csc110.a.monopoly;
import java.util.Random;

public class Game {

	public void run() {
		System.out.println("Test");
		System.out.println("You rolled a " + roll());
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
