package cl.curso.java.juego;

public class Tijera extends Jugada {

	public  void jugar(Jugada jugar){
		jugar.jugarContraTijera();
	}

	@Override
	public void jugarContraPapel() {
		// TODO Auto-generated method stub
		System.out.println("sjcjs");
	}

	@Override
	public void jugarContraPiedra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jugarContraTijera() {
		// TODO Auto-generated method stub
		
	}
}
