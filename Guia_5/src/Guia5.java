import java.util.Scanner;
import java.util.Arrays;

public class Guia5 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		int numero=0;
		int totalPagar=0;
		int opcion=0;
		int dias=0;
		int ix=0;
		String[] dia = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		int[] numeros={34,3,6,22,50};
		int aux=0;
		int tamano=0;
		String[] vec1;
		int[]vec2;
		//------------------------------Pregunta_1------------------------------------------
		System.out.println("Pregutna 1. \n ");
		System.out.print("ingrese año : ");
		numero = S.nextInt();
		if(numero%100==0 && numero%400!=0 )
			System.out.println("año NO bisiesto");
		else if(numero%4==0)
			System.out.println("año bisiesto.");
		else 
			System.out.println("año NO bisiesto.");
		
		//------------------------------Pregunta_2------------------------------------------
		System.out.println("Pregutna 2. \n ");
		System.out.print("ingrese area (1,2 o 3): ");
		opcion=S.nextInt();
		System.out.print("ingrese dias :  ");
		dias=S.nextInt();
		if(opcion==1)totalPagar=dias*150000;
		else if(opcion == 2)totalPagar=dias*120000;
		else if(opcion == 3)totalPagar=dias*200000;
		else totalPagar=dias*80000;
		System.out.println("Total a pagar : "+totalPagar);
		//------------------------------Pregunta_3------------------------------------------
		System.out.println("Pregutna 3. \n ");
		System.out.print("ingrese numero entre el 1 y 7 .");
			dias=S.nextInt();
			if(dias>0  && dias<8){
				System.out.print(dia[dias-1]);
			}
			else{
				System.out.print("Numero ingresado no valido");
			}
			System.out.print("\n\n");
			//------------------------------Pregunta_4-----------------------------------------
			System.out.println("Pregutna 4. \n ");
			System.out.print("[");
			for(int i =0;i<numeros.length;i++){
				System.out.print(numeros[i]+",");
			}
			System.out.print("]\n");
			
			for(int i =1;i < numeros.length;i++){
				for(int j=0;j<numeros.length - i ;j++){
					if(numeros[j]>numeros[j+1]){
						aux=numeros[j];
						numeros[j]=numeros[j+1];
						numeros[j+1]=aux;
						for(int p =0;p<numeros.length;p++){
							System.out.print(numeros[p]+",");
						}
					}
				}
			}
			
			System.out.print("[");
			for(int i =0;i<numeros.length;i++){
				System.out.print(numeros[i]+",");
			}
			System.out.print("]\n");
			//------------------------------Pregunta_5-----------------------------------------
			System.out.println("Pregutna 5. \n ");
			int longitud=0;
			System.out.print("ingrese tamaño del arreglo : ");
			tamano=sc.nextInt();
			String nombre=new String();

			try{
				
				vec1=new String[tamano];
				vec2=new int[tamano];
				System.out.print("ingrese nombres a su arreglo \n");
				for(int ax=0;ax<vec1.length;ax++){
					nombre=sc.next();
					vec1[ax]=nombre;
					
					}
				for(int jx=0; jx < vec1.length;jx++ ){
					longitud=vec1[jx].length();
					vec2[jx]=longitud;
				}
				for(int i=0;i<tamano;i++){
					System.out.print(vec1[i]+ ",");
					
				}
				System.out.print("\n");
				for(int ind=0;ind<tamano;ind++){
					System.out.print(vec2[ind]+",");
					
				}
				
			}catch(OutOfMemoryError ex){
				System.out.print("Memoria insuficiente.");
			}
		
			
			
		//------------------------------Pregunta_6-----------------------------------------
			System.out.println("Pregutna 6. \n ");
			int size= 0;
			System.out.print("ingrese tamaño del arreglo.(N)");
			size=sc.nextInt();
			int dato=0;
			int multiplo=0;
			int p=1;
			int[] vec3=new int[size];
			System.out.print("ingrese un numero para obtener sus N multiplos. ");
			multiplo=S.nextInt();
			for (int i =0;i<vec3.length ;i++){
				
				vec3[i]=multiplo*p;
				p=p+1;
				System.out.print( vec3[i]+",");
			}
			System.out.println("\n");
		//------------------------------Pregunta_7-----------------------------------------
			System.out.println("Pregutna 7. \n ");
			int persona=0;
			String bus;
			int total1=0;
			int pago_persona=0;
			System.out.print("ingrese el numero de personas : ");
			persona=S.nextInt();
			System.out.print("ingrese laletra correspondiente a su bus : ");
			System.out.println("A :$20xkm , B : $25xkm , C : $30xkm ");
			bus=S.next();
			if("a".equalsIgnoreCase(bus) ){
				if(persona<=20){
					System.out.print("/-------/////7--//// ");
					total1=400;
					pago_persona=total1/persona;
				}
				else
					total1=20*persona;
					pago_persona=20;
			}
			else if( "b".equalsIgnoreCase(bus)){
				if(persona<=20){
					total1=500;
					pago_persona=total1/persona;
				}
				else
					total1=25*persona;
					pago_persona=25;
			}
			else if( "c".equalsIgnoreCase(bus)){
				if(persona<=20){
					total1=600;
					pago_persona=total1/persona;
				}
				else
					total1=30*persona;
					pago_persona=30;
			}
			else{
				System.out.println("ERROR!, al ingresar.");
				}
			System.out.print("presupuesto = "+total1+"\n" );
			System.out.print("pago por persona = "+pago_persona+"\n" );
			System.out.print("\n");
		//------------------------------Pregunta_8-----------------------------------------
			System.out.println("Pregutna 8. \n ");
			int pe=0;
			int nz=0;
			int co=0;
			System.out.print("ingrese peso en gramos.");
			pe=S.nextInt();
			
			if(!(pe>5000)){
				System.out.println("ingrese zona.");
				System.out.println("1.-America del Norte.");
				System.out.println("2.-America Central.");
				System.out.println("3.-America del Sur.");
				System.out.println("4.-Europa.");
				System.out.println("5.-Asia.");
				nz=S.nextInt();
				switch(nz){
				
					case 1:
						co=pe*11;
						break;
					case 2:
						co=pe*10;
						break;
					case 3 : 
						co=pe*12;
						break;
					case 4:
						co=pe*24;
						break;
					case 5:
						co=pe*27;	
						break;
				}
				System.out.print(co);
			}else{
				System.out.print("NO SEDA ELSERVICIO.");
			}
			
			
		//-----------------------------------FIN--------------------------------------------
	}
	   
}
