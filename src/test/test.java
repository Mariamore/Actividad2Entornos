package test;
import dao.Soldado;
import dao.Jugador;

public class test {

	public static void main(String[] args) {

		Soldado soldado1 = new Soldado();
		
		soldado1.setNumeroBalas(0);
		System.out.println(soldado1.getNumeroBalas());
		
		Jugador jugador1 = new Jugador();
		
		jugador1.ponerDorsal(1);
		jugador1.setNumeroTarjetasAmarillas(2);
		
		assertTrue("Está expulsado", jugador1.estaExpulsado()); 
		
	}

}
