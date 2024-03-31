package com.objectmaster.players.types;
import com.objectmaster.players.Human;

public class NinjaTest {
	public static void main(String[] args) {
		Ninja ruchao = new Ninja("Ruchao");
		Ninja vetti = new Ninja("Vetti");
		
		ruchao.steal(vetti);
		vetti.runAway();	
	
		//Wizard wizard = new Wizard();
        //Human target = new Human();

        //System.out.println("Salud del objetivo antes del ataque: " + target.health);
        //wizard.fireball(target);
        //System.out.println("Salud del objetivo después del ataque: " + target.health);
	
		
	//Samurai jack = new Samurai();
	//Samurai jose = new Samurai();
	//Samurai vale = new Samurai();
	
	//jack.deathBlow(jose);
	//jack.medicate();
	
	//int numSamurai = Samurai.howMany();
	//System.out.println(numSamurai);
	}
}
