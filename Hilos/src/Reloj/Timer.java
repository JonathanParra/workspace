package Reloj;

import java.net.Socket;

public class Timer extends Thread{
	
	private Reloj reloj;
	
	public Timer(Reloj reloj) {
		super();
		this.reloj = reloj;
	}

	public void run(){
		
		
		while(this.getReloj().isAlarma()){
			this.getReloj().aumentarSegundo();
			System.out.println(this.getReloj().getHora()+" : "+this.getReloj().getMinutos()+" : "+this.getReloj().getSegundos());
			try {
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Reloj getReloj() {
		return reloj;
	}

	public void setReloj(Reloj reloj) {
		this.reloj = reloj;
	}

}
