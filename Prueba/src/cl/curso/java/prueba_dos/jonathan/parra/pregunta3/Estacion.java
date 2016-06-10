package cl.curso.java.prueba_dos.jonathan.parra.pregunta3;
/**
 * 
 * @author Jonathan Parra
 *
 */
public abstract class Estacion {
	private String nombre;
	private String linea;
	/**
	 * constructor por defecto.
	 */
	public Estacion(){
		nombre=null;
		linea=null;
	}
	/**
	 * Constructor con parametros.
	 */
	public Estacion(String nombre, String linea) {
		super();
		this.nombre = nombre;
		this.linea = linea;
	}
	/**
	 * 
	 * getters and Setters 
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	/**
	 * 
	 * metodos abstractos
	 */
	public abstract boolean seDetieneRutaRoja();
	public abstract boolean seDetieneRutaVerde();
	
}

