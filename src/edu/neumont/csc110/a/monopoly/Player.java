package edu.neumont.csc110.a.monopoly;

import java.util.ArrayList;

public class Player {
	private String name;

	private int money;
	private int getOutOfJailCard;
	private boolean isPlayerInJail;
	private ArrayList<PropertyCards> property;
	
	
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
		this.getOutOfJailCard = getOutOfJailCard;
	}

	public void setStartingMoney() {
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
