package cl.curso.java.excepcion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Programa1 {

	public static void main(String[] args) {
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-YYYY");
		String formatoFecha = format.format(new Date());
		System.out.println(formatoFecha);
		try{
			format.parse("22-03-2017");
		}catch(ParseException e){
			e.printStackTrace();
		}
		
	}
	
}
