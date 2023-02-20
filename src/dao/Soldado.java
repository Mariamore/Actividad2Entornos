package dao;

public class Soldado {
	
	/**
	 * Esta es la clase soldado.
	 * OMG ¿Estamos en guerra? No me gustan las guerras porque los soldados se mueren
	 * 
	 * @author Grupo6 de Entornos de Desarrollo DAM
	 */

    private boolean estaMuerto;
    private int numeroBalas;

   

    public boolean isEstaMuerto() {
    	/**
    	 * @return Devuelve estaMuerto (boolean), true si esta muerto y false si esta vivo 
    	 */
		return estaMuerto;
	}
	public void setEstaMuerto(boolean estaMuerto) {
		/**
		 * @param estaMuerto (boolean), dame true si esta muerto y false si esta vivo 
		 */
		this.estaMuerto = estaMuerto;
	}
	public int getNumeroBalas() {
		/**
		 * El numero de balas que tiene un soldado son las balas que lleva dentro. 
		 * Cuantas mas balas, más probabilidades tiene  de estar muerto.
		 * Es un poco triste pensar en guerras y pobres soldados que mueren en combate.
		 * 
		 * @author Gropo6 ED
		 * @return Devuelve numeroBalas (int) con el numero de balas que tiene el soldado
		 */
		return numeroBalas;
	}
	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
	

    public boolean puedeDisparar() {

                  if(this.numeroBalas > 0) {

                                return true;

                  			}                          

                  return false;
    			}
    
	public void disparar(Soldado sol) {

        this.numeroBalas--;

        sol.estaMuerto = true;

}

}
