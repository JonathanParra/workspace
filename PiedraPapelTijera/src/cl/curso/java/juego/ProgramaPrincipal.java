package cl.curso.java.juego;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Piedra piedra=new Piedra();
		Papel papel=new Papel();
		Tijera tijera=new Tijera();
		piedra.jugar(papel);
		papel.jugar(tijera);
		piedra.jugar(piedra);

	}

}
