package cl.curso.java.guia8;

public class Empleado {
	private String nombre;
	private String rut;
	private int sueldoBase;
	private int pagoHoraExtra;
	private int HoraExtraRealizadas;
	public Empleado(String nombre,String rut,int sueldoBase,int pagoHoraExtra,int HoraExtraRealizadas){
		this.nombre=nombre;
		this.rut=rut;
		this.sueldoBase=sueldoBase;
		this.pagoHoraExtra=pagoHoraExtra;
		this.HoraExtraRealizadas=HoraExtraRealizadas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public int getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getPagoHoraExtra() {
		return pagoHoraExtra;
	}
	public void setPagoHoraExtra(int pagoHoraExtra) {
		this.pagoHoraExtra = pagoHoraExtra;
	}
	public int getHoraExtraRealizadas() {
		return HoraExtraRealizadas;
	}
	public void setHoraExtraRealizadas(int horaExtraRealizadas) {
		HoraExtraRealizadas = horaExtraRealizadas;
	}
	public int sueldoLiquido(int sueldoBruto){
		return 0;
	}
}
