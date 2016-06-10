package cl.curso.java.hilobomba;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		Thread thread=new Thread(new HiloBomba());
		thread.start();
		thread.join();
		System.out.println("boomm!!");
		

	}

}
