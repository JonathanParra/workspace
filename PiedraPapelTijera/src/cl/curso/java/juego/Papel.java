package cl.curso.java.juego;

public class Papel extends Jugada {

		
	public void jugar(Jugada jugar){
		jugar.jugarContraPapel();
	}

	@Override
	public void jugarContraPapel() {
		System.out.println("sjcjs");
		
	}

	@Override
	public void jugarContraPiedra() {
		System.out.println("sjcjs");
		
	}

	@Override
	public void jugarContraTijera() {
		System.out.println("sjcjs");
		
	}
	
	
}
