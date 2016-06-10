package data.races;

public class Contador {
	private int cuenta;
	
	public Contador(int cuenta) {
		super();
		this.cuenta = cuenta;
	}
	

	public int getCuenta() {
		return cuenta;
	}


	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}


	public void aumentarCuenta(){
		synchronized(this){
		this.setCuenta(this.getCuenta() +1);
		System.out.print(this.getCuenta());
		}
	}
}
