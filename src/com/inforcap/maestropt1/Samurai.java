package com.inforcap.maestropt1;

public class Samurai extends Human{

	public Samurai() {
		super();
		
	}
	
	public void attack(Human humano) {
		System.out.println("Samurai Golpea a Humano");
		System.out.println("Energía -"+getStrength());
		getHealth();
		setHealth(getHealth()-getStrength());
		mostrarSalud();
	}
}
