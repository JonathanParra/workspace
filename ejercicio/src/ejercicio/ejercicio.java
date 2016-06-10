package ejercicio;

import java.util.Scanner;

public class ejercicio {
	
	
	
	public static void main(String[] args) 
	{
		
		 Scanner S=new Scanner(System.in);
		 	int numero=0;
		 	int x;
		 	int totalpar=0;
		 	
		 	int totalimpar=0;
		 	System.out.println();
		 	System.out.println("ej numero 8:par o impar.\n");
		 	System.out.println();
		 	numero=S.nextInt();
		 	if(numero%2==0)
		 	{
		 		System.out.println("numero par");
		 	}
		 	else{
		 		System.out.println("numero impar");
		 		}
		 	/*-------------------------------------- */
		 	System.out.println("ej numero 9:suma de pares e impares");
		 	for(x=0;x <= 100; x++){
		 		
		 		System.out.println(x);
		 	}
		 	totalpar=100+100*100;
		 	totalimpar=100*100;
		 	System.out.println("suma total de pares : "+totalpar);
	 		System.out.println("suma total impares :"+totalimpar);
	 		numero=0;
		 /*------------------------------------------*/
	 		System.out.println("ej numero 10:multiplos de 2 y 3");
	 		for(int i=1;i<=100;i++ ){
	 			if(i%2==0 || i%3==0){
	 				System.out.println(i);
	 				numero++;
	 			}
	 		}
	 		System.out.println("cantidad de numeros"+numero);
	 		numero=0;
	 		/*---------------------------------------*/
	 		System.out.println("ej numero 11:reloj");
	 		
	 		/*----------------------------------------*/
	 		System.out.println("ej numero 12:factorial");
	 		numero=S.nextInt();
	 		int total=1;
	 		if(numero==0){
	 			System.out.println("el factorial es 1");
	 		}
	 		else{
	 		for(int p=1;p<=numero;p++){
	 			total=total*p;
	 		}
	 		System.out.println("el factorial es "+total);
	 		}
	 		/*------------------------------------------*/
	 		System.out.println("ej numero 13:primo");
	 		int a=S.nextInt();
	 		if(a==2)System.out.println("el numero es primo");
	 		else{
	 			for(int i=2;i<a;i++){
	 				if(a%i==0){
	 					System.out.println("el numero no es primo");
	 				}
	 				if(a-1==i && a%i!=0){
	 					System.out.println("el numero es primo.");
	 				}
	 			}
	 			
	 		}
	 		a=0;
	 		/*---------------------------------------------*/
	 		System.out.println("ej numero 14:tabla de multiplicar.");
	 		a=S.nextInt();
	 		int mult=1;
	 		
	 		
	 		for(int i=0;i<=10;i++){
	 			mult=i*a;
	 			System.out.println(i+"*"+a+" = " +mult);
	 			i++;
	 		}
	
	}
	
	
}	