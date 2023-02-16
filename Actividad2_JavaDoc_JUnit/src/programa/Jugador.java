package programa;
/**
 * El objetivo de esta clase es asignar un número de dorsal a los jugadores de un equipo hasta un máximo de 30 jugadores
 * y también determinar si el jugador está expulsado o no, en base al número de tarjetas rojas o amarillas que tenga.
 * 
 * Tendrá dos métodos:
 * - <u>ponerDorsal(int Dorsal)</u>
 * - <u>estaExpulsado(): boolean</u>
 * 
 * @author María Moreno Rodríguez
 * @version 1.0
 *
 */
public class Jugador {
/**
 * La clase posee tres atributos privados, y los tres son números de tipo entero:
 * - <b>dorsal</b>
 * - <b>numeroTarjetasAmarillas</b>
 * - <b>numeroTarjetasRojas</b>
 */
	private int dorsal;
	private int numeroTarjetasAmarillas;
	private int numeroTarjetasRojas;
	
	//Ahora generamos los getter y setter de los atributos
	
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}
	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}
	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}
	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	//Generamos el constrtuctor por defecto

	public Jugador() {
		super();
	}
	
	//Generamos el constructor con todos los atributos
	
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
/**
 * El método <b>ponerDorsal</b> permite asignar al jugador un número de dorsal entre el 1 y el 30, en caso de que el 
 * número de dorsal que se pase al método es menor de 1 o mayor de 30, el número de dorsal asignado al jugador será -1, 
 * por lo que se entiende que no formará parte del equipo.
 * 
 * 
 * @param dorsal es un número entero
 * 
 */
	public void ponerDorsal(int dorsal) {
		  if(dorsal >= 1 && dorsal <= 30) {

              this.dorsal = dorsal;

		  }else {

              this.dorsal = -1;

		  }
	}
	
	
	/**
	 * El método <b>estaExpulsado</b> permite determinar si un jugador está expulsado o no, para ello devuelve
	 * un atributo de tipo boolean, denominado <u>expulsado</u>, que se inicializa con el valor <u>false</u>, 
	 * de forma que si el jugador no tiene tarjetas ni amarillas ni rojas, o si tiene menos de 2 tarjetas amarillas,
	 * devolverá dicho valor. Dentro del método se desarrollan estructuras de tipo if, de forma que si el jugador 
	 * tiene dos tarjetas amarillas o una roja, el atributo expulsado devuelve el valor <u>true</u>.
	 * 
	 * 
	 * @return <b>false</b> en caso de que el jugador no esté expulsado, o <b>true</b>, en caso de que sí lo esté.
	 * 
	 */
	
	public boolean estaExpulsado() {
        boolean expulsado = false;                                                  

        if(numeroTarjetasAmarillas == 2) {

                      expulsado = true;

        }                          

        if(numeroTarjetasRojas == 1) {

                      expulsado = true;

        }                          

        return expulsado;
	}
	
}
