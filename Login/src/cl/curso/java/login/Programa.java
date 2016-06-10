package cl.curso.java.login;

public class Programa {

	public static void main(String[] args) {
		long  div=0;
		for(long ix=1000000000; ix > 0;ix--){
			
			for(long  j=2 ; j < ix ; j++){
				if(ix%j==0){
					div++;
				}
			}
			if(div==0){
				System.out.println(ix+"");
			}
			else{
				div=0;
			}
		}
		
	}

}
