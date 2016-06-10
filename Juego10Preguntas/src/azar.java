import java.util.Random;
import java.util.Scanner;

public class azar {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int intentos=0;
		int numeroIng=0;
		boolean busqueda=false;
		Random rnd = new Random();
		int numero=(int)(rnd.nextDouble()*100);
		while(numeroIng!=numero && intentos<10){
			
				System.out.print("ingrese un numero : ");
				numeroIng=S.nextInt();
				if(numeroIng<numero){
					System.out.println("el numero ingresadoes es menor");
				}
				else if(numeroIng>numero){
					System.out.println("su numero ingresado es mayor ");
				}
				if(numeroIng==numero){
					busqueda=true;
				}
			intentos++;
		}
		if(busqueda==true){
			System.out.println("numero encontrado el numero a buscar era :"+numero);
		}
		else
			System.out.println("numero no encontrado");
		S.close();
	}
	


}
