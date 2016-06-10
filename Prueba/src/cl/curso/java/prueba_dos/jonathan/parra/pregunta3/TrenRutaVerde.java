package cl.curso.java.prueba_dos.jonathan.parra.pregunta3;

public class TrenRutaVerde extends Tren{
	/**
	 * constructor por defecto.
	 */
	public TrenRutaVerde(){
		super();
	}
	/**
	 * Constructor con parametros.
	 */
	public TrenRutaVerde(int numero, String linea) {
		super(numero, linea);
		// TODO Auto-generated constructor stub
	}
	/**
	 * metodo  heredado de la class Tren
	 */
	@Override
	public boolean seDetiene(Estacion estacion) {
		
		return estacion.seDetieneRutaVerde();
	}

}
