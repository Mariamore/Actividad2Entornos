package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import programa.Soldado;

class SoldadoTest {

	/*
	 * Primero testearemos si el método puedeDisparar devuelve true cuando numeroBalas es 
	 * mayor que 0, para ello creamos un objeto soldado cuyo atributo numeroBalas es 20, y realizamos un assertTrue 
	 * para comprobar que al ejecutar el método puedeDisparar con dicho soldado, este arroja true como resultado
	 */
	@Test
	public void siPuedeDisparar() {
		System.out.println("Test 1");
		
		Soldado sol = new Soldado(false, 20);
		assertTrue(sol.puedeDisparar());
		
	}
	/*
	 * Ahora testearemos el caso contrario, para ello crearemos dos objetos de la clase Soldado, uno con 
	 * numeroBalas = -1 y otro con numeroBalas = 0, y realizaremos un assertFalse con cada uno de ellos, 
	 * para comprobar que al ejecutar el método con dichos objetos, el método efectivamente arroja false como resultado
	 */
	
	@Test
	public void noPuedeDisparar() {
		System.out.println("Test 2");
		
		Soldado sol1 = new Soldado(false, 0);
		Soldado sol2 = new Soldado(false, -1);
		
		assertFalse(sol1.puedeDisparar());
		assertFalse(sol2.puedeDisparar());
	}

	/*
	 * Ahora, testeamos el segundo método, disparar, de manera que tendremos que crear dos soldados con sus correspondientes 
	 * atributos. En ambos, el atributo estaMuerto se inicializa a false, lo que indica que ambos soldados están vivos.
	 * Tras ejecutar el método disparar, el cual será llamado por uno de los soldados, pasándole el otro dentro del método, 
	 * el soldado sobre el cual se ejecuta el método, verá modificado su atributo estaMuerto a true. Así que utilizaremos un
	 * assertTrue para comprobar este hecho.
	 */
	@Test
	public void siMuere() {
		System.out.println("Test 3");
		
		Soldado sol1 = new Soldado(false, 15);
		Soldado sol2 = new Soldado(false, 12);
		
		sol1.disparar(sol2);
		
		assertTrue(sol2.isEstaMuerto());
	}
	/*
	 * También comprobaremos que al ejecutar el método disparar, el valor del atributo numeroBalas de sol1 ha disminuido en una 
	 * unidad, para ello crearemos una variable de tipo entero denominada numeroBalasEsperado, y lo compararemos con el número de
	 * balas de sol1, utilizando un assertEquals. La prueba será satisfactoria en caso de que numeroBalasEsperado y numeroBalasObtenido
	 * sean iguales.
	 */
	@Test
	public void disminuyeBalas() {
		System.out.println("Test 4");
		
		Soldado sol1 = new Soldado(false, 15);
		Soldado sol2 = new Soldado(false, 12);
		
		sol1.disparar(sol2);
		
		int numeroBalasEsperado = 14;
		int numeroBalasObtenido = sol1.getNumeroBalas();
		
		assertEquals(numeroBalasEsperado, numeroBalasObtenido);
	}

}
