package cl.curso.java.bip;
import java.util.Date;
public class Universitaria extends TNE {
	/**
	 * Constructor.
	 * @param saldo
	 * @param numeroTarjeta
	 * @param color
	 * @param nombre
	 * @param fechaExp
	 */
	public Universitaria(int saldo,int numeroTarjeta,String color,String nombre,Date fechaExp){
		super(saldo,numeroTarjeta,color,nombre,fechaExp);
	}
	public void recargar(int carga){
		if(carga<400){
			System.out.println("la carga es menor al minimo");
		}
		else if(carga<=25000){
			super.setSaldo(super.getSaldo()+carga);
		}else{
			System.out.println("la carga exede el maximo.");
		}
	}
	public void pagarViaje(){
		if(super.getSaldo()>=210)
			super.setSaldo(super.getSaldo()-210);
		else
			System.out.println("saldo insuficiente.");
	}
	
}
