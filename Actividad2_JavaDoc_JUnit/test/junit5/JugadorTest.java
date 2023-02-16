package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import programa.Jugador;
class JugadorTest {
	/*
	 * Primero vamos a hacer la prueba del método ponerDorsal, comprobando si al pasarle el atributo dorsal con un
	 * valor superior a 1 y menor de 30 (por ejemplo 24), le asigna dicho dorsal al jugador que llama a dicho método.
	 * Para ello crearemos un objeto de la clase Jugador cuyo atributo dorsal sea 0, llamaremos al método ponerDorsal 
	 * con dicho jugador, pasándole 24 como int dorsal. Si el método funciona adecuadamente, deberá asignar el valor 24 
	 * al atributo dorsal del jugador, procederemos a crear una variable de tipo entero denominada dorsalObtenido. 
	 * Para comprobar que el método ha funcionado bien, crearemos una variable de tipo entero denominada dorsalEsperado 
	 * cuyo valor será 24 y lo compararemos con el valor de dorsalObtenido, mediante un assertEquals. 
	 * La prueba será satisfactoria si ambos valores son iguales
	 */
	@Test
	public void asignaDorsal() {
		System.out.println("Test 1");
		
		Jugador j1 = new Jugador(0, 0, 0);
		
		j1.ponerDorsal(24);
		
		int dorsalEsperado = j1.getDorsal();
		int dorsalObtenido = 24;
		
		assertEquals(dorsalEsperado, dorsalObtenido);
	}
	
	/*
	 * Ahora comprobaremos si el método ponerDorsal funciona adecuadamente al pasarle el atributo dorsal con el valor 1.
	 * Para ello crearemos un objeto de la clase Jugador cuyo atributo dorsal sea 0, llamaremos al método ponerDorsal 
	 * con dicho jugador, pasándole 1 como int dorsal. Si el método funciona adecuadamente, deberá asignar el valor 1 
	 * al atributo dorsal del jugador, procederemos a crear una variable de tipo entero denominada dorsalObtenido. 
	 * Para comprobar el buen funcionamiento del método, crearemos una variable de tipo entero denominada dorsalEsperado 
	 * cuyo valor será 1 y lo compararemos con el valor de dorsalObtenido, mediante un assertEquals. 
	 * La prueba será satisfactoria si ambos valores son iguales
	 */
	
	@Test
	public void asignaDorsal1() {
		System.out.println("Test 2");
		
		Jugador j1 = new Jugador(0, 0, 0);
		
		j1.ponerDorsal(1);
		
		int dorsalEsperado = j1.getDorsal();
		int dorsalObtenido = 1;
		
		assertEquals(dorsalEsperado, dorsalObtenido);
	}
	
	/*
	 * Ahora comprobaremos si el método ponerDorsal funciona adecuadamente al pasarle el atributo dorsal con el valor 30.
	 * Para ello crearemos un objeto de la clase Jugador cuyo atributo dorsal sea 0, llamaremos al método ponerDorsal 
	 * con dicho jugador, pasándole 30 como int dorsal. Si el método funciona adecuadamente, deberá asignar el valor 30 
	 * al atributo dorsal del jugador, procederemos a crear una variable de tipo entero denominada dorsalObtenido. 
	 * Para comprobar que el método funciona como es debido, crearemos una variable de tipo entero denominada dorsalEsperado
	 * cuyo valor será 30 y lo compararemos con el valor de dorsalObtenido, mediante un assertEquals. 
	 * La prueba será satisfactoria si ambos valores son iguales
	 */
	
	@Test
	public void asignaDorsal30() {
		System.out.println("Test 3");
		
		Jugador j1 = new Jugador(0, 0, 0);
		
		j1.ponerDorsal(30);
		
		int dorsalEsperado = j1.getDorsal();
		int dorsalObtenido = 30;
		
		assertEquals(dorsalEsperado, dorsalObtenido);
	}
	
	/*
	 * Ahora comprobaremos si el método ponerDorsal funciona adecuadamente al pasarle el atributo dorsal con el valor -5.
	 * Para ello crearemos un objeto de la clase Jugador cuyo atributo dorsal sea 0, llamaremos al método ponerDorsal 
	 * con dicho jugador, pasándole -5 como int dorsal. Si el método funciona adecuadamente, deberá asignar el valor -1 
	 * al atributo dorsal del jugador, procederemos a crear una variable de tipo entero denominada dorsalObtenido. 
	 * Para comprobar que el método funciona bien, crearemos una variable de tipo entero denominada dorsalEsperado cuyo 
	 * valor será -1 y lo compararemos con el valor de dorsalObtenido, mediante un assertEquals. 
	 * La prueba será satisfactoria si ambos valores son iguales
	 */
	
