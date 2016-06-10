package cl.curso.java.juego;

public class Piedra extends Jugada {

	public void jugar(Jugada jugar){
		jugar.jugarContraPiedra();
	}

	@Override
	public void jugarContraPapel() {
		// TODO Auto-generated method stub
		System.out.println("sjcjs");
	}

	@Override
	public void jugarContraPiedra() {
		// TODO Auto-generated method stub
		System.out.println("sjcjs");
	}

	@Override
	public void jugarContraTijera() {
		// TODO Auto-generated method stub
		System.out.println("sjcjs");
	}
}
