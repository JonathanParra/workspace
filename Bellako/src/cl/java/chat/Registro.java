package cl.java.chat;

import java.io.IOException;
import java.util.*;

public  class Registro {
	private List<Cliente> registro;
	private Set<Cliente> registro1;
	private static final Registro uno=new Registro();
	private RegistroFile principal;
	
	/**
	 * @param registro
	 */
	private Registro() {
		
	}
	
	
	public static Registro getInstancia(){
		return uno;
	}

	/**
	 * @return the registro
	 */
	public List<Cliente> getRegistro() {
		return registro;
	}

	/**
	 * @param registro the registro to set
	 */
	public void setRegistro(List<Cliente> registro) {
		this.registro = registro;
	}
	
	public void agregarCliente(Cliente cliente) throws IOException{
		this.getRegistro().add(cliente);
		if(cliente.isEstado())
			principal.setUsuario(cliente);
	}
	public void eliminarCliente(Cliente cliente){
		this.getRegistro().remove(cliente);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	   //throw new CloneNotSupportedException();      // se puede implementar una excepcion.
	   return uno;
	}
	
}
