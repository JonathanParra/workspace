package cl.curso.java.semaforo;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Rojo rojo=new Rojo();
		Semaforo semaforo=new Semaforo(rojo);
		
		while(true){
			semaforo.cambiarColor();
			Thread.sleep(1000);
		}
		
		
	}

}
