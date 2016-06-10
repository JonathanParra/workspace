package data.races;

public class Programa {

	public static void main(String[] args) {
		Contador contador=new Contador(0);
		
		AumentaThread nuevo=new AumentaThread(contador);
		AumentaThread nuevo1=new AumentaThread(contador);
		
		nuevo.start();
		nuevo1.start();
		
		
		/*for (int x = 0; x < 1000; x++) {
			try {
				Thread.sleep(1000);
				System.out.println(x++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}*/

	}

}
