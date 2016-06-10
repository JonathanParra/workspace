package cl.java.huffman;

public class List {
	
	private Nodo head;
	
	public List(){
		
	}
	
	/**
	 * Contructor con parametros
	 */

	public List(Nodo head) {
		super();
		this.head = head;
	}

	public Nodo getHead() {
		return head;
	}

	public void setHead(Nodo head) {
		this.head = head;
	}
	public boolean isEmpty(){
		return this.getHead()==null;
	}
	/**
	 * Insertar.
	 * @param caracter
	 * @param repeticiones
	 */
	public void insertar(char caracter,int repeticiones){
		Nodo nuevo=new Nodo(caracter,repeticiones);
		Nodo aux=null;
		if(this.isEmpty()){
			this.setHead(nuevo);
		}
		else{
			for(aux=this.getHead();aux.getNext()!=null;aux=aux.getNext()){
				
			}
			aux.setNext(nuevo);
		}
	}
	
	
}
