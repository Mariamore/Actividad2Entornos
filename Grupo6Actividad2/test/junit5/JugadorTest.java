package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programa.Jugador;

class JugadorTest {
	
	// Creamos un test para el método ponerDorsal.

	@Test
	public void ponerDorsalTest() {
		Jugador jugador = new Jugador();
		
		/*
		 *  Le indicamos al método que el dorsal sea 5. Obtenemos el resultado
		 *  con getDorsal y lo igualamos al número que hemos establecido.
		 */
		jugador.ponerDorsal(5);
		int resultadoEsperado = 5;
		int resultadoObtenido = jugador.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		// Realizamos la misma prueba con el mínimo número posible de dorsal: 1.
		jugador.ponerDorsal(1);
		resultadoEsperado = 1;
		resultadoObtenido = jugador.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		// Realizamos la misma prueba con el máximo número posible de dorsal: 30.
		jugador.ponerDorsal(30);
		resultadoEsperado = 30;
		resultadoObtenido = jugador.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		/*
		 *  Probamos con un dorsal mayor del permitido y lo igualamos al resultado
		 *  que indica la documentación del método (-1).
		 */
		jugador.ponerDorsal(50);
		resultadoEsperado = -1;
		resultadoObtenido = jugador.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		// Por si acaso, probamos también que no sean iguales con el dorsal anterior.
		jugador.ponerDorsal(50);
		resultadoEsperado = 50;
		resultadoObtenido = jugador.getDorsal();
		assertNotEquals(resultadoEsperado, resultadoObtenido);
		
		/*
		 *  Ahora intentamos poner un número de dorsal negativo. Al igual que ocurría antes, 
		 *  el resultado que esperamos según la documentación es -1.
		 */
		jugador.ponerDorsal(-8);
		resultadoEsperado = -1;
		resultadoObtenido = jugador.getDorsal();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		/*
		 *  Realizamos la misma prueba pero verificando que el dorsal no sea el mismo que
		 *  indicamos cuando se trata de un número negativo.
		 */
		jugador.ponerDorsal(-8);
		resultadoEsperado = -8;
		resultadoObtenido = jugador.getDorsal();
		assertNotEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	// Creamos un test para el método estaExpulsado.
	
	@Test
	public void estaExpulsadoTest() {
		Jugador jugador = new Jugador();
		
		/*
		 *  Empezamos probando con un jugador sin tarjetas amarillas ni rojas.
		 *  Esperamos que no esté expulsado (false).
		 *  Primero hacemos una prueba igualando el resultado con false.
		 */
		jugador.setNumeroTarjetasAmarillas(0);
		jugador.setNumeroTarjetasRojas(0);
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = jugador.estaExpulsado();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		// Hacemos la misma prueba pero con assertFalse, ya que esperamos que devuelva false.
		jugador.setNumeroTarjetasAmarillas(0);
		jugador.setNumeroTarjetasRojas(0);
		resultadoObtenido = jugador.estaExpulsado();
		assertFalse(resultadoObtenido);
		
		// Con solo una tarjeta amarilla, el resultado esperado también es false.
		jugador.setNumeroTarjetasAmarillas(1);
		jugador.setNumeroTarjetasRojas(0);
		resultadoObtenido = jugador.estaExpulsado();
		assertFalse(resultadoObtenido);
		
		// Con dos tarjetas amarillas ya sí estaría expulsado el jugador (true).
		jugador.setNumeroTarjetasAmarillas(2);
		jugador.setNumeroTarjetasRojas(0);
		resultadoObtenido = jugador.estaExpulsado();
		assertTrue(resultadoObtenido);
		
		// Lo mismo ocurriría con una sola tarjeta roja (true).
		jugador.setNumeroTarjetasAmarillas(0);
		jugador.setNumeroTarjetasRojas(1);
		resultadoObtenido = jugador.estaExpulsado();
		assertTrue(resultadoObtenido);
		
		// En el caso de que obtenga una amarilla y una roja, también sería expulsado (true).
		jugador.setNumeroTarjetasAmarillas(1);
		jugador.setNumeroTarjetasRojas(1);
		resultadoObtenido = jugador.estaExpulsado();
		assertTrue(resultadoObtenido);
		
		// El caso teórico de tener 2 amarillas y 1 roja también supondría la expulsión (true).
		jugador.setNumeroTarjetasAmarillas(2);
		jugador.setNumeroTarjetasRojas(1);
		resultadoObtenido = jugador.estaExpulsado();
		assertTrue(resultadoObtenido);
	}

}
