package cl.curso.java.ejercicio3;
/**
 * 
 * @author jony
 *
 */
public class Vendedor {
	private String nombre;
	private int semanasTrabajadas;
	private int cantidadArtVendidos;
	private int valor;
	public Vendedor(String nombre, int semanasTrabajadas, int cantidadArtVendidos, int valor) {
		super();
		this.nombre = nombre;
		this.semanasTrabajadas = semanasTrabajadas;
		this.cantidadArtVendidos = cantidadArtVendidos;
		this.valor = valor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSemanasTrabajadas() {
		return semanasTrabajadas;
	}
	public void setSemanasTrabajadas(int semanasTrabajadas) {
		this.semanasTrabajadas = semanasTrabajadas;
	}
	public int getCantidadArtVendidos() {
		return cantidadArtVendidos;
	}
	public void setCantidadArtVendidos(int cantidadArtVendidos) {
		this.cantidadArtVendidos = cantidadArtVendidos;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int calcularComision (){
		int total=((this.cantidadArtVendidos*this.valor)*9)/100 + this.semanasTrabajadas*200; 
		
		return total;
	}
	
}
