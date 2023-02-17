package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programa.Jugador;
class JugadorTest {
	private Jugador j1;
	
	/*
	 * Primero generamos una anotación @BeforeEach para que antes de cada prueba se nos genere un nuevo objeto 
	 * de la clase jugador.
	 */
	
	@BeforeEach
	void setUp() throws Exception{
		j1 = new Jugador();
	}
	
	/*
	 * Primero vamos a hacer la prueba del método ponerDorsal, comprobando si al pasarle el atributo dorsal con un
	 * valor superior a 1 y menor de 30 (por ejemplo 24), le asigna dicho dorsal al jugador que llama a dicho método.
	 * Para ello llamaremos al método ponerDorsal con el Jugador j1, pasándole 24 como int dorsal. Si el método funciona
	 * adecuadamente, deberá asignar el valor 24 al atributo dorsal del jugador, procederemos a crear una variable de tipo 
	 * entero denominada dorsalObtenido. 
	 * Para comprobar que el método ha funcionado bien, crearemos una variable de tipo entero denominada dorsalEsperado 
	 * cuyo valor será 24 y lo compararemos con el valor de dorsalObtenido, mediante un assertEquals. 
	 * La prueba será satisfactoria si ambos valores son iguales
	 */
	@Test
	public void asignaDorsal() {
		System.out.println("Test 1");
		
		j1.ponerDorsal(24);
		
		int dorsalEsperado = j1.getDorsal();
		int dorsalObtenido = 24;
		
		assertEquals(dorsalEsperado, dorsalObtenido);
	}
	
	/*
	 * Ahora comprobaremos si el método ponerDorsal funciona adecuadamente al pasarle el atributo dorsal con el valor 1.
	 * Para ello llamaremos al método ponerDorsal con el Jugador j1, pasándole 1 como int dorsal. Si el método funciona 
	 * adecuadamente, deberá asignar el valor 1 al atributo dorsal del jugador, procederemos a crear una variable de tipo 
	 * entero denominada dorsalObtenido. 
	 * Para comprobar el buen funcionamiento del método, crearemos una variable de tipo entero denominada dorsalEsperado 
	 * cuyo valor será 1 y lo compararemos con el valor de dorsalObtenido, mediante un assertEquals. 
	 * La prueba será satisfactoria si ambos valores son iguales
	 */
	
	@Test
	public void asignaDorsal1() {
		System.out.println("Test 2");
		
		j1.ponerDorsal(1);
		
		int dorsalEsperado = j1.getDorsal();
		int dorsalObtenido = 1;
		
		assertEquals(dorsalEsperado, dorsalObtenido);
	}
	
	/*
	 * Ahora comprobaremos si el método ponerDorsal funciona adecuadamente al pasarle el atributo dorsal con el valor 30.
	 * Para ello llamaremos al método ponerDorsal con el Jugador j1, pasándole 30 como int dorsal. Si el método funciona 
	 * adecuadamente, deberá asignar el valor 30 al atributo dorsal del jugador, procederemos a crear una variable de tipo 
	 * entero denominada dorsalObtenido. 
	 * Para comprobar el buen funcionamiento del método, crearemos una variable de tipo entero denominada dorsalEsperado 
	 * cuyo valor será 30 y lo compararemos con el valor de dorsalObtenido, mediante un assertEquals. 
	 * La prueba será satisfactoria si ambos valores son iguales
	 */
	
	@Test
	public void asignaDorsal30() {
		System.out.println("Test 3");
		
		j1.ponerDorsal(30);
		
		int dorsalEsperado = j1.getDorsal();
		int dorsalObtenido = 30;
		
		assertEquals(dorsalEsperado, dorsalObtenido);
	}
	
	/*
	 * Ahora comprobaremos si el método ponerDorsal funciona adecuadamente al pasarle el atributo dorsal con el valor -5.
	 * Para ello llamaremos al método ponerDorsal con el Jugador j1, pasándole -5 como int dorsal. Si el método funciona 
	 * adecuadamente, al ser -5 un número menor que 1, deberá asignar el valor -1 al atributo dorsal del jugador, 
	 * procederemos a crear una variable de tipo entero denominada dorsalObtenido. 
	 * Para comprobar el buen funcionamiento del método, crearemos una variable de tipo entero denominada dorsalEsperado 
	 * cuyo valor será -1 y lo compararemos con el valor de dorsalObtenido, mediante un assertEquals. 
	 * La prueba será satisfactoria si ambos valores son iguales
	 */
	
