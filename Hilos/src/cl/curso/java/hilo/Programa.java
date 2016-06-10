package cl.curso.java.hilo;

public class Programa {

	public static void main(String[] args) {
		EjemploHilo thread=new EjemploHilo();
		//thread.run();
		thread.start();
		System.out.println("metodo main; El nombre del thread es :"+thread.currentThread().getName() );

	}

}
