package cl.java.fecha.noChequiada;

public class FechaNoValidaException extends Exception {
	public FechaNoValidaException(){
		super("la fecha no es valida.");
	}
}
