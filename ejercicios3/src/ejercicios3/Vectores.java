package ejercicios3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vectores {
	public static void main(String[] args) {
		
		int[] arr={0,28,30,10,4};
		int[] vec={1,3,6,82,23};
		int[] vec2={90,1,38, 0, 29,4};
		int[] vec3={40,30,60,70,39,50};
		Scanner S=new Scanner(System.in);
		int valor2=0;
		List<Integer> newvector = new ArrayList<Integer>();
		List<Integer> notasSobrePromedio = new ArrayList<Integer>();
		int numero=0;
		
		int menor =arr[0];
		int j=0;
		int t = 0;
		//------------------------------------------------------------
		for(int i = 0;i<5;i++){
			System.out.println(i+ " = " +arr[i]+"\n");	
		}
		System.out.print("--------------------------------------\n");
		//------------------------------------------------------------
		
		for(int i=4;i>=0;i--){
			System.out.println(i+ " = "+arr[i]);
		}
		
		System.out.print("--------------------------------------\n");
		//------------------------------------------------------------
		
		
		int res=0;
		for(int n=0;n<5;n++){
			res += vec[n];
		}
		System.out.print("Suma total = "+res);
		
		
		System.out.print("--------------------------------------\n");
		//------------------------------------------------------------
		
		while(j<5)
		{
			if(menor>vec2[j]){
				menor =vec2[j];
			}
			else{
				j++;
			}
		}
		System.out.println("El menor es : " +menor+"\n");
		
		System.out.print("--------------------------------------\n");
		//------------------------------------------------------------
		int i=0;
		int a=0;
		int b=4;
		int grd=0;
		System.out.print("1-. ");
		for(int l=0;l<5;l++){
			System.out.print(arr[l]+" ");
		}		
		while(i<3){
			grd=arr[a];
			arr[a]=arr[b];
			arr[b]=grd;
			b--;
			a++;
			i++;	
		}
		System.out.print("\n");
		System.out.print("2-. ");
		for(int r=0;r<5;r++){
			System.out.print( arr[r]+" ");
		}
		System.out.print("\n");
		
		System.out.print("--------------------------------------\n");
		//------------------------------------------------------------
		float total=0;
		for(t=0;t<6;t++){
			
			total += vec3[t];
		}
		total=total/6;
		int valor1=0;
		for(t=0;t<6;t++){
			if(vec3[t]>total){
				valor1=vec3[t];
				notasSobrePromedio.add(valor1);	
			}
		}
		
		/*for( int ix = 0; ix < notasSobrePromedio.size() ; ix ++ )
		{
			System.out.print(notasSobrePromedio.get(ix)); //imprime uno a uno.
		}*/
		System.out.print(notasSobrePromedio);
		System.out.print("\n");
		System.out.print("--------------------------------------\n");
		//------------------------------------------------------------
			System.out.print("ingrese el tamaño  del arreglo o vector: " );
			numero=S.nextInt();
			System.out.print("ingrese valores del arreglo o vector: " );
			for(i=0;i<numero;i++){
				valor2=S.nextInt();
				newvector.add(valor2);
			}
			System.out.print("\n");
			
			System.out.print(newvector);
		
			
			System.out.print("\n");
			System.out.print("--------------------FIN------------------\n");
			S.close();
		//----------------------------FIN--------------------------------	
	}
}
