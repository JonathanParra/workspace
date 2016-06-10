package cl.curso.java.control_cuatro.jonathanParra;
/**
 * 
 * @author Jonathan_Parra
 *
 */
public class Libro {
	private String nombre;
	private String editorial;
	private int cantidadDeLibros;
	private int cantidadDeLibroPrestado;
	/**
	 * Constructor por defecto
	 */
	public Libro(){
		
	}
	/**
	 * Constructorcon Parametros.
	 * @param nombre
	 * @param editorial
	 * @param cantidadDeLibros
	 * @param cantidadDeLibroPrestado
	 */
	public Libro(String nombre, String editorial, int cantidadDeLibros, int cantidadDeLibroPrestado) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
		this.cantidadDeLibros = cantidadDeLibros;
		this.cantidadDeLibroPrestado = cantidadDeLibroPrestado;
	}
	/**
	 * Getters and Setters.
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getCantidadDeLibros() {
		return cantidadDeLibros;
	}

	public void setCantidadDeLibros(int cantidadDeLibros) {
		this.cantidadDeLibros = cantidadDeLibros;
	}

	public int getCantidadDeLibroPrestado() {
		return cantidadDeLibroPrestado;
	}

	public void setCantidadDeLibroPrestado(int cantidadDeLibroPrestado) {
		this.cantidadDeLibroPrestado = cantidadDeLibroPrestado;
	}
	/**
	 * Metodoque reserva un libro.
	 */
	public synchronized void reservar() {
		if(this.getCantidadDeLibros() > 0){
			this.setCantidadDeLibros(this.getCantidadDeLibros()-1);
			this.setCantidadDeLibroPrestado(this.getCantidadDeLibroPrestado()+1);
		}else
			System.out.println("no hay libros suficientes.");
		
	}
	/**
	 * Metodo que devuelve un libro.
	 */
	public synchronized void devolverLibro(){
		if(!(this.getCantidadDeLibroPrestado() < 0)){
			
			this.setCantidadDeLibroPrestado(this.getCantidadDeLibroPrestado()-1);
			this.setCantidadDeLibros(this.getCantidadDeLibros()+1);
			
		}else{
			
		}
	}
	//--------FinClasse.
}
