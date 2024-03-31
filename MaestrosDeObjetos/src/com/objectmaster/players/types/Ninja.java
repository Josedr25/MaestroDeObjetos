package com.objectmaster.players.types;
import com.objectmaster.players.Human;

public class Ninja extends Human {

	public String name;

	public Ninja(String name) {
		this.name = name;
		this.stealth = 10;
	}
	
	public void steal(Ninja target) {
		target.health -= this.stealth;
		System.out.println(target.name + " perdió salud en " + this.stealth);
		this.health += this.stealth;
		System.out.println("La salud del ninja se incrementó en " + this.stealth + " su salud ahora es " + this.health);
	}
	
	public void runAway() {
		this.health -= 10;
		System.out.println("La salud del ninja bajó a " + this.health);
	}
}
