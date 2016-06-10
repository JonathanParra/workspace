package cl.curso.java.prueba_dos.jonathan.parra.pregunta3;

public class EstacionRutaVerde extends Estacion{

	/**
	 * constructor por defecto.
	 */
	public EstacionRutaVerde(){
		super();
	}
	/**
	 * Constructor con parametros.
	 */
	public EstacionRutaVerde(String nombre, String linea) {
		super(nombre, linea);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean seDetieneRutaRoja() {
		
		return false;
	}

	@Override
	public boolean seDetieneRutaVerde() {
		
		return true;
	}

}
