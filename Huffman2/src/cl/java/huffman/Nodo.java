package cl.java.huffman;

public class Nodo {
	private char caracter;
	private int repeticiones;
	private Nodo next;
	/**
	 * Constructor por defecto
	 */
	public Nodo(){
		this.caracter=' ';
		this.repeticiones=0;
		this.next=null;
	}
	/**
	 * Constructor
	 * 
	 * @param caracter
	 * @param repeticiones
	 * @param next
	 */
	public Nodo(char caracter, int repeticiones) {
		super();
		this.caracter = caracter;
		this.repeticiones = repeticiones;
		this.next = null;
	}

	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}

	public int getRepeticiones() {
		return repeticiones;
	}

	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
	}

	public Nodo getNext() {
		return next;
	}

	public void setNext(Nodo next) {
		this.next = next;
	}
	
	
}
