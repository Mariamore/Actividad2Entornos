package programa;

/**
 * 
 * El objetivo de esta clase es determinar si un soldado <b> tiene suficientes balas para disparar </b>
 * y si <b> está vivo o muerto</b>
 * 
 * Tendrá dos métodos:
 * - <u>puedeDisparar(): boolean</u>
 * - <u>disparar(Soldado sol)</u>
 * 
 * 
 * @author María Moreno Rodríguez
 * @version 1.0
 * 
 */

public class Soldado {

	/**
	 * Estado de vida del soldado. El valor <u>true</u> indica que está muerto. 
	 * El valor <u>false</u> indica que está vivo.
	 */
	private boolean estaMuerto;
	/**
	 * Número de balas que posee el soldado.
	 */
	private int numeroBalas;
	
	//Generamos los getters y setters
	
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
	
	//Generamos el constructor por defecto
	
	public Soldado() {
		super();
	}
	
	//Generamos el constructor con todos los atributos
	
	public Soldado(boolean estaMuerto, int numeroBalas) {
			super();
			this.estaMuerto = estaMuerto;
			this.numeroBalas = numeroBalas;
	}
	
	/**
	 * El método <b>puedeDisparar</b> nos permite distinguir si el soldado tiene balas y, por tanto, puede disparar,
	 * devolviendo <u>true</u>, o si por el contrario, no tiene balas y no puede disparar, devolviendo en ese caso 
	 * <u>false</u>.
	 * 
	 * 
	 * @return <b>true<7b> si numeroBalas es mayor de 0, <b>false</b> en caso contrario o si numeroBalas es igual a 0
	 */
	public boolean puedeDisparar() {
		if (this.numeroBalas > 0)
			return true;
		
		return false;
	}
	
	/**
	 * El método <b>disparar</b> resta una unidad del número de balas del soldado que llama a dicho método, y 
	 * cambia el atributo estaMuerto del soldado que pasamos al método a <u>true</u>. Como es void, no devuelve nada.
	 * 
	 * @param sol es un objeto de la clase Soldado
	 * 
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		
		sol.estaMuerto=true;
	}
	
}

