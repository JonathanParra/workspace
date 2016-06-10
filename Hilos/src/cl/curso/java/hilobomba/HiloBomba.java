package cl.curso.java.hilobomba;

public class HiloBomba implements Runnable {
		public String[] cuenta={"nueve","ocho","siete","seis","cinco","cuatro","tres","dos","uno","cero"};  
	public void run(){
		try{
			for(int ix=0;ix<9;ix++){
				System.out.println(cuenta[ix]);
				Thread.sleep(1000);
				
			}
			
		}catch(InterruptedException ex){
				ex.printStackTrace();
		}
		
	}

}
