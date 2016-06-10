package cl.java.arraylist;

import java.util.*;

public class Telefono {
	
	private ArrayList<Contacto> contacto;

	public Telefono(ArrayList<Contacto> contacto) {
		super();
		this.contacto = contacto;
	}
	
	

	public ArrayList<Contacto> getContacto() {
		return contacto;
	}



	public void setContacto(ArrayList<Contacto> contacto) {
		this.contacto = contacto;
	}



	public void imprimirFor() {
		for(int i=0 ; i < contacto.size() ; i++){
			this.getContacto().get(i).imprimir();
		}
	}

	public void imprimirForeach() {
		for(Contacto cont:this.getContacto()){
			cont.imprimir();
			System.out.println(cont);   //impresion con to String.
		}
	}

	public void imprimirIterador() {
		Iterator <Contacto> iterador=this.getContacto().iterator();
		while(iterador.hasNext()){
			iterador.next().imprimir();
		}
	}
}
