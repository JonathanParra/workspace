package cl.curso.java.bip;
import java.util.Date;

import java.util.Calendar;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		TarjetaClasica nueva=new TarjetaClasica(3000,123456,"azul");
		Calendar cal= Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 12);
		cal.set(Calendar.MONTH,5);
		cal.set(Calendar.YEAR,2016);
		cal.set(2016, 5, 23);
		Universitaria nuevo1=new Universitaria(2000,1234567890,"rojo","Jonathan",cal.getTime());
		Date hoy = new Date();
		System.out.println(hoy.after(cal.getTime()));
		System.out.println(hoy.before(cal.getTime()));
		nueva.recargar(1000);
		nueva.pagarViaje();
		nueva.imprimir();
		System.out.println("\n-------------\n\n");
		nuevo1.recargar(1000);
		nuevo1.pagarViaje();
		nuevo1.pagarViaje();
		nuevo1.recargar(1000);
		nuevo1.imprimir();
		
	}

}
