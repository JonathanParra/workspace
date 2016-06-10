package cl.curso.java.control_cuatro.jonathanParra;

/**
 * 
 * @author Jonathan_Parra
 *
 */
public class ProgramaAuto {

	public static void main(String[] args) {
		Auto nuevo = new Auto("Toyota", "Yariz", 2005, 0);
		try {
			nuevo.venderAuto();
		} catch (SinStockException e) {
			System.out.println("No es posible vender auto. No hay stock");
		}

	}

}
