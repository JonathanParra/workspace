package cl.curso.java.guia9;
/**
 * 
 * @author Jonathan_Parra
 *
 */
public class Vehiculo {
	private String codigo;
	private String marca;
	private String tipo;
	private int modelo;
	private String patente;
	private int kilometraje;
	private int precioVenta;
	private int cantPorVender;
	
	public Vehiculo(String codigo, String marca, String tipo, int modelo, String patente, int kilometraje,
			int precioVenta, int cantPorVender) {
		super();
		this.codigo = codigo;
		this.marca = marca;
		this.tipo = tipo;
		this.modelo = modelo;
		this.patente = patente;
		this.kilometraje = kilometraje;
		this.precioVenta = precioVenta;
		this.cantPorVender = cantPorVender;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	public int getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getCantPorVender() {
		return cantPorVender;
	}
	public void setCantPorVender(int cantPorVender) {
		this.cantPorVender = cantPorVender;
	}
	public void venderAuto(){
		if(getCantPorVender()==0)
			System.out.println("no disponible.");
		else
			setCantPorVender(getCantPorVender()-1);
	}
	
}
