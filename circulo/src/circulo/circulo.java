package Circulo;
import java.util.Vector;
import java.awt.*;


public class circulo {
	public static void main(String arg[]) {
		
		System.out.print("comienzo");
		Circle c=new Circle(2.0,2.0,4.0);
		System.out.println("Radio = "+c.r+" unidades.");
		System.out.println("centro = ("+c.r+","+c.y+")unidades");
		Circulo c1=new Circulo(1.0,1.0,2.0);
		Circulo c2=new Circulo(0.0,0.0,3.0);
		c=c1.elMayor(c2);
		System.out.println("el mayor radio es " +c.r+ ".");
		c=new Circulo()		//c.r = 0.0;
		c=Circulo.elMayor(c1,c2);
		
		
	}
}
