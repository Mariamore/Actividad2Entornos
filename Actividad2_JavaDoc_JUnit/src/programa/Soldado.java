package programa;

/**
 * La clase <b>Soldado</b> define objetos de soldados con información sobre si está muerto o no y con el número de balas que posee.
 * 
 * @author Álvaro Tercero
 * @version 1.0
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
	
	// Creamos los métodos get y set de cada atributo.
	
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
	
	// Creamos un constructor vacío y otro con todos los atributos.
	
	public Soldado() {
		super();
	}
	
	public Soldado(boolean estaMuerto, int numeroBalas) {
			super();
			this.estaMuerto = estaMuerto;
			this.numeroBalas = numeroBalas;
	}
	
	/**
	 * Método que determina si el soldado puede disparar o no, dependiendo de si tiene balas.
	 * 
	 * @return Si el número de balas es mayor que 0, devuelve <u>true</u>. Si es 0 o menor que 0, devuelve <u>false</u>.
	 */
	public boolean puedeDisparar() {
		if (this.numeroBalas > 0)
			return true;
		
		return false;
	}
	
	/**
	 * Método que resta una bala al soldado y hace que éste pase a estar muerto.
	 * 
	 * @param sol representa un objeto de la clase Soldado.
	 */
	public void disparar(Soldado sol) {
		this.numeroBalas--;
		
		sol.estaMuerto=true;
	}
	
}

