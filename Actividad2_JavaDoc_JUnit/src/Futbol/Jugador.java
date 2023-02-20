package Futbol;
	/**
	 * <b>Clase Jugador</b>
	 * <br>
	 * Nos informa si un jugador es expulsado o no y de si el dorsal que porta el jugador es
	 * valido o no para competir en el partido.
	 * <br>
	 * @author Elvira
	 * @version 1.0
	 * 
	 *
	 */
public class Jugador {
	
	//Atributos de la clase 
	
	/**
	 * Número de Dorsal
	 */
    private int dorsal;
    
    /**
     * Número de tarjetas amarillas 
     * que recibe el jugador
     */
    
    private int numeroTarjetasAmarillas;
    /**
     * Número de tarjetas rojas 
     * que recibe el jugador
     */
    private int numeroTarjetasRojas;
    

    /**
     *<b>Constructor por defecto</b>
     */
	public Jugador() {
		super();
	}
	
	
	/**
	 * <b>Constructor con parametros</b>
	 *  <br>
	 * @param Representa el numero de <b>dorsal</b> asignado al jugador.
	 * @param <b>numeroTarjetasAmarillas:</b> representa el numero de tarjetas amarillas que recibe un jugador.
	 * @param <b>rnumeroTarjetasRojas</b> Representa el numero de tarjetas rojas que recibe un jugador.
	 */
	public Jugador(int dorsal, int numeroTarjetasAmarillas, int numeroTarjetasRojas) {
		super();
		this.dorsal = dorsal;
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	
	
	//Getter y Setter
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

	
	/** Metodo que nos informa, los dorsales de los jugadores.
	 * Tienen que estar comprendidos entre 1 y 30. Si el numero de dorsal que recibe 
	 * no esta comprendido entre ese intervalo, el dorsal es invalido y por lo tanto el jugador no puede jugar con ese dorsal.
	 * <br>
	 * No se admiten dorsales negativos ni dorsales que no esten comrpendidos entre los intervaleos 1 y 30.
	 * El dorsal que contiene el jugador es apto o no para poder jugar
	 * <br>
	 * @author Elvira
	 * @param <b>dorsal:</b> representa el numero con el que puede jugar el jugador
	 * @return<ul>
     *        <li> -1: Si el dorsal para porder jugar es invalido par apoder jugar</li>
     *        <li> Dorsal: si es válido para poder jugar</li>
     *        </ul>
     */
	  public void ponerDorsal(int dorsal) {

          if(dorsal >= 1 && dorsal <= 30) {

                        this.dorsal = dorsal;

          }else {

                        this.dorsal = -1;

          }
	  }              
	  /**
	   * Metodo que nos informa si un jugador esta expulsado, dependiendo 
	   * de las tarjetas amarillas y  tarjetas rojas que tenga
	   * <br>
	   * @author Elvira
	   * @return <ul>
     *           <li>True: El jugador es expulsado</li>
     *           <li>False: El jugador no esta expulsado</li>
     *           </ul>
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
