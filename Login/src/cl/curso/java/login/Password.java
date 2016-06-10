package cl.curso.java.login;

public class Password {
	private String clave;

	public Password(String clave) {
		super();
		this.clave = clave;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public void encriptar(){
		char aux;
		for(int ix=0;ix<clave.length();ix++){
			aux=clave.charAt(ix);
			
		}
	}
	
}
