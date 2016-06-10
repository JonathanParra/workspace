package cl.curso.java.control_cinco.jParra;


import java.util.Collections;
import java.util.List;

public class CuentaBancaria {
	private int numero;
	private List<Transaccion> transacciones;
	
	public CuentaBancaria(){
		
	}
	/**
	 * @param numero
	 * @param transacciones
	 */
	public CuentaBancaria(int numero, List<Transaccion> transacciones) {
		super();
		this.numero = numero;
		this.transacciones = transacciones;
	}
	
	public void ordenarTransaccionPorFecha(){
		Transaccion.setfechaOtipo(true);
		Collections.sort(this.getTransacciones(),new Transaccion());
	}
	
	public void ordenaTreansaccionPorTipo(){
		Transaccion.setfechaOtipo(false);
		Collections.sort(this.getTransacciones(),new Transaccion());
	}
	
	public void Imprimir(){
		System.out.println("\t imprimir : ");
		for(Transaccion aux : this.getTransacciones()){
			System.out.println("id : " +aux.getId()+"tipo: "+aux.getTipo()+" Monto : "+aux.getMonto()+"\tFecha : "+aux.getFecha());
		}
		System.out.println("-------------o------------");
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the transacciones
	 */
	public List<Transaccion> getTransacciones() {
		return transacciones;
	}
	/**
	 * @param transacciones the transacciones to set
	 */
	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
	
	
	
	//------------FIN--------------
}
