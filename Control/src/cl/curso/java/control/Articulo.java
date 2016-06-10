package cl.curso.java.control;
/**
 * 
 * @author Jonathan_Parra.
 *
 */
public class Articulo {
	private String nombre;
	private int costoBase;
	public Articulo(String nombre,int costoBase){
		this.nombre=nombre;
		this.costoBase=costoBase;
	}
	public double precioAlDetalle(){
		double total=0;
		total=this.costoBase + this.costoBase*0.3;
		return total;	
		}
	public double precioAlMayor(){
		double total=0;
		total=this.costoBase + this.costoBase*0.15;
		return total;
	}
	public void imprimir(){
		System.out.print(this.nombre);
		System.out.println(this.costoBase);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCostoBase() {
		return costoBase;
	}
	public void setCostoBase(int costoBase) {
		this.costoBase = costoBase;
	}
}
