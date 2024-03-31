package com.objectmaster.players.types;
import com.objectmaster.players.Human;

public class Samurai extends Human {
	
	private static int numberOfSamurai = 0;
	
	public Samurai() {
		this.health = 200;
		setNumberOfSamurai(getNumberOfSamurai() + 1);
	}

	public static int getNumberOfSamurai() {
		return numberOfSamurai;
	}

	public static void setNumberOfSamurai(int numberOfSamurai) {
		Samurai.numberOfSamurai = numberOfSamurai;
	}
	
	public void deathBlow(Human target) {
		target.health = 0;
		this.health = (this.health / 2);
		System.out.println("Humano ha sido asesinado");
	}
	
	public void medicate() {
		this.health = this.health + (this.health /2);
		System.out.println("El samurai recuperó salud y ahora está en " + this.health);
	}
	
	public static int howMany() {
		System.out.println("Hay " + numberOfSamurai + " samurais registrados");
		return numberOfSamurai;
	}
}