	@Test
	public void asignaDorsalNegativo() {
		System.out.println("Test 4");
		
		j1.ponerDorsal(-5);
		
		int dorsalEsperado = j1.getDorsal();
		int dorsalObtenido = -1;
		
		assertEquals(dorsalEsperado, dorsalObtenido);
	}
	
	/*
	 * Ahora comprobaremos si el método ponerDorsal funciona adecuadamente al pasarle el atributo dorsal con el valor 33.
	 * Para ello llamaremos al método ponerDorsal con el Jugador j1, pasándole 33 como int dorsal. Si el método funciona 
	 * adecuadamente, al ser 33 un número mayor que 30, deberá asignar el valor -1 al atributo dorsal del jugador,
	 * procederemos a crear una variable de tipo entero denominada dorsalObtenido. 
	 * Para comprobar el buen funcionamiento del método, crearemos una variable de tipo entero denominada dorsalEsperado 
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
	 * Procedemos a probar el método estaExpulsado, para ello llamaremos al método estaExpulsado con el Jugador j1, el cual tiene 
	 * inicializados los atributos numeroTarjetasAmarillas y numeroTarjetasRojas a 0. Si el método funciona adecuadamente,
	 * deberá devolver expulsado = false. Así utilizaremos un assertFalse para comprobar que esto sea así.
	 */
	
	@Test
	public void expulsadoFalse() {
		System.out.println("Test 6");
		
		assertFalse(j1.estaExpulsado());
	}
	
	/*
	 * Seguimos probando el método estaExpulsado, para ello utilizaremos el Jugador j1, y mediante el método 
	 * setNumeroTrajetasAmarillas, asignaremos el valor 1 a dicho atributo y dejaremos numeroTarjetasRojas a 0, 
	 * llamaremos al método estaExpulsado con dicho jugador. Si el método funciona adecuadamente,
	 * deberá devolver expulsado = false. Así utilizaremos un assertFalse para comprobar que esto sea así.
	 */
	
	@Test
	public void expulsadoFalse2() {
		System.out.println("Test 7");
		
		j1.setNumeroTarjetasAmarillas(1);
		
		assertFalse(j1.estaExpulsado());
	}
	
	/*
	 * Seguimos probando el método estaExpulsado, para ello utilizaremos el Jugador j1, y mediante el método 
	 * setNumeroTrajetasRojas, asignaremos el valor 1 a dicho atributo y dejaremos numeroTarjetasAmarillas a 0, 
	 * llamaremos al método estaExpulsado con dicho jugador. Si el método funciona adecuadamente,
	 * deberá devolver expulsado = true. Así utilizaremos un assertTrue para comprobar que esto sea así.
	 */
	
	@Test
	public void expulsadoTrueRoja() {
		System.out.println("Test 8");
		
		j1.setNumeroTarjetasRojas(1);
		
		assertTrue(j1.estaExpulsado());
	}
	
	/*
	 * Seguimos probando el método estaExpulsado, para ello utilizaremos el Jugador j1. Mediante el método 
	 * setNumeroTrajetasAmarillas, asignaremos el valor 2 a dicho atributo y dejaremos numeroTarjetasRojas a 0, 
	 * llamaremos al método estaExpulsado con dicho jugador. Si el método funciona adecuadamente,
	 * deberá devolver expulsado = true. Así utilizaremos un assertTrue para comprobar que esto sea así.
	 */
	
	@Test
	public void expulsadoTrueAmarilla() {
		System.out.println("Test 9");
		
		j1.setNumeroTarjetasAmarillas(2);
		
		assertTrue(j1.estaExpulsado());
	}
	
	/*
	 * Seguimos probando el método estaExpulsado, para ello utilizaremos el Jugador j1. Mediante el método 
	 * setNumeroTrajetasAmarillas, asignaremos el valor 1 a dicho atributo y mediante el método setNumeroTarjetasRojas,
	 * asignaremos el valor 2 a dicho atributo; llamaremos al método estaExpulsado con dicho jugador.
	 * Si el método funciona adecuadamente, deberá devolver expulsado = true. Así utilizaremos un assertTrue para comprobar 
	 * que esto sea así.
	 */
	
	@Test
	public void expulsadoTrue2() {
		System.out.println("Test 10");
		
		j1.setNumeroTarjetasAmarillas(2);
		j1.setNumeroTarjetasRojas(1);
		
		assertTrue(j1.estaExpulsado());
	}
}
