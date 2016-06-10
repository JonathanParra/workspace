package digitosNumero;
import java.util.*;
//int->string=interger.toString(int));  string-->int=Interger.parseInt(string);   return char de un string -->cadena.charAt(index). 
public class DigNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		int numero;
		int aux;
		int[] vec1;
		char aux1;
		System.out.print("numero : ");
		numero=S.nextInt();
		
		String a=Integer.toString(numero);
		
		vec1=new int[a.length()];
		for(int i =0;i<a.length();i++){
			aux1=a.charAt(i);
			aux=Integer.parseInt(a.valueOf(aux1));
			vec1[i]=aux;
		}
		for(int i =0;i<vec1.length;i++){
			System.out.println(vec1[i]);
		}
	}

}
