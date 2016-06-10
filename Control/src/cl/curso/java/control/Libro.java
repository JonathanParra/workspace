package cl.curso.java.control;
/**
 * 
 * @author Jonathan_Parra;
 *
 */
public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;
	private int ejemplaresPrestados;
	public Libro(String titulo,String autor,int ejemplares,int ejemplaresPrestados){
		this.titulo=titulo;
		this.autor=autor;
		this.ejemplares=ejemplares;
		this.ejemplaresPrestados=ejemplaresPrestados;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}
	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	public void prestarLibro(){
		if(this.ejemplares>this.ejemplaresPrestados){
			this.ejemplaresPrestados+=1;
		}
		else{
			System.out.print("libro no disponible");
		}
	}
	public void devolverLibro(){
		this.ejemplaresPrestados-=1;
	}	
	public void imprimir(){
		System.out.println("Titulo : "+this.titulo+"  Autor : "+this.autor+"  Ejemplares:"+this.ejemplares+" Ejemplares Prestados:"+this.ejemplaresPrestados);
	}
}
