package edu.neumont.csc110.a.monopoly;

import java.util.ArrayList;

public class Player {
	private String name;
	private String piece;
	private int money;
	private int getOutOfJailCard;
	private int getOutOfJailCard1;
	private int getOutOfJailCard2;
	private boolean isPlayerInJail;
	private int houseTotal;
	private int hotelTotal;
	private int playerPosition;
	private int turnsInJail;
	private int turnOrderRoll;
	private int numberOfRailRoads;
	private boolean stillBidding;
	private ArrayList<PropertyCards> property; //taking from the arraylist from the bank
	
	
	
	public boolean anythingMortgaged() {
		for(int i=0;i<property.size();i++) {
			if(property.get(i).isIsmortgaged() == true) {
				return true;
			}
		}
		return false;
	}
	public int getNumberOfRailRoads(BoardTiles allTheProperty) {
		setNumberOfRailRoads(allTheProperty);
		return this.numberOfRailRoads;
	}
	public void setNumberOfRailRoads(BoardTiles allTheProperty) {
		int counter = 0;
		if(this.property.contains(allTheProperty.BO_Railroad)) {
			counter++;
		} 
		if(this.property.contains(allTheProperty.Reading_Railroad)) {
			counter++;
		}
		if(this.property.contains(allTheProperty.Pennsylvania_Railroad)) {
			counter++;
		}
		if(this.property.contains(allTheProperty.Short_Line)) {
			counter++;
		}
		
		
		if(counter == 1) {
			this.numberOfRailRoads = 1;
		} else if(counter == 2) {
			this.numberOfRailRoads = 2;
		} else if(counter == 3) {
			this.numberOfRailRoads = 3;
		} else if(counter == 4) {
			this.numberOfRailRoads = 4;
		} else {
			this.numberOfRailRoads = 0;
		}
	}
	
	public ArrayList<PropertyCards> returnPropertyCardArrayList(){
		return this.property;
	}
	
	public boolean getAbleToDoHouseStuff() {
		for(int i=0;i<this.property.size();i++) {
			if(this.property.get(i).isFullSet()) {
				return true;
			}
		}
		return false;
	}
	public void giveAllPropertyToBanker(Banker banker) {
		for(int i=0;i<property.size();i++){
			this.property.get(i).setBought(false);
			banker.addCard(this.property.get(i));
		}
	}
	public void setBidding(boolean bid){
		this.stillBidding = bid;
	}
	public boolean getStillBidding() {
		return stillBidding;
	}
	public void setTurnOrderRoll(int num) {
		this.turnOrderRoll = num;
	}
	public int getTurnOrderRoll() {
		return this.turnOrderRoll;
	}
	public boolean allMortgaged() {
		boolean maybe = false;
		int counter = 0;
		for(int i=0;i<this.property.size();i++) {
			if(this.property.get(i).isIsmortgaged()) {
				counter++;
			}
		}
		if(counter == property.size()) {
			return true;
		} else {
		return maybe;
		}
	}
	public PropertyCards removeProperty(int num) {
		PropertyCards card = property.get(num-2);
		property.remove(num - 2);
		return card;
	}
	public void addProperty(PropertyCards card) {
		property.add(card);
	}
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
	public ArrayList<PropertyCards> getProperty() {
		return property;
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
		this.property.add(card);
		card.setBought(true);/// set isbought
		this.addMoney(-1*card.getPrice());
		bank.removeCard(card);
	}
	public void addPropertyToCollection(PropertyCards card) {
		this.property.add(card);
		card.setBought(true);
	}
	
	public boolean isPlayerInJail() {
		return isPlayerInJail;
	}

	public void setPlayerInJail(boolean isPlayerInJail) {
		this.isPlayerInJail = isPlayerInJail;
		this.setPlayerPosition(10);
	}

	public int getGetOutOfJailCard() {
		return getOutOfJailCard1 + getOutOfJailCard2;
	}
	public int getGetOutOfJailCard1() {
		return getOutOfJailCard1;
	}
	public int getGetOutOfJailCard2() {
		return getOutOfJailCard2;
	}

	public void setGetOutOfJailCards1(int JailCard1) {
		this.getOutOfJailCard1 += JailCard1;
	}
	public void setGetOutOfJailCards2(int JailCard2) {
		this.getOutOfJailCard2 += JailCard2;
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
	public int getTurnsInJail() {
		return turnsInJail;
	}
	public void setTurnsInJail(int counter) {
		this.turnsInJail = counter;
	}
	public void addTurnsInJail(int counter) {
		this.turnsInJail += counter;
	}
}