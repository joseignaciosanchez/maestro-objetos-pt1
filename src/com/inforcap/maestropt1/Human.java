package com.inforcap.maestropt1;

public class Human {

	private Integer strength = 3;
	private Integer stealth = 3;
	private Integer intelligence = 3;
	private Integer health = 100;
	
	public void reducirSalud(int daño) {
		this.health -= daño;
	}
	
	public void attack(Human humano) {
		System.out.println("Humano 1 Ataca a Humano 2");
		humano.reducirSalud(this.strength);
		System.out.println("Salud -"+strength);	
		humano.mostrarSalud();
	}	
	
	public Human() {
		
	}

	public void mostrarSalud() {
		System.out.println("Nivel de salud Humano 2: "+this.health);
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getStealth() {
		return stealth;
	}

	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}
	
	
}
