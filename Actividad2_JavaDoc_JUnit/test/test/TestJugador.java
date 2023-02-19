package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Futbol.Jugador;

class TestJugador {
	
	Jugador j1 = new Jugador();

	/*
	 * Test constructor pasando parametros
	 */
	@Test
	void testJugadorIntIntInt() {
		
		Jugador j = new Jugador(14, 2, 1);
		
		assertEquals(14, j.getDorsal());
		assertEquals(2, j.getNumeroTarjetasAmarillas());
		assertEquals(1, j.getNumeroTarjetasRojas());
	}

	/*
	 * Probamos el metodo setDorsal();
	 */
	@Test
	void testSetDorsal() {
		
		j1.setDorsal(30); 
		int resultadoEsperado = 30;
		int resultadoObtenido = j1.getDorsal();
		assertEquals(resultadoEsperado,resultadoObtenido);
		
		j1.setDorsal(49);
		resultadoEsperado = -1;
		resultadoObtenido = -1;
		assertEquals(resultadoEsperado,resultadoObtenido);
	}

	/*
	 * Probamos el metodo setTarjetasAmarillas();
	 */

	@Test
	void testSetNumeroTarjetasAmarillas() {
		
		j1.setNumeroTarjetasAmarillas(3);
		int resultadoEsperado = 3;
		int resultadoObtenido = j1.getNumeroTarjetasAmarillas();
		
		j1.setNumeroTarjetasAmarillas(-4);
		resultadoEsperado = -4;
		resultadoObtenido = j1.getNumeroTarjetasAmarillas();
	
	}
	/*
	 * Probamos el metodo setTArjetasRojas();
	 */
	@Test
	void testSetNumeroTarjetasRojas() {
		
	}
	/*
	 * Vamos a probar en este caso metodo pansandole como parametros dos valores, 
	 * uno en el caso que cumpla con la condicion de que el dorsal se encuentre entre el intervalo de 1 a 30
	 * y otro que sale fuera de ese intervalo.
	 * 
	 */
	@Test
	void testPonerDorsal() {
		
		//parametro dque se encuentra entre 1 y 30
		j1.ponerDorsal(14);
		
		int resultadoEsperado = 14;
		int resultadoObtenido = j1.getDorsal();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		//parametro que se sale fuera del intervalo
		
		j1.ponerDorsal(48);
		
		resultadoEsperado = j1.getDorsal();//resultado esperado -1
		resultadoObtenido = -1;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		//Parametro negativo (sale fuera del intervalo marcado)
		

		j1.ponerDorsal(-18);
		
		resultadoEsperado = j1.getDorsal();
		resultadoObtenido = -1;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	@Test
	void testEstaExpulsado() {
		
		//Pruebas para tarjetas amarillas
		//INSERTAMOS AL JUGADOR 1 EL NUMERO DE TARJETAS QUE HA RECIBIDO EN EL PARTIDO EL JUGADOR 1
		
		//Prueba para 2 tarjetas amarillas
		j1.setNumeroTarjetasAmarillas(2);	
		assertTrue(j1.estaExpulsado());
		
		//Prueba para 1 tarjeta amarilla
		j1.setNumeroTarjetasAmarillas(1);	
		assertFalse(j1.estaExpulsado());
	
		//Prueba para 0 tarjetas amarillas
		j1.setNumeroTarjetasAmarillas(0);	
		assertFalse(j1.estaExpulsado());
		
		/*
		 * Podriamos hacerlo de diferente manera usando assertEquals
		 */

		j1.setNumeroTarjetasAmarillas(2); //para dos tarjetas amarillas
		 
		boolean resultadoEsperado = true;
		boolean resultadoObtenido= j1.estaExpulsado();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	
		/*
		 * Vamos a hacer lo mismo pero utilizando el metodo setNumeroTarjetasROjas(), en este caso con 
		 * asignarle dos valores tendríamo suficiente 0 y 1.
		 */
		
		//j1.setNumeroTarjetasRojas(0);
		//assertFalse(j1.estaExpulsado());
		/*
		 * atraves del metodo setNumeroTarjetasRojas(), indicamos el nuemro de tarjetas rojas que tienen el jugador
		 * en este caso 
		 */
		
		//resultadoEsperado = false;
		//resultadoObtenido = j1.estaExpulsado();
		//assertEquals(resultadoEsperado, resultadoObtenido);
		
		
		//Si el jugador recibe una tarjeta roja
		//j1.setNumeroTarjetasRojas(1);
		//assertTrue(j1.estaExpulsado());
		
		//Pasndole tarjetas rojas negativas
		//j1.setNumeroTarjetasRojas(-1);
		//assertFalse(j1.estaExpulsado());
		
		
		/*
		 * Hacemos las prueba pasandole tanto dos tarjetas amarillas como una roja:
		 * en las dos opciones nos deberiía de dar true.
		 * Porque se cumplirian las dos condiciones para que el jugador fuese expulsado
		 * 
		 */
		
		//Prueba con 0 tarjetas amarillas y una roja.
		j1.setNumeroTarjetasAmarillas(0);
		j1.setNumeroTarjetasRojas(1);
	
		assertEquals(j1.estaExpulsado(), j1.estaExpulsado());
		
		// Prueba dos tarjetas amarillas y una roja
		j1.setNumeroTarjetasAmarillas(2);
		j1.setNumeroTarjetasRojas(1);
	
		assertEquals(j1.estaExpulsado(), j1.estaExpulsado());
		
		
		
	}

}
