package edu.neumont.csc110.a.monopoly;

import java.util.ArrayList;

public class Player {
	private String name;
	private String piece;
	private int money;
	private int getOutOfJailCard;
	private boolean isPlayerInJail;
	private int houseTotal;
	private int hotelTotal;
	private int playerPosition;
	private ArrayList<PropertyCards> property; //taking from the arraylist from the bank
	
	public void printAsciiOwned(int i) {
		//use in for loop only
		PropertyCards card = this.property.get(i);
//		for(int j=0;j<property.size();j++) {
		card.printCardAscii();
//		}
	}
	public int lengthOfProperties() {
		return this.property.size();
	}
	public boolean ownProperty(PropertyCards card) {
		return property.contains(card);
	}
	public int getPlayerPosition() {
		return playerPosition;
	}
	public void setPlayerPosition(int playerPos){
		if(this.playerPosition > playerPos) {
			this.addMoney(200);
		}
		this.playerPosition = playerPos;
	}
	public void addPlayerPosition(int playerPos) {
		this.playerPosition += playerPos;
		if(this.playerPosition > 39) {
			this.addMoney(200);
			this.playerPosition -= 39;
		}
	}
	public int getHotelTotal() {
		return hotelTotal;
	}
	
	public int getHouseTotal() {
		return houseTotal;
	}

	public void addHouseTotal(int houseTotal) {
		this.houseTotal += houseTotal;
	}
	
	public String getPiece() {
		return piece;
	}

	public void setPiece(String piece) {
		this.piece = piece;
	}
	
	public void buyFromBanker(PropertyCards card, Banker bank) {
		this.property.add(card); /// set isbought
		this.addMoney(-1*card.getPrice());
		bank.removeCard(card);
	}
	
	public boolean isPlayerInJail() {
		return isPlayerInJail;
	}

	public void setPlayerInJail(boolean isPlayerInJail) {
		this.isPlayerInJail = isPlayerInJail;
	}

	public int getGetOutOfJailCard() {
		return getOutOfJailCard;
	}

	public void setGetOutOfJailCard(int getOutOfJailCard) {
		this.getOutOfJailCard += getOutOfJailCard;
	}

	public void setStartingMoney() {
		this.property = new ArrayList<PropertyCards>();
		money = 1500;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void addMoney(int money) {
		this.money += money;
	}
}