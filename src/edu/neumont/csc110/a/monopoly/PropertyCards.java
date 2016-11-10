package edu.neumont.csc110.a.monopoly;

import edu.neumont.csc110.a.utilities.PropertyType;

public class PropertyCards {
	private String name;
	private PropertyType color;
	private int price;
	private int house;
	public int rent;
	private int rentH1;
	private int rentH2;
	private int rentH3;
	private int rentH4;
	private int rentH5;
	private int houseCost;
	private int mortgage;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getHouse() {
		return house;
	}
	public void setHouse(int house) {
		this.house = house;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getRentH1() {
		return rentH1;
	}
	public void setRentH1(int rentH1) {
		this.rentH1 = rentH1;
	}
	public int getRentH2() {
		return rentH2;
	}
	public void setRentH2(int rentH2) {
		this.rentH2 = rentH2;
	}
	public int getRentH3() {
		return rentH3;
	}
	public void setRentH3(int rentH3) {
		this.rentH3 = rentH3;
	}
	public int getRentH4() {
		return rentH4;
	}
	public void setRentH4(int rentH4) {
		this.rentH4 = rentH4;
	}
	public int getRentH5() {
		return rentH5;
	}
	public void setRentH5(int rentH5) {
		this.rentH5 = rentH5;
	}
	public int getHouseCost() {
		return houseCost;
	}
	public void setHouseCost(int houseCost) {
		this.houseCost = houseCost;
	}
	public int getMortgage() {
		return mortgage;
	}
	public void setMortgage(int mortgage) {
		this.mortgage = mortgage;
	}
	public void setColor(PropertyType color) {
		this.color = color;
	}
	public PropertyType getColor() {
		return color;
	}
	
}
