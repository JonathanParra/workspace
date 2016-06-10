package cl.curso.java.hilo;

public class EjemploHilo extends Thread {
	
	public void run() {
		try{
			sleep(1000);
			
		}catch(InterruptedException ex){
			
		}
		System.out.println("el nombre del thread es : "+getName());
	}

}
