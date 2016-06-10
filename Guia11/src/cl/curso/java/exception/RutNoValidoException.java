package cl.curso.java.exception;

public class RutNoValidoException extends RuntimeException {
	
	public RutNoValidoException(){
		super("RUT NO VALIDO");
	}
}
