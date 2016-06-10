package cl.curso.java.bip;
import java.util.Date;

public abstract class TNE extends TarjetaBip{
	private String nombre;
	private Date fechaExp;
	public TNE(int saldo,int numeroTarjeta,String color,String nombre,Date fechaExp){
		super(saldo,numeroTarjeta,color);
		this.nombre=nombre;
		this.fechaExp=fechaExp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaExp() {
		return fechaExp;
	}
	public void setFechaExp(Date fechaExp) {
		this.fechaExp = fechaExp;
	}
	public void imprimir(){
		System.out.print("Nombre :"+getNombre()+"\n fecha expiracion:"+getFechaExp()+"\n");
		super.imprimir();
		
	}	
}
