package cl.curso.java.control_cuatro.jonathanParra;
/**
 * 
 * @author Jonathan_Parra
 *
 */
public class Auto {
	private String marca;
	private String modelo;
	private int anio;
	private int stock;
	/**
	 * Constructor por defecto.
	 */
	public void Auto(){
		
		this.marca=null;
		this.modelo=null;
		this.anio=0;
		this.stock=0;
	}

	/**
	 * Constructor.
	 * 
	 * @param marca
	 * @param modelo
	 * @param anio
	 * @param stock
	 */
	public Auto(String marca, String modelo, int anio, int stock) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.stock = stock;
	}

	/**
	 * Get and Set.
	 * 
	 * @return
	 */
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * Vender auto. Metodo que lanza una Excepcion de tipo SinStockException.
	 */
	public void venderAuto() {
		if (this.getStock() > 0) {
			this.setStock(this.getStock() - 1);
		} else {
			throw new SinStockException("No es posible vender auto. No hay stock.");
		}
	}
}
