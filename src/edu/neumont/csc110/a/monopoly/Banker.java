package edu.neumont.csc110.a.monopoly;

import java.util.ArrayList;

public class Banker {
	BoardTiles bTiles = new BoardTiles();
	private ArrayList<PropertyCards> property;
	
	public void bankinit() {
		property.add(bTiles.Mediterranean_Avenue);
		property.add(bTiles.Baltic_Avenue);
		property.add(bTiles.Oriental_Avenue);
		property.add(bTiles.Vermont_Avenue);
		property.add(bTiles.Connecticut_Avenue);
		property.add(bTiles.StCharles_Place);
		property.add(bTiles.States_Avenue);
		property.add(bTiles.Virginia_Avenue);
		property.add(bTiles.StJames_Place);
		property.add(bTiles.Tennessee_Avenue);
		property.add(bTiles.New_York_Avenue);
		property.add(bTiles.Kentucky_Avenue);
		property.add(bTiles.Indiana_Avenue);
		property.add(bTiles.Illinois_Avenue);
		property.add(bTiles.Atlantic_Avenue);
		property.add(bTiles.Ventor_Avenue);
		property.add(bTiles.Marvin_Gardens);
		property.add(bTiles.Pacific_Avenue);
		property.add(bTiles.North_Carolina_Avenue);
		property.add(bTiles.Pennslvania_Avenue);
		property.add(bTiles.Park_Place);
		property.add(bTiles.Boardwalk);
		property.add(bTiles.Reading_Railroad);
		property.add(bTiles.Pennsylvania_Railroad);
		property.add(bTiles.BO_Railroad);
		property.add(bTiles.Short_Line);
		property.add(bTiles.Electric_Company);
		property.add(bTiles.Water_Works);
	}
}
