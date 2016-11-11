package edu.neumont.csc110.a.monopoly;
import java.io.IOException;

public class PlayMonopoly {
	public static void main(String[] args) throws IOException {
		//CommunityChanceText decks = new CommunityChanceText();
		Game play = new Game();
		play.run();
	}
}