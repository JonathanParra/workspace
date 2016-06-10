package cl;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		
		int dividendo=obtenerNumero("dividendo");
		int divisor=obtenerNumero("divisor");
		Division division=new Division(dividendo,divisor);
		try{
			division.hacerDivision();
		}catch(ArithmeticException e){
			JOptionPane.showMessageDialog(null, "Error al realizar la division"+ e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	
	
	}
	
	public static int obtenerNumero(String uno){
		int dividendostr=0;
		boolean numeroValido=false;
		do{
			try{
				String dos=JOptionPane.showInputDialog("Ingresar"+uno);
				dividendostr=Integer.parseInt(dos);
				numeroValido=!numeroValido;
			
			}catch(NumberFormatException e){
				System.out.println("debeingresar un numero y no un caracter. .");
			}
			
		}while(!numeroValido);
		return dividendostr;
		
	}

}
