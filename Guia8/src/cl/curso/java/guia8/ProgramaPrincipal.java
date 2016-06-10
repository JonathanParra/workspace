package cl.curso.java.guia8;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Fecha nueva=new Fecha(23,40,1993);
		
		try {
			nueva.validarMes();
		} catch (MesNoValidoException e) {
			System.out.println(e.getMessage());
			JOptionPane.showConfirmDialog(null, "Error");
			
		}

	}

}
