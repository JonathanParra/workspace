package cl.curso.java.prueba_dos.jonathan.parra.pregunta3;

public abstract class Tren {
	private int numero;
	private String linea;
	/**
	 * constructor por defecto.
	 */
	public Tren(){
		numero = 0;
		linea=null;
	}
	/**
	 * Constructor con parametros.
	 */
	public Tren(int numero, String linea) {
		super();
		this.numero = numero;
		this.linea = linea;
	}
	
	/**
	 * 
	 * @param estacion recive una estacion la cual puede ser comun o ruta verde o ruta roja.
	 * metodo abstracto
	 */
	public abstract boolean seDetiene(Estacion estacion);

	/**
	 * 
	 * getters and Setters 
	 */
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getLinea() {
		return linea;
	}


	public void setLinea(String linea) {
		this.linea = linea;
	} 
	
}
