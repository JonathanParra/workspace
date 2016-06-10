package cl.curso.java.prueba_dos.jonathan.parra.pregunta2;
/**
 * 
 * @author JonathanParra
 *
 */
public class Alumno implements Imprimible{
	private String nombre;
	private double promedio;
	/**
	 * constructor por defecto
	 */
	public Alumno(){
		nombre=null;
		promedio=0;
	}
	/**
	 * constructor por parametros
	 */
	public Alumno(String nombre, double promedio) {
		super();
		this.nombre = nombre;
		this.promedio = promedio;
	}
	/**
	 * Getters and Setters
	 * @return nombre,promedio
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	@Override
	public void imprimir() {
		System.out.println(getNombre()+" \t "+getPromedio());
		
	}
	
	
	
}
