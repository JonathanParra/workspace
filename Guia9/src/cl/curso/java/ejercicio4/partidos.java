package cl.curso.java.ejercicio4;

public class partidos {

	public static void main(String[] args) {
		Equipo nuevo=new Equipo("Real",3,2,3,8,12);
		nuevo.ganar();
		nuevo.ganar();
		nuevo.empatar();
		nuevo.perder();
		nuevo.perder();
		nuevo.ganar();
		nuevo.imprimir();
		

	}

}
