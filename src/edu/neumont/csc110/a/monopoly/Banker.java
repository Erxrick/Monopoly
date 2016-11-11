package edu.neumont.csc110.a.monopoly;
import java.util.ArrayList;

public class Banker {
	BoardTiles bTiles = new BoardTiles();
	private ArrayList<PropertyCards> property;
	
	public void bankinit() {
		property.add(bTiles.Mediterranean_Avenue );
	}
}