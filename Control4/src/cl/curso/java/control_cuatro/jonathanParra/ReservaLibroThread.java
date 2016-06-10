package cl.curso.java.control_cuatro.jonathanParra;
/**
 * 
 * @author Jonathan_Parra
 *Hilo que se encarga de la reservacion de  los libros.
 */
public class ReservaLibroThread extends Thread {
	
	private Libro libro;

	public ReservaLibroThread(Libro libro) {
		super();
		this.libro=libro;

	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	public void run(){
		libro.reservar();
	}
	
	
	
}
