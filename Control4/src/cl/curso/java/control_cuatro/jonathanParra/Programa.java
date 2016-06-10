package cl.curso.java.control_cuatro.jonathanParra;
/**
 * 
 * @author Jonathan_Parra.
 *
 */
public class Programa {

	public static void main(String[] args) {
		Libro libro = new Libro("Java","yaTuSabes",10,2);
		ReservaLibroThread uno=new ReservaLibroThread(libro);
		ReservaLibroThread dos=new ReservaLibroThread(libro);
		ReservaLibroThread tres=new ReservaLibroThread(libro);
		DevolverLibroThread Huno=new DevolverLibroThread(libro);
		DevolverLibroThread Hdos=new DevolverLibroThread(libro);
		DevolverLibroThread Htres=new DevolverLibroThread(libro);
		uno.start();
		dos.start();
		tres.start();
		Huno.start();
		Hdos.start();
		Htres.start();
	}
	
	
}
