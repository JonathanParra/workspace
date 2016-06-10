package huffman;

public class nodo {

	char caracter;
	int repeticiones;
	nodo izq;
	nodo der;
	nodo next;

	public nodo(char caracter, int repeticiones) {
		this.caracter = caracter;
		this.repeticiones = repeticiones;
		nodo izq = null;
		nodo der = null;
	}

	public char getcaracter() {
		return this.caracter;
	}

	public int getrepeticiones() {
		return this.repeticiones;
	}
	public nodo getnext(){
		return this.next;
	}
}
