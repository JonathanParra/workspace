package cl.curso.java.bip;

public class TarjetaClasica extends TarjetaBip implements Runnable {
	public TarjetaClasica(int saldo,int numeroTarjeta,String color){
		super(saldo,numeroTarjeta,color);
	}
	public void recargar(int carga){
		if(carga<1000){
			System.out.println("la carga es menor que el minimo");
		}
		else if(carga<=25000 ){
			super.setSaldo(super.getSaldo()+carga);
		}else
			System.out.println("lacarga exede el maximo");
	}
	public void pagarViaje(){
		if(this.getSaldo()<VALOR_TARJETA_CLASICA){
			System.out.print("saldo insuficiente");
		}
		else
			super.setSaldo(super.getSaldo()-VALOR_TARJETA_CLASICA);
	}
	public void imprimir(){
		super.imprimir();
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
