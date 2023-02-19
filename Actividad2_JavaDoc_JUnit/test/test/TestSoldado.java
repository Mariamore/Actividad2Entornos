package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Soldado.Soldado;

class TestSoldado {
	
	
	 Soldado sol1 = new Soldado();;
	
	

	@Test
	public void testSetEstaMuerto() {
		
		//Objeto ya creado
		
		sol1.setEstaMuerto(true);
		assertTrue(sol1.isEstaMuerto());
		
		sol1.setEstaMuerto(false);
		assertFalse(sol1.isEstaMuerto());
		
		}
		
	/*
	 * Prueba unitaria del metodo "SetNumeroBalas"
 	 * 
 	 */
	@Test
	void testSetNumeroBalas() {
		
		/*
		 * Vamos a hacer la prueba con 3 numeros, uno positivo, uno negativo y con el 0
		 */

		//Numero positivo
		sol1.setNumeroBalas(5);
		
		int resultadoEsperado = 5;
		int resultadoObtenido = sol1.getNumeroBalas();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		//Numero negativo
		sol1.setNumeroBalas(-3);
		
		resultadoEsperado = -3;
		resultadoObtenido = sol1.getNumeroBalas();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		//Probamos con el 0.
		
		sol1.setNumeroBalas(0);
		
		resultadoEsperado = 0;
		resultadoObtenido = sol1.getNumeroBalas();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

	
	//Prueba del constuctor con parametros
	@Test
	void testSoldadoBooleanInt() {
		
		Soldado sol = new Soldado(true, -5);
		
		boolean resultadoEsperado= true;
		boolean resultadoObtenido = sol.isEstaMuerto();

		assertEquals(resultadoEsperado, resultadoObtenido);
		assertEquals(-5, sol.getNumeroBalas());
		
		
	}
	
	/*
	 * Prueba metodos
	 */
	@Test
	void testPuedeDisparar() {
		
	
	// Test unitario del metodo puedeDisparar(), depende de las balas
	
	/*
	 * Hacemos el  primer test; el metodo depende del numero de balas, 
	 * haremos las pruebas metiendole un parametro diferente en cada caso.
	 * 
	 */
		// numeroBalas>0
		
		/*
		 * En este caso ponemos assertTrue, el metodo nos tiene que retornar 
		 * true, ya que numeroBalas admite numeros postivos, el test debeía de salir correcto.
		 */
		//Insertamos el numero de balas atraves del metodo set.
		
		sol1.setNumeroBalas(8);
			
		assertTrue(sol1.puedeDisparar());
		
		
		//numeroBalas<0  
		
		/*
		 * En este caso ponemos el assertFalse, el metodo nos tiene que retornar
		 * false, ya que numeroBalas no admite numeros negativos, por lo tanto
		 * el test deberia salir correcto.
		 */
		//Insertamos el numero de balas atraves del metodo set.
		
		sol1.setNumeroBalas(-8);
		assertFalse(sol1.puedeDisparar());
		
	}

	@Test
	void testDisparar() {
	 
	 /*
	  * No puede disparar,  el soldado no  tiene balas, y esta muerto
	  */
	  sol1.setNumeroBalas(-8);
	  boolean resultadoEsperado = sol1.puedeDisparar();
	  boolean resultadoObtenido = sol1.isEstaMuerto();
	  
	  assertEquals(resultadoEsperado, resultadoObtenido);
	  
	  /*
	   * Puede disparar, pero esta muerto
	   */
	  sol1.setNumeroBalas(+8);
	  resultadoEsperado = sol1.puedeDisparar();
	  resultadoObtenido = sol1.isEstaMuerto();
	  
	  assertNotEquals(resultadoEsperado, resultadoObtenido);
	  
	  /*
	   * El soldado tiene balas y no esta muerto.
	   */
	  sol1.setNumeroBalas(+8);
	  resultadoEsperado = sol1.puedeDisparar();
	  resultadoObtenido = !sol1.isEstaMuerto();
	  
	  assertEquals(resultadoEsperado, resultadoObtenido);
	}

}
