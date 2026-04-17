package com.krakedev.aliens.test;

import com.krakedev.aliens.Alien;

public class TestConstructores {

	public static void main(String[] args) {
		Alien alien1 = new Alien(7,"red");
		Alien alien2 = new Alien(2,"green");
		
		Alien alien3 = new Alien(56,"red");
		Alien alien4 = new Alien(19,"green");
		
		//alien1.imprimir();
		System.out.println("-------");
		//alien2.imprimir();
		System.out.println("-------");
		//alien3.imprimir();
		System.out.println("-------");
		alien4.imprimir();

	}

}
