package cl.curso.java.prueba_dos.jonathan.parra.pregunta3;

public class EstacionComun extends Estacion {
	
	/**
	 * constructor por defecto.
	 */
	public EstacionComun(){
		super();
	}
	/**
	 * Constructor con parametros.
	 */
	public EstacionComun(String nombre, String linea) {
		super(nombre, linea);
		
	}

	@Override
	public boolean seDetieneRutaRoja() {
		
		return true;
	}

	@Override
	public boolean seDetieneRutaVerde() {
		
		return true;
	}

}
