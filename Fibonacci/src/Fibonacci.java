
import java.util.Scanner;

public class Fibonacci {

	public static int F(int x){
		if(x<2)return 1;
		else return F(x-1) + F(x-2);
	}
	
	public static void Fib(double x){
		double numero=0;
		double numero1=1;
		double valor=0;
		double ix=0;
		while(ix<x){
			valor=numero + numero1;
			numero=numero1;
			numero1=valor;
			System.out.println(valor);
			ix++;
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		int valor=0;
		double valor2=0;
		Scanner S=new Scanner(System.in);
		//numero=S.nextInt();
		valor2=S.nextDouble();
		Fib(valor2);
		/*for(int i =0;i<numero;i++){
			valor=F(i);
			System.out.println(valor);
		}*/
	}

}
