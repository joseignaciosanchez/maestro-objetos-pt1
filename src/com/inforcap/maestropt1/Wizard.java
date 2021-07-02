package com.inforcap.maestropt1;

public class Wizard extends Human{
	
	

	public Wizard() {
		super();	
	}
	
	public void attack(Human humano) {
		System.out.println("Mago Golpea a Humano");
		System.out.println("Energía -"+getStrength());
		getHealth();
		setHealth(getHealth()-getStrength());
		mostrarSalud();
	}
}
