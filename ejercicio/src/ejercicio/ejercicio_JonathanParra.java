package ejercicio;

import java.util.Scanner;

public class ejercicio_JonathanParra {
	
	
	
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
		 	System.out.println("----------------------------------------------------------------\n");
		 	/*-------------------------------------- */
		 	System.out.println("ej numero 9:suma de pares e impares");
		 	System.out.print("\n");
		 	for(x=1;x <= 100; x++){
		 		
		 		System.out.print(x);
		 	}
		 	System.out.print("\n");
		 	totalpar=100+100*100;
		 	totalimpar=100*100;
		 	System.out.println("suma total de pares : "+totalpar);
	 		System.out.println("suma total impares :"+totalimpar);
	 		numero=0;
	 		System.out.println("----------------------------------------------------------------\n");
		 /*------------------------------------------*/
	 		System.out.println("ej numero 10:multiplos de 2 y 3");
	 		System.out.print("\n");
	 		System.out.print("\n");
	 		for(int i=1;i<=100;i++ ){
	 			if(i%2==0 || i%3==0){
	 				System.out.print(i);
	 				numero++;
	 			}
	 		}
	 		System.out.print("\n");
	 		System.out.println("cantidad de numeros : "+numero);
	 		numero=0;
	 		System.out.println("----------------------------------------------------------------\n");
	 		/*---------------------------------------*/
	 		System.out.println("ej numero 11:reloj");
	 		System.out.print("\n");
	 		int h,m,s;
	 		System.out.println("ingrese la hora actual:");
	 		System.out.println();
	 		System.out.println("hora : ");
	 		h=S.nextInt();
	 		System.out.println("minutos : ");
	 		m=S.nextInt();
	 		System.out.println("segundo : ");
	 		s=S.nextInt();
	 		for(;h<24;h++){
	 			for(;m<60;m++){
	 				for(;s<60;s++){
	 					try {
							Thread.currentThread().sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	 					System.out.print(h+":"+m+":"+s);
	 				}
	 				
	 			}
	 		}
	 		System.out.println("----------------------------------------------------------------\n");
	 		/*----------------------------------------*/
	 		System.out.println("ej numero 12:factorial");
	 		System.out.print("\n");
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
	 		} total=1;
	 		System.out.println("----------------------------------------------------------------\n");
	 		/*------------------------------------------*/
	 		System.out.println("ej numero 13:primo");
	 		System.out.print("\n");
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
	 		System.out.println("----------------------------------------------------------------\n");
	 		/*---------------------------------------------*/
	 		System.out.println("ej numero 14:tabla de multiplicar.");
	 		System.out.print("\n");
	 		int numero_7=S.nextInt();
	 		int mult=1;
	 		
	 		
	 		for(int i=0;i<=10;i++){
	 			mult=i*numero_7;
	 			System.out.println(i+"*"+numero_7+" = " +mult);
	 			
	 		}mult=1;
	 		System.out.println("----------------------------------------------------------------\n");
	 		/*----------------------------------------------*/
	 		System.out.println("ej numero 15:calculadora.\n");
	 		int opcion;
	 		int numero1,numero2;
	 		float total3;
	 		System.out.println("1.-sumar : ");
	 		System.out.println("2.-resta : ");
	 		System.out.println("3.-division : ");
	 		System.out.println("4.-multiplicacion : ");
	 		System.out.println("ingrese su opcion.");
	 		opcion=S.nextInt();
	 		switch (opcion){
	 		
	 			case 1:
	 				System.out.println("ingrece el primer numero.\n");
	 				numero1=S.nextInt();
	 				System.out.println("ingresar segundo numero.\n");
	 				numero2=S.nextInt();
	 				total3=numero1 + numero2;
	 				System.out.println(numero1+"+"+numero2+ "= "+total3);
	 				break;
	 				
	 				
	 			case 2:
	 				System.out.println("ingrece el primer numero.\n");
	 				numero1=S.nextInt();
	 				System.out.println("ingresar segundo numero.\n");
	 				numero2=S.nextInt();
	 				total3=numero1 - numero2;
	 				System.out.println(numero1+"-"+numero2+ "= "+total3);
	 				break;
	 			case 3:
	 				System.out.println("ingrece el primer numero.\n");
	 				numero1=S.nextInt();
	 				System.out.println("ingresar segundo numero.\n");
	 				numero2=S.nextInt();
	 				if(numero2 != 0){
	 				total3=numero1 / numero2;
	 				System.out.println(numero1+"/"+numero2+ "= "+total3);
	 				}
	 				else
	 					System.out.println("ladivision por ' 0 ' no existe.");
	 					break;
	 			case 4:
	 				System.out.println("ingrece el primer numero.\n");
	 				numero1=S.nextInt();
	 				System.out.println("ingresar segundo numero.\n");
	 				numero2=S.nextInt();
	 				total3=numero1 * numero2;
	 				System.out.println(numero1+" * "+numero2+ "= "+total3);
	 				break;
	 				
	 					
	 		
	 		}
	 		System.out.println("----------------------------------------------------------------\n");
	 		/*---------------------------------------------*/
	 		System.out.println("ej numero 16:.\n");
	 		System.out.print("\n");
	 		System.out.println("ingrese numero.");
	 		int valor;
	 		valor=S.nextInt();
	 		if(valor==2)System.out.println("el numero es primo");
	 		else{
	 			for(int i=2;i<valor;i++){
	 				if(valor%i==0){
	 					System.out.println("el numero no es primo");
	 				}
	 				if(valor-1==i && valor%i!=0){
	 					System.out.println("el numero es primo.");
	 				}
	 			}
	 			
	 		}
	 		
	 		if(valor==0){
	 			System.out.println("el factorial es 1");
	 		}
	 		else{
	 		for(int p=1;p<=valor;p++){
	 			total=total*p;
	 		}
	 		System.out.println("el factorial es "+total);
	 		}
	 		
	 		for(int i=0;i<=10;i++){
	 			mult=i*numero_7;
	 			System.out.println(i+"*"+numero_7+" = " +mult);
	 			
	 		}
	 	S.close();	
	}
	

}	