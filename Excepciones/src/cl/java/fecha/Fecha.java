package cl.java.fecha;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class Fecha {

	public static void main(String[] args) {
		String fecha=JOptionPane.showInputDialog("ingrese una fecha .");
		SimpleDateFormat sFormat = new SimpleDateFormat("dd-MM-YYYY");
		
		
		try{
			SimpleDateFormat sFormat1 = new SimpleDateFormat("'");
			sFormat1.format(new Date());
			Date date = sFormat.parse(fecha);
		}catch(ParseException e){
			JOptionPane.showConfirmDialog(null, "Error", "la Fecha ingresadano es correcta", JOptionPane.ERROR_MESSAGE);
		}catch(Exception e){
			JOptionPane.showConfirmDialog(null, "Error", "la Fecha ingresadano es correcta", JOptionPane.ERROR_MESSAGE);
		}
						

	}

}
