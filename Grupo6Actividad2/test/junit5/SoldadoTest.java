package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programa.Soldado;

class SoldadoTest {
	
	// Creamos un Test para probar el método puedeDisparar

	@Test
	public void puedeDispararTest() {
		Soldado soldado = new Soldado();
		
		// Comenzamos indicándole que el soldado tiene 100 balas, por lo que sí puede disparar (true).
		soldado.setNumeroBalas(100);
		assertTrue(soldado.puedeDisparar());
		
		// Si establecemos el número de balas en 0, el soldado no podrá disparar (false).
		soldado.setNumeroBalas(0);
		assertFalse(soldado.puedeDisparar());
		
		// Si el número de balas es negativo, tampoco podrá disparar (false).
		soldado.setNumeroBalas(-7);
		assertFalse(soldado.puedeDisparar());
	}
	
	// Creamos un test que compruebe que el método disparar reste una bala al número de balas del soldado.
	
	@Test
	public void dispararBalasTest() {
		Soldado soldado = new Soldado();
		
		/*
		 *  Probamos otorgándole 0 balas al soldado. Comprobamos que el resultado del método sea igual
		 *  a restarle 1 bala al número que tenía previamente.
		 */
		soldado.setNumeroBalas(0);
		int resultadoEsperado = (soldado.getNumeroBalas() - 1);
		soldado.disparar(soldado);
		int resultadoObtenido = soldado.getNumeroBalas();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		// Hacemos la misma prueba con 1 bala.
		soldado.setNumeroBalas(1);
		resultadoEsperado = (soldado.getNumeroBalas() - 1);
		soldado.disparar(soldado);
		resultadoObtenido = soldado.getNumeroBalas();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		// Repetimos la misma prueba con 3 balas.
		soldado.setNumeroBalas(3);
		resultadoEsperado = (soldado.getNumeroBalas() - 1);
		soldado.disparar(soldado);
		resultadoObtenido = soldado.getNumeroBalas();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	/*
	 *  Comprobamos mediante un test que el método disparar siempre mate al soldado, como indica 
	 *  el código aportado en el enunciado de la actividad. Para ello, el atributo estaMuerto 
	 *  será true después de ejecutar el método.
	 */
	
	@Test
	public void dispararEstaMuertoTest() {
		Soldado soldado = new Soldado();
		
		// Probamos con 0 balas y no estando muerto (false). Terminará muerto (true).
		soldado.setNumeroBalas(0);
		soldado.setEstaMuerto(false);
		soldado.disparar(soldado);
		assertTrue(soldado.isEstaMuerto());
		
		// Probamos con 0 balas y estando muerto (true). Igualmente terminará muerto (true).
		soldado.setNumeroBalas(0);
		soldado.setEstaMuerto(true);
		soldado.disparar(soldado);
		assertTrue(soldado.isEstaMuerto());
		
		// Realizamos las dos mismas comprobaciones con 3 balas. Seguirá acabando muerto (true).
		soldado.setNumeroBalas(3);
		soldado.setEstaMuerto(false);
		soldado.disparar(soldado);
		assertTrue(soldado.isEstaMuerto());
		
		soldado.setNumeroBalas(3);
		soldado.setEstaMuerto(false);
		soldado.disparar(soldado);
		assertTrue(soldado.isEstaMuerto());
		
		// Realizamos las dos mismas comprobaciones con un número negativo de balas (-5). De nuevo termina muerto (true).
		soldado.setNumeroBalas(-5);
		soldado.setEstaMuerto(false);
		soldado.disparar(soldado);
		assertTrue(soldado.isEstaMuerto());
		
		soldado.setNumeroBalas(-5);
		soldado.setEstaMuerto(true);
		soldado.disparar(soldado);
		assertTrue(soldado.isEstaMuerto());
	}

}
