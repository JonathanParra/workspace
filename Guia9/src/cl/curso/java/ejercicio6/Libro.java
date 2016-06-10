package cl.curso.java.ejercicio6;
import java.lang.String;

public class Libro {
	private String nombre;
	private String autor;
	private String editorial;
	private String isbn;
	public Libro(String nombre, String autor, String editorial, String isbn) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn =isbn;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean verificarIsbn(String isbn){
		String aux1=String.valueOf(digitoControl(isbn));
		char xi=isbn.charAt(9);
		String x=String.valueOf(xi);
		if(aux1.equals("-1")){
			System.out.print("correcto");
			return true;
		}
		else if(aux1.equals(x)){
			System.out.print("correcto");
			return true;
		}
		else{
			System.out.print("falso");
			return false;
		}
	}
	
	public int digitoControl(String isbn){
		int valor=0;
		int total=0;
		int mult=1;
		for(int ix=0;ix<9;ix++){
			valor=Integer.parseInt(""+isbn.charAt(ix));
			mult=valor*(ix+1);
			total+=mult;
		}
		if(total%11==10){
			return -1;
		}
		else{
			valor=total%11;
			return valor;
		}
	}
	
	
}
