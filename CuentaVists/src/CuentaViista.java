
public class CuentaViista {
	private int saldo;
	
	public CuentaViista(){
		this.saldo=0;	
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public int retirarDinero(int retirar){
		if(this.saldo<retirar || retirar>200000){
			System.out.print("saldo insuficiente.");
			return 0;
		}
		else{
			this.saldo-=retirar;
			return retirar;
		}
	}
	
	public void abonarDinero(int abono){
		if(abono<0){
			System.out.print("valor del abono incorrecto.");
		}
		else
			this.saldo+=abono;
	}
}
