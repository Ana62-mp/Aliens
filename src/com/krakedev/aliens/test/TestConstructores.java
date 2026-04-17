package com.krakedev.aliens.test;

import com.krakedev.aliens.Alien;

public class TestConstructores {

	public static void main(String[] args) {
		Alien alien1 = new Alien(7,"red");
		Alien alien2 = new Alien(2,"green");
		
		alien1.imprimir();
		alien2.imprimir();

	}

}
