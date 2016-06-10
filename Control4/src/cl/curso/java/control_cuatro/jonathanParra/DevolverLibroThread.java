package cl.curso.java.control_cuatro.jonathanParra;
/**
 * 
 * @author Jonathan_Parra
 *Hilo que se encarga de la devolucion de  los libros.
 */
public class DevolverLibroThread extends Thread {
	private Libro libro;

	public DevolverLibroThread(Libro libro) {
		super();
		this.libro=libro;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	public  void run(){
		libro.devolverLibro();
	}
	
}
