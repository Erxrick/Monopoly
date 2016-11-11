package edu.neumont.csc110.a.monopoly;

public class BoardTiles {
	PropertyCards Mediterranean_Avenue = new PropertyCards();
	PropertyCards Baltic_Avenue = new PropertyCards();
	PropertyCards Oriental_Avenue = new PropertyCards();
	PropertyCards Connecticut_Avenue = new PropertyCards();
	PropertyCards StCharles_Place = new PropertyCards();
	PropertyCards States_Avenue = new PropertyCards();
	PropertyCards Virginia_Avenue = new PropertyCards();
	PropertyCards StJames_Place = new PropertyCards();
	PropertyCards Tennessee_Avenue = new PropertyCards();
	PropertyCards New_York_Avenue = new PropertyCards();
	PropertyCards Kentucky_Avenue = new PropertyCards();
	PropertyCards Indiana_Avenue = new PropertyCards();
	PropertyCards Illinois_Avenue = new PropertyCards();
	PropertyCards Atlantic_Avenue = new PropertyCards();
	PropertyCards Ventor_Avenue = new PropertyCards();
	PropertyCards Marvin_Gardens = new PropertyCards();
	PropertyCards Pacific_Avenue = new PropertyCards();
	PropertyCards North_Carolina_Avenue = new PropertyCards();
	PropertyCards Pennslvania_Avenue = new PropertyCards();
	PropertyCards Park_Place = new PropertyCards();
	PropertyCards Boardwalk = new PropertyCards();
	PropertyCards Reading_Railroad = new PropertyCards();
	PropertyCards Pennsylvania_Railroad = new PropertyCards();
	PropertyCards BO_Railroad = new PropertyCards();
	PropertyCards Short_Line = new PropertyCards();
	PropertyCards Electric_Company = new PropertyCards();
	PropertyCards Water_Works = new PropertyCards();

	public void init() {
		
		//ArrayList<PropertyCards> bankerProperty = new ArrayList<PropertyCards>();
		
		Boardwalk.setRent(1);
		Boardwalk.setName("Boardwalk");
		Boardwalk.setColor(PropertyType.darkBlue);
		Boardwalk.setPrice(1);
		Boardwalk.setHouse(0);
		Boardwalk.setRent(1);
		Boardwalk.setRentH1(1);
		Boardwalk.setRentH2(1);
		Boardwalk.setRentH3(1);
		Boardwalk.setRentH4(1);
		Boardwalk.setRentH5(1);
		Boardwalk.setHouseCost(1);
		Boardwalk.setMortgage(1);
	}	
}