package com.inforcap.maestropt1;

public class Ninja extends Human{

	public Ninja() {
		super();
	}
	
	public void attack(Human humano) {
		System.out.println("Ninja Golpea a Humano");
		System.out.println("Energía -"+getStrength());
		getHealth();
		setHealth(getHealth()-getStrength());
		mostrarSalud();
	}
	
}
