package cl.curso.java.guia8;

public class Reloj {
	private int hora,minuto,segundos;
	public Reloj(){}
	public Reloj(int hora,int minuto, int segundos){
		this.hora=hora;
		this.minuto=minuto;
		this.segundos=segundos;
	}
	public int gethora(){
		return hora;
	}
	public void sethora(int hora){
		this.hora=hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	public void avanzarSegundo(){
		this.segundos+=1;
	}
	public void retrocederSegundo(){
		this.segundos-=1;
	}
	public void imprimirHora(){
		System.out.print(hora +":"+minuto+" : "+segundos);
	}
}
