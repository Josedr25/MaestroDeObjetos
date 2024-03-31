package com.objectmaster.players;

public class Human {
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	public int health = 100;
	
	public int getStrength() {
		return this.strength;
	}
	
	public int getStealth() {
		return this.stealth;
	}
	
	public int getIntelligence() {
		return this.intelligence;
	}
	
	public int displayHealth() {
		System.out.println(this.health);
		return this.health;
	}
	
	public void attack(Human target) {
		target.health -= this.strength;
	}
}
