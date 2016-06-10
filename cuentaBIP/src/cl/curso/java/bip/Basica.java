package cl.curso.java.bip;
import java.util.Date;

public class Basica extends TNE {
	public Basica(int saldo,int numeroTarjeta,String color,String nombre,Date fechaExp){
		super(saldo,numeroTarjeta,color,nombre,fechaExp);
	}
	public void recargar(int carga){
		carga=0;
		if(this.getFechaExp().before(new Date())){
			super.setSaldo(carga);
		}
		else{
			System.out.println("no puede cargar.");
		}
	}
	public void pagarViaje(){
		super.setSaldo(0);
	}
	
}
