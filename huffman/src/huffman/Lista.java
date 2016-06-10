package huffman;

public class Lista {

	nodo head;

	public Lista() {
		head = null;
	}
	public nodo gethead(){
		return this.head;
	}
	public void insertar(char caracter, int repeticiones) {
		nodo aux = head;
		nodo nuevo = new nodo(caracter, repeticiones);
	
		if (head == null) {
			head = nuevo;
			head.next = null;
		} else {
			while (aux.next != null) {
				aux = aux.next;
				
			}
			if(caracter(nuevo)==false){
				aux.next = nuevo;
			}
			else{
				aux.next=null;
			}		
		}
	}
	public int maximaRepeticion(){
		nodo aux=this.head;
		int mayor=0;
		if(this.head==null)
			return 0;
		else{
			while(aux!=null){
				if(aux.repeticiones>=mayor)
					mayor=aux.repeticiones;
			aux=aux.getnext();
			}
		}
		return mayor;
	}
	public void ordenarLista(){
		
		
	}

	
	
	public boolean caracter(nodo nuevo){
		nodo aux=this.head;
		while(aux!=null){
			if(aux.caracter==nuevo.caracter){
					return true;
			}else
				aux=aux.next;
		}
		return false;
	}

	public nodo returnhead() {
		if (head == null) {
			System.out.println("List Is empty.");
			return null;
		} else {
			nodo aux = head;
			head = head.next;
			return aux;
		}
	}

	public nodo insertarnodo(nodo a) {
		if (head == null) {
			System.out.print("lista vacia");
			this.head = a;
			return head;
		} else {
			nodo aux = head;
			for (; aux.next != null; aux = aux.next) {

			}
			aux.next = a;
			return a;
		}
	}

	public boolean IsEmpty() {
		return head == null;
	}
	public int cantNodo(){
		nodo aux=this.head;
		int con=0;
		if(this.head==null)
			return -1;
		while(aux.getnext() !=null){
			con++;
			aux=aux.getnext();
		}
		return con;
	}

	public int sumaRep(nodo a, nodo b) {
		int suma;
		suma = a.repeticiones + b.repeticiones;
		return suma;
	}

	public char getcaracter(nodo a) {
		return a.caracter;
	}

	public int getrepeticiones(nodo a) {
		return a.repeticiones;
	}

	public void imprimir() {
		nodo aux = head;

		if (head == null) {
			System.out.println("lista vacia.");
		} else {
			for (; aux != null; aux = aux.next) {
				if (aux.caracter == ' ')
					System.out.print("[" + aux.izq.caracter + "," + aux.repeticiones + "]<--null," + aux.repeticiones
							+ "--->[" + aux.der.caracter + "," + aux.der.repeticiones + "]");
				else if (aux.caracter != ' ')

					System.out.print("|" + aux.caracter + "," + aux.repeticiones + "|   ----->  ");
				else if (head.next == null) {

				}

			}
		}

	}

	// ------------------------FIN_LISTA-------------------------------
}
