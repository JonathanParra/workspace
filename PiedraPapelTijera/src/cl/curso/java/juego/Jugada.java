package cl.curso.java.juego;

public abstract class Jugada {
	
	public Jugada(){}
	
	public abstract void jugar(Jugada jugar);
	public abstract void jugarContraPapel();
	public abstract void jugarContraPiedra();
	public abstract void jugarContraTijera();
}
