package edu.neumont.csc110.a.monopoly;

public class Player {
	private String name;
	private double money;
	
	
	public void setStartingMoney() {
		money = 1500;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}
