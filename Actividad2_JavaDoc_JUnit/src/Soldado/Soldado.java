package Soldado;
/**
 * Clase que presenta a un soldado en un campo de tiro
 * 
 * 
 * El obejetivo de esta clase es informar el<b>estado del objeto  Soldado<b>,
 *  dependiendo de una serie de metodos, que en este caso nos informaran <u> si esta muerto</u> 
 *  y el <u>número de balas</u> puede disparar.
 * <br>
 * <b>Atributos de la clase</b>
 * <ul>
 * <li>estaMuerto</li>
 * <li>numeroBalas</li>
 * </ul>
 * 
 * @author Elvira Medina
 * @version 1.0
 * @since 3/11/2020
 *
 */
public class Soldado {
	
	//Datos privados de la clase
	
	/**
	 * Muerte del soldado, este atributo puede contener tres valores diferentes
	 * true, false y null
	 * 
	 */
	
	private boolean estaMuerto;
	
	/**
	 * Numero de balas que recibe el soldado, el numero de balas 
	 * es un valor mayor que 0, no  admite negativos
	 */

    private int numeroBalas;
    
    
    
    //Getter and setters

	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	
	
    /**
     * <b>Constructor por defecto</b>
     */
	
	public Soldado() {
		super();
	}
	
	/**
	 * <b>Contructor con los datos privados de la clase</b>
	 * <br>
	 * @param <b>estaMuerto:</b> nos informa si el soldado esta muerto o no.
	 * @param <b>numeroBalas:</b> representa el numero de balas que puede disparar el soldado
	 */
	
	public Soldado(boolean estaMuerto, int numeroBalas) {
		super();
		this.estaMuerto = estaMuerto;
		this.numeroBalas = numeroBalas;
	}
    
	

	
	/**El metodo establece si se puede disparar, si el numero de balas es mayor que 0,
	 * retorna true, se puede disparar. 
	 * <br>
	 * Si el numero de balas en menor que 0 retorna 
	 * false no se puede disparar, porque no hay balas.
	 * <br>
	 * @author Elvira
	 * @since 4/11/2020
	 * @param <b>numeroBalas:</b> representa el numero de balas que tiene el soldado.No admite negativos.
	 * @return <ul> 
	 * 			<li>true: El soldado tieen balas, puede disparar.</li>
	 * 			<li>false: El soldado no tieme balas, no puede disparar</li>
	 */
	
    public boolean puedeDisparar() {

        if(this.numeroBalas > 0) {

                      return true;

        }                          

        return false;

    }
    
    /**El metodo nos informa si un soldado puede disparar o no, si el numero de balas va decrementando y no puede 
       disparar, el soldado termianara muerto.
     * <br>
     * El metodo decrementa el numero da balas
     * <br>
     * @author Elvira
     * @param sol representa al Objeto Soldado
     * @since 25/01/2021
     * 
     */
    
    public void disparar(Soldado sol) {
    	
    	
        this.numeroBalas--;
        sol.estaMuerto = true;
        
       
    }

	
	

}