	@Test
	public void asignaDorsalNegativo() {
		System.out.println("Test 4");
		
		Jugador j1 = new Jugador(0, 0, 0);
		
		j1.ponerDorsal(-5);
		
		int dorsalEsperado = j1.getDorsal();
		int dorsalObtenido = -1;
		
		assertEquals(dorsalEsperado, dorsalObtenido);
	}
	
	/*
	 * Ahora comprobaremos si el método ponerDorsal funciona adecuadamente al pasarle el atributo dorsal con el valor 33.
	 * Para ello crearemos un objeto de la clase Jugador cuyo atributo dorsal sea 0, llamaremos al método ponerDorsal 
	 * con dicho jugador, pasándole 33 como int dorsal. Si el método funciona adecuadamente, deberá asignar el valor -1 
	 * al atributo dorsal del jugador, procederemos a crear una variable de tipo entero denominada dorsalObtenido. 
	 * Para comprobar que el método funciona correctamente, crearemos una variable de tipo entero denominada dorsalEsperado 
	 * cuyo valor será -1 y lo compararemos con el valor de dorsalObtenido, mediante un assertEquals. 
	 * La prueba será satisfactoria si ambos valores son iguales
	 */
	
	@Test
	public void asignaDorsalMayor30() {
		System.out.println("Test 5");
		
		Jugador j1 = new Jugador(0, 0, 0);
		
		j1.ponerDorsal(33);
		
		int dorsalEsperado = j1.getDorsal();
		int dorsalObtenido = -1;
		
		assertEquals(dorsalEsperado, dorsalObtenido);
	}
	
	/*
	 * Procedemos a probar el método estaExpulsado, para ello crearemos un jugador cuyos atributos numeroTrajetasAmarillas y 
	 * numeroTarjetasRojas sean 0, llamaremos al método estaExpulsado con dicho jugador. Si el método funciona adecuadamente,
	 * deberá devolver expulsado = false. Así utilizaremos un assertFalse para comprobar que esto sea así.
	 */
	
	@Test
	public void expulsadoFalse() {
		System.out.println("Test 6");
		
		Jugador j1 = new Jugador(0, 0, 0);
		
		assertFalse(j1.estaExpulsado());
	}
	
	/*
	 * Seguimos probando el método estaExpulsado, para ello crearemos un jugador cuyo atributo numeroTrajetasAmarillas sea 1 y 
	 * numeroTarjetasRojas sea 0, llamaremos al método estaExpulsado con dicho jugador. Si el método funciona adecuadamente,
	 * deberá devolver expulsado = false. Así utilizaremos un assertFalse para comprobar que esto sea así.
	 */
	
	@Test
	public void expulsadoFalse2() {
		System.out.println("Test 7");
		
		Jugador j1 = new Jugador(0, 1, 0);
		
		assertFalse(j1.estaExpulsado());
	}
	
	/*
	 * Seguimos probando el método estaExpulsado, para ello crearemos un jugador cuyo atributo numeroTrajetasAmarillas sea 0 y 
	 * numeroTarjetasRojas sea 1, llamaremos al método estaExpulsado con dicho jugador. Si el método funciona adecuadamente,
	 * deberá devolver expulsado = true. Así utilizaremos un assertTrue para comprobar que esto sea así.
	 */
	
	@Test
	public void expulsadoTrueRoja() {
		System.out.println("Test 8");
		
		Jugador j1 = new Jugador(0, 0, 1);
		
		assertTrue(j1.estaExpulsado());
	}
	
	/*
	 * Seguimos probando el método estaExpulsado, para ello crearemos un jugador cuyo atributo numeroTrajetasAmarillas sea 2 y 
	 * numeroTarjetasRojas sea 0, llamaremos al método estaExpulsado con dicho jugador. Si el método funciona adecuadamente,
	 * deberá devolver expulsado = true. Así utilizaremos un assertTrue para comprobar que esto sea así.
	 */
	
	@Test
	public void expulsadoTrueAmarilla() {
		System.out.println("Test 9");
		
		Jugador j1 = new Jugador(0, 2, 0);
		
		assertTrue(j1.estaExpulsado());
	}
	
	/*
	 * Seguimos probando el método estaExpulsado, para ello crearemos un jugador cuyo atributo numeroTrajetasAmarillas sea 2 y 
	 * numeroTarjetasRojas sea 1, llamaremos al método estaExpulsado con dicho jugador. Si el método funciona adecuadamente,
	 * deberá devolver expulsado = true. Así utilizaremos un assertTrue para comprobar que esto sea así.
	 */
	
	@Test
	public void expulsadoTrue2() {
		System.out.println("Test 10");
		
		Jugador j1 = new Jugador(0, 2, 1);
		
		assertTrue(j1.estaExpulsado());
	}
}
