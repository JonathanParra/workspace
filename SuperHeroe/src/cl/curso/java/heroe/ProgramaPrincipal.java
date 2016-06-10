package cl.curso.java.heroe;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batman batman=new Batman();
		SuperMan superman=new SuperMan();
		Criptonita criptonita=new Criptonita();
		Granada granada=new Granada();
		batman.recibirAtaque(granada);
		superman.recibirAtaque(criptonita);
		
	}

}
