package cl.curso.java.prueba_dos.jonathan.parra.pregunta3;

public class EstacionRutaRoja extends Estacion{
	/**
	 * constructor por defecto.
	 */
	public EstacionRutaRoja(){
		super();
	}
	
	/**
	 * Constructor con parametros.
	 */
	public EstacionRutaRoja(String nombre, String linea) {
		super(nombre, linea);
		
	}

	@Override
	public boolean seDetieneRutaRoja() {
		
		return true;
	}

	@Override
	public boolean seDetieneRutaVerde() {
		
		return false;
	}
	
	
}
