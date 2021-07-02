package com.inforcap.maestropt1;

public class HumanTest {

	public static void main(String[] args) {		
		
		Human humano = new Human();		
		Human humano2 = new Human();
		
		humano.mostrarSalud();
		humano.attack(humano2);
		
		//Wizard mago = new Wizard();
		//mago.attack(humano);
		
		//Ninja nin = new Ninja();
		//nin.attack(humano);
		
		//Samurai sam = new Samurai() ;
		//sam.attack(humano);		
	}

}
