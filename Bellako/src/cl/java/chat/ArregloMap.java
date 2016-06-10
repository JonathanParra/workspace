package cl.java.chat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArregloMap {

	public static void main(String[] args) {
		Integer repeticion1;
	
		Map<String,Integer> repeticion=new HashMap<String,Integer>(); 
		String texto="Buenos dias buenos dias";
		String[] palabra=texto.split(" ");
		for(int ix=0;ix<palabra.length;ix++){
				
				if(repeticion.containsKey(palabra[ix])){
					repeticion.put(palabra[ix], 1);
				}
				else{
					repeticion.put(palabra[ix], repeticion.get(palabra[ix]) + 1 );
				}
						System.out.print(" "+palabra[ix].toLowerCase());
						
		}
		
		Iterator<Entry<String,Integer>> it = repeticion.entrySet().iterator();
		while(it.hasNext()){
			
		}
		
	}

}
