package data.races;

public class AumentaThread extends Thread {
	Contador contador;

	
	public AumentaThread(Contador contador) {
		super();
		this.contador = contador;
	}


	public Contador getContador() {
		return contador;
	}


	public void setContador(Contador contador) {
		this.contador = contador;
	}


	@Override
	public void run() {
		System.out.println("\n");
		for(int ix=0;ix<5;ix++){
			getContador().aumentarCuenta();
		}
		
		
	}
}
