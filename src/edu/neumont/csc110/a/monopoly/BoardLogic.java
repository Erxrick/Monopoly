package edu.neumont.csc110.a.monopoly;

import java.io.IOException;

import edu.neumont.csc110.a.utilities.ConsoleUI;

public class BoardLogic {
	
public static void mainBoardLogic(Player player, Player[] Players){
	
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

