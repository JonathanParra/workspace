package huffman;

import javax.swing.JFrame;

public class Huffman {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.show();
		int ix=0;
		int aux1;
		Arbolb t = new Arbolb();
		char a = 'a', b = 'b', c = 't', d = 'd', h = 'g', k = 'k', m = 'v';
		// ------------------------------------------------------------

		// File archivo1=new File("archivo.txt");

		// ------------------------------------------------------------
		Lista p = new Lista();
		String palabra=new String();
		int repeticion=1;
		palabra="paralelepipedo";
		char caracter=' ';
		for(int i =0;i<palabra.length();i++){
			caracter=palabra.charAt(i);
			for(int j=1;j<palabra.length();j++){
				if(caracter == palabra.charAt(j)){
					repeticion ++;
				}
			}
			p.insertar(caracter, repeticion);
			repeticion=0;
		}
		
		nodo aux = null;
		/*p.insertar(a, 2);
		p.insertar(b, 3);
		p.insertar(c, 3);
		p.insertar(d, 1);*/
		// p.insertar(h, 2);
		// p.insertar(j, 3);
		// p.insertar(k, 3);
		// p.insertar(m, 1);
		p.imprimir();
		aux1=p.cantNodo();
		
		
		
		
		while(ix < aux1){
			aux=p.insertarnodo(t.crear(p));
			ix++;
		}
		
		// p.insertarnodo(t.crear(p));
		// p.insertarnodo(t.crear(p));
		// p.insertarnodo(t.crear(p));
		// p.insertarnodo(t.crear(p));

		
		System.out.print("\n");
		
		System.out.print("\n");
		System.out.print("\n");
		t.printtree(aux);

	}

}
