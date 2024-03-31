package com.objectmaster.players;

public class HumanTest {
	public static void main(String[] args) {
		
		Human human1 = new Human();
        Human human2 = new Human();

        System.out.println("Salud inicial de human1:");
        human1.displayHealth();
        System.out.println("Salud inicial de human2:");
        human2.displayHealth();

        human1.attack(human2);

        System.out.println("Salud de human1 después del ataque:");
        human1.displayHealth();
        System.out.println("Salud de human2 después del ataque:");
        human2.displayHealth();
    }
	
}
