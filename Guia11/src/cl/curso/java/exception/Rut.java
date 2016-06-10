package cl.curso.java.exception;

public class Rut {
	private int rut;

	public Rut(int rut) {
		super();
		this.rut = rut;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}
	
	public int digitoVerificador(){
		int resto;
		int total=0;
		int j =2;
		for(int ix=0;ix<8;ix++){
			resto=getRut()%10;
			total+=resto*j;
			if(j==8){
				j=2;	
			}
		}
		total=total/11;
		return 11-total;
	}
	
	public void validarRut(){
		
	}

}
