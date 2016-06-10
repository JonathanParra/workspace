package Reloj;

public class Programa {

	public static void main(String[] args) {
		Reloj reloj=new Reloj();
		Timer nuevo = new Timer(reloj);
		ApagarReloj inst=new ApagarReloj(reloj, 10000);
		nuevo.start();
		inst.start();

	}

}
