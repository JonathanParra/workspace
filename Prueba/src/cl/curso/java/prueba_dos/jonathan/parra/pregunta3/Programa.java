package cl.curso.java.prueba_dos.jonathan.parra.pregunta3;
/**
 * 
 * @author Jonathan_Parra
 *
 */
public class Programa {

	public static void main(String[] args) {
		Tren uno=new TrenRutaVerde(1, "linea 2");
		Tren dos=new TrenRutaRoja(2,"linea 4A");
		Estacion tres=new EstacionRutaVerde("El Parron", "linea 2");
		Estacion cuatro=new EstacionRutaRoja("lo Vial", "linea 2");
		Estacion cinco=new EstacionComun("La Cisterna", "linea 2");
		
		System.out.println(uno.seDetiene(cuatro));
		
	}

}
