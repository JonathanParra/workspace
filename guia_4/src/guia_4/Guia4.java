package guia_4;
import java.util.Scanner;

public class Guia4 {
	
	public static int Fibonacci(int x){
		
		if(x==0){
			System.out.print("0");
			return 0;
		}
		if(x==1){
			System.out.print("1");
			return 1;
		}
		System.out.print(" ");
		return x=Fibonacci(x+x);
	}

	public static void main(String[] args) {
		//Ejercicio_1.
		int Ncita=0;
		int totalPagar=0;
		int n=0;
		Scanner S=new Scanner(System.in);
		//----------------------------------------------------------------------------------------
		System.out.print("numero de cita : ");
		Ncita=S.nextInt();
		if(Ncita <=3)System.out.println("pagar: 200.000");
		else if(Ncita ==4 || Ncita==5)System.out.println("pagar: 150.000");
		else if(Ncita>5 && Ncita<9)System.out.println("pagar: 100.000");
		else System.out.println("pagar: 50.000");
		
		for(int i =1;i<=Ncita;i++){
			if(i<4)totalPagar=totalPagar + 200000;
			else if(i<6 && i>3)totalPagar=totalPagar+150000;
			else if(i>5 && i<9)totalPagar=totalPagar+100000;
			else  totalPagar=totalPagar+50000;
			
			
		}
		System.out.print("total a pagar : "+totalPagar);
		n=S.nextInt();
		Guia4.Fibonacci(n);
		
//----------------------------------------------------------------------------------
//Ejercicio_2.
			int clave=0;
			double costo_produccion=0;
			double materia_prima=0;
			double mano_obra=0;
			double gastos_fabricacion=0;
			double precio_venta=costo_produccion + costo_produccion*0.45;   // resultado.
			System.out.print("ingrese costo de materias primas.");
			materia_prima=S.nextInt();
			System.out.print("ingrese gastos de fabricacion.");
			gastos_fabricacion=S.nextInt();
			System.out.println("ingrese clave.");
			clave=S.nextInt();
			
			if(clave==1 || clave == 4){
				gastos_fabricacion += gastos_fabricacion*0.28;
					if(clave == 4)mano_obra +=materia_prima*0.75;
					else if(clave==1)mano_obra +=materia_prima*0.80; 
					else {}
			}
			else if(clave == 2 || clave == 5){
				gastos_fabricacion += gastos_fabricacion*0.3;
				if(clave == 2)mano_obra +=materia_prima*0.85; 
				else if(clave==5)mano_obra +=materia_prima*0.80; 
				else {}
			}
			else if(clave == 3 || clave == 6){
				gastos_fabricacion+= gastos_fabricacion*0.35;
				if(clave==3)mano_obra +=materia_prima*0.75; 
				else if(clave==6)mano_obra +=materia_prima*0.85; 
				else {}
			}
			precio_venta=costo_produccion + costo_produccion*0.45;   //resultado.
			System.out.println("precio de venta : "+precio_venta);	
	//----------------------------------------------------------------------------------
//----------------------------------------------------------------------------------
//Ejercicio_3.
		int tiempo=0;
		int pagar=0;
		System.out.print("tiempo.");
		if(tiempo <= 2)pagar= 500*tiempo;
		else if(tiempo>2 && tiempo<=5)pagar= 400*tiempo+200;
		else if(tiempo >5 && tiempo <=10)pagar=300*tiempo +1500;
		else
			pagar = 200*tiempo + 4000;
	//----------------------------------------------------------------------------------
	
//----------------------------------------------------------------------------------
//Ejercicio_4.
		
		
		
	//----------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------
	//Ejercicio_5.pene
		
	//----------------------------------------------------------------------------------
			S.close();
	}

	

}
