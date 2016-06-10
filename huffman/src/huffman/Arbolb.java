package huffman;

public class Arbolb {

	nodo raiz;
	nodo der;
	nodo izq;

	public Arbolb() {

		raiz = null;
		der = null;
		izq = null;

	}

	public nodo crear(Lista a) {
		nodo nodo1 = null;
		nodo nodo2 = null;

		nodo1 = a.returnhead();
		nodo2 = a.returnhead();
		int ScantR = a.sumaRep(nodo1, nodo2);
		this.raiz = new nodo(' ', ScantR);
		raiz.izq = nodo1;
		raiz.der = nodo2;
		return raiz;
	}

	public void printtree(nodo aux) {

		if (aux == null)
			return;
		else {

			printtree(aux.izq);
			if (aux.caracter == ' ')
				System.out.print("[null," + aux.repeticiones + "]");
			else
				System.out.print("[" + aux.caracter + "," + aux.repeticiones + "]");
			printtree(aux.der);
		}

	}

	public nodo GetRoot() {
		return this.raiz;
	}

}
