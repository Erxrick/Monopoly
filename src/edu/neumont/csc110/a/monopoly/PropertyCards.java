package edu.neumont.csc110.a.monopoly;

import edu.neumont.csc110.a.utilities.PropertyType;

public class PropertyCards {
	private String name;
	private PropertyType color;
	private int price;
	private int house;
	private int rent;
	private int rentH1;
	private int rentH2;
	private int rentH3;
	private int rentH4;
	private int rentH5;
	private int houseCost;
	private int mortgage;
	private int unmortgage;
	private int railRoadNum;
	private boolean tradeable;
	private boolean ismortgaged;
	private boolean isBought;
	private boolean fullSet;
	private char[][] ascii;
	
	public void setcardAscii(char[][] Ascii) {
		this.ascii = Ascii;
	}
	public void printCardAscii() {
		for(int i=0;i<this.ascii.length;i++) {
			//System.out.print(this.ascii[i]);
			for(int j=0;j<this.ascii[i].length;j++) {
				System.out.print(this.ascii[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isBought() {
		return isBought;
	}
	public void setBought(boolean isBought) {
		this.isBought = isBought;
	}
	public boolean isIsmortgaged() {
		return ismortgaged;
	}
	public void setIsmortgaged(boolean ismortgaged) {
		this.ismortgaged = ismortgaged;
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
	public void addHouse(int house){
		this.house += house;
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
	public int getUnMortgage() {
		return unmortgage;
	}
	public void setUnMortgage(int unmortgage) {
		this.unmortgage = unmortgage;
	}
	public void setColor(PropertyType color) {
		this.color = color;
	}
	public PropertyType getColor() {
		return color;
	}
	public int getPropertyRentWhenLandedOn() {
		int propRent = 0;
		if(this.ismortgaged == true) {
			return 0;
		}
		switch(this.house) {
		case 0:
			propRent = this.rent;
			break;
		case 1:
			propRent = this.rentH1;
			break;
		case 2: 
			propRent = this.rentH2;
			break;
		case 3:
			propRent = this.rentH3;
			break;
		case 4:
			propRent = this.rentH4;
			break;
		case 5:
			propRent = this.rentH5;
			break;
		}
		
		return propRent;
	}
	public int getRentRailRoad(int z) {
		if(this.ismortgaged == true) {
			return 0;
		}
		switch(z) {
		case 1:
			return this.rentH1;
		case 2: 
			return this.rentH2;
		case 3:
			return this.rentH3;
		case 4:
			return this.rentH4;
		}
		return 0;
	}
	public boolean isFullSet() {
		return fullSet;
	}
	public void setFullSet(boolean fullSet) {
		this.fullSet = fullSet;
	}
	public int getRailRoadNum() {
		return railRoadNum;
	}
	public void setRailRoadNum(int railRoadNum) {
		this.railRoadNum = railRoadNum;
	}
	public boolean isTradeable() {
		return tradeable;
	}
	public void setTradeable(boolean tradeable) {
		this.tradeable = tradeable;
	}
	

}