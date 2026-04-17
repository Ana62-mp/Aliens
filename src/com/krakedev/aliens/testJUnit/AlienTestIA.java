package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

class AlienTestIA {

	@Test
	void testCreacionAlienConTamanioValido() {

		// Se crea un alien con tamaño dentro del rango permitido
		Alien alien = new Alien(15, "morado");

		// Se verifica que los atributos se asignen correctamente
		assertEquals(15, alien.getTamanio());
		assertEquals("morado", alien.getColor());

		// Valores iniciales de partes del alien
		assertEquals(0, alien.getNumeroOjos());
		assertEquals(0, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPiernas());
	}

	@Test
	void testRestriccionTamanioMinimo() {

		// Se crea un alien con tamaño menor al mínimo permitido
		Alien alien = new Alien(2, "verde");

		// El constructor debe ajustar automáticamente el tamaño a 5
		assertEquals(5, alien.getTamanio());

		// Verificar que los precios se calculen usando el tamaño ajustado
		assertEquals(1.0, alien.getPrecioCuerpo(), 0.001);
		assertEquals(0.5, alien.getPrecioExtremidad(), 0.001);
		assertEquals(0.25, alien.getPrecioOjo(), 0.001);
	}

	@Test
	void testRestriccionTamanioMaximo() {

		// Se crea un alien con tamaño mayor al permitido
		Alien alien = new Alien(40, "azul");

		// El tamaño debe ajustarse automáticamente al máximo permitido
		assertEquals(30, alien.getTamanio());

		// Verificación del cálculo de precios con el tamaño máximo
		assertEquals(6.0, alien.getPrecioCuerpo(), 0.001);
		assertEquals(3.0, alien.getPrecioExtremidad(), 0.001);
		assertEquals(1.5, alien.getPrecioOjo(), 0.001);
	}

	@Test
	void testCalculoPrecios() {

		// Se crea un alien con tamaño válido para comprobar los cálculos
		Alien alien = new Alien(20, "negro");

		// Precio cuerpo = 20% del tamaño
		assertEquals(4.0, alien.getPrecioCuerpo(), 0.001);

		// Precio extremidad = 10% del tamaño
		assertEquals(2.0, alien.getPrecioExtremidad(), 0.001);

		// Precio ojo = 5% del tamaño
		assertEquals(1.0, alien.getPrecioOjo(), 0.001);
	}
}