package cl.curso.java.guia8;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	public final String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	public Fecha(){
		this.dia=23;
		this.mes=5;
		this.anio=1995;
	}
	public Fecha(int dia,int mes,int año){
		this.dia=dia;
		this.mes=mes;
		this.anio=año;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public boolean esBisiesto(){
		return ((this.getAnio()%4==0 || this.getAnio()%400==0) && this.getAnio()%100 !=0);
	}
	
	public boolean validarDia(){return true;}
	
	
	
	public boolean validarMes() throws MesNoValidoException{
		if(!(getMes()<=12 && getMes()>0)){
			throw new MesNoValidoException("Problemas con el numero  del \t");
		}
		else
			return true;
	}
	
	
	public boolean validarAnio(){return true;}
	public void imprimirFecha(){
		System.out.println(getDia()+"-"+getMes()+"-"+getAnio());
	}
	
	public void printFecha() throws MesNoValidoException{
		if(validarMes()){
			
			int mess=getMes()-1;
			System.out.print(getDia()+" de "+meses[mess]+" de "+getAnio());
		}
		else 
			System.out.print("mes no valido");
	}
	
}




