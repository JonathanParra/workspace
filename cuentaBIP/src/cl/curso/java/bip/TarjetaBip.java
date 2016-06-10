package cl.curso.java.bip;
/**
 * 
 * @author JonathanParra
 *
 */
public abstract class TarjetaBip implements Pagable{
	private int saldo;
	private int numeroTarjeta;
	public static final int VALOR_TARJETA_CLASICA=740;
	public static final int VALOR_TNE=210;
	
	private String color;
	public TarjetaBip(){}
	public TarjetaBip(int saldo,int numeroTarjeta,String color){
		this.saldo=saldo;
		this.numeroTarjeta=numeroTarjeta;
		this.color = color;
	}
	public abstract void  recargar(int carga);
	public abstract void pagarViaje();
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void imprimir(){
		System.out.print("Saldo : "+getSaldo()+"\n numero de tarjeta :"+getNumeroTarjeta());
	}
	
}
