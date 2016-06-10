package Reloj;

public class Reloj {
	private int hora;
	private int minutos;
	private int segundos;
	private boolean alarma;

	public Reloj(){
		this.hora=0;
		this.minutos=0;
		this.segundos=0;
		this.alarma=true;
	}
	
	public Reloj(int hora, int minutos, int segundos) {
		super();
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	


	public boolean isAlarma() {
		return alarma;
	}

	public void setAlarma(boolean alarma) {
		this.alarma = alarma;
	}

	public void aumentarSegundo(){
		synchronized(this){
		this.setSegundos(this.getSegundos()+1);
		if(this.getSegundos()==60){
			this.setSegundos(0);
			this.aumentarMinuto();
			
		}
		
		}
	}
	public void aumentarMinuto(){
		
		this.setMinutos(this.getMinutos()+1);
		if(this.getMinutos()==60){
			this.setMinutos(0);
			this.aumentarHora();
		}
		
	}
	public void aumentarHora(){
		
		this.setHora(this.getHora()+1);
		if(this.getHora()==24){
			this.setHora(0);
		}
		
		
	}

	
	
}
