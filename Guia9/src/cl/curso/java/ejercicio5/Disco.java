package cl.curso.java.ejercicio5;

public class Disco {
	private String nombre;
	private String nombreAutor;
	private String genero;
	private String[] canciones;
	public Disco(String nombre, String nombreAutor, String genero, String[] canciones) {
		super();
		this.nombre = nombre;
		this.nombreAutor = nombreAutor;
		this.genero = genero;
		this.canciones = canciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombreAutor() {
		return nombreAutor;
	}
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String[] getCanciones() {
		return canciones;
	}
	public void setCanciones(String[] canciones) {
		this.canciones = canciones;
	}
	public void imprimir(){
		System.out.print("Nombre del disco:"+getNombre()+"\nAutor:"+getNombreAutor()+"\nGenero :"+getGenero()+"\n");
		for(int ix=0;ix<canciones.length;ix++){
			
			System.out.println((ix+1)+".- "+canciones[ix]);
		}
	}
	
}
