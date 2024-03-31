package com.objectmaster.players.types;

import com.objectmaster.players.Human;

public class Wizard extends Human {
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal(Human target) {
		target.health += this.intelligence;
		System.out.println("La salud del humano se recuperó");
	}
	
	public void fireball(Human target) {
		int damage = this.intelligence * 3;
        target.health -= damage;
        System.out.println("Se lanzó una bola de fuego y la salud del objetivo disminuyó en " + damage + " puntos.");
	}
}
