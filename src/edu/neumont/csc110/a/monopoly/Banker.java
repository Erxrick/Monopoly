package edu.neumont.csc110.a.monopoly;
import java.util.ArrayList;

public class Banker {
	//BoardTiles bTiles = new BoardTiles();
	private ArrayList<PropertyCards> property;
	
	public void bankinit(BoardTiles allTheProperty) {
		property = new ArrayList<PropertyCards>();
		property.add(allTheProperty.Mediterranean_Avenue);
		property.add(allTheProperty.Baltic_Avenue);
		property.add(allTheProperty.Oriental_Avenue);
		property.add(allTheProperty.Vermont_Avenue);
		property.add(allTheProperty.Connecticut_Avenue);
		property.add(allTheProperty.StCharles_Place);
		property.add(allTheProperty.States_Avenue);
		property.add(allTheProperty.Virginia_Avenue);
		property.add(allTheProperty.StJames_Place);
		property.add(allTheProperty.Tennessee_Avenue);
		property.add(allTheProperty.New_York_Avenue);
		property.add(allTheProperty.Kentucky_Avenue);
		property.add(allTheProperty.Indiana_Avenue);
		property.add(allTheProperty.Illinois_Avenue);
		property.add(allTheProperty.Atlantic_Avenue);
		property.add(allTheProperty.Ventor_Avenue);
		property.add(allTheProperty.Marvin_Gardens);
		property.add(allTheProperty.Pacific_Avenue);
		property.add(allTheProperty.North_Carolina_Avenue);
		property.add(allTheProperty.Pennslvania_Avenue);
		property.add(allTheProperty.Park_Place);
		property.add(allTheProperty.Boardwalk);
		property.add(allTheProperty.Reading_Railroad);
		property.add(allTheProperty.Pennsylvania_Railroad);
		property.add(allTheProperty.BO_Railroad);
		property.add(allTheProperty.Short_Line);
		property.add(allTheProperty.Electric_Company);
		property.add(allTheProperty.Water_Works);
	}
	public void removeCard(PropertyCards card) {
		int index = this.property.indexOf(card);
		this.property.remove(index);
	}
}