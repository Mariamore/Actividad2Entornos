package programa;

/**
 * La clase <b>Jugador</b> define objetos de jugadores con información sobre su número de dorsal, 
 * el número de tarjetas amarillas que ha recibido y el número de tarjetas rojas que ha recibido.
 * 
 * @author Álvaro Tercero
 * @version 1.0
 *
 */

public class Jugador {
	
	/**
	 * Número de dorsal que tiene el jugador.
	 */
	private int dorsal;
	
	/**
	 * Número de tarjetas amarillas que ha recibido.
	 */
	private int numeroTarjetasAmarillas;
	
	/**
	 * Número de tarjetas rojas que ha recibido.
	 */
	private int numeroTarjetasRojas;
	
	//Generamos los métodos get y set de cada atributo.
	
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
	
	//Generamos un constructor vacío y otro con todos los atributos.

	public Jugador() {
		super();
	}
	
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	/**
	 * Método que establece que el dorsal sea <u>un número entre 1 y 30</u>. Si no es así, establece el valor del dorsal en <u>-1</u>.
	 * @param dorsal representa el número que el jugador lleva impreso en la camiseta.
	 */
	public void ponerDorsal(int dorsal) {
		  if(dorsal >= 1 && dorsal <= 30) {
              this.dorsal = dorsal;
		  }
		  else {
              this.dorsal = -1;
		  }
	}
	
	/**
	 * Método que devuelve si el jugador ha sido expulsado o no dependiendo del número y del tipo de tarjetas recibidas.
	 * @return Si el jugador ha recibido dos tarjetas amarillas o una tarjeta roja, devuelve <u>true</u>.
	 * En otros casos devuelve <u>false</u>.
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
