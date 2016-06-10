package cl.curso.java.prueba_dos.jonathan.parra.pregunta3;
/**
 * 
 * @author Jonathan Parra
 *
 */
public class TrenRutaRoja extends Tren{
	/**
	 * constructor por defecto.
	 */
	public TrenRutaRoja(){
		super();
	}
	/**
	 * Constructor con parametros.
	 */
	public TrenRutaRoja(int numero, String linea) {
		super(numero, linea);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * metodo  heredado por la class Tren
	 */
	@Override
	public boolean seDetiene(Estacion estacion) {
		
		return estacion.seDetieneRutaRoja();
	}
	
	
}
