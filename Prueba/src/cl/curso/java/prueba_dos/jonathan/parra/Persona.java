package cl.curso.java.prueba_dos.jonathan.parra;
/**
 * 
 * @author Jonathan Parra
 *
 */

public class Persona {
	private String nombre;
	private int edad;
	private int peso;
	private int altura;
	
	
	
	public Persona(String nombre, int edad, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public int getPeso() {
		return peso;
	}



	public void setPeso(int peso) {
		this.peso = peso;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	public int  calcularIMC(){
		int pesoIdeal=getPeso()/getAltura()*getAltura();
		if(pesoIdeal==getPeso())
			return 0;
		else if(pesoIdeal < getPeso())
			return 1;
		else 
			return -1;
		
	}
	
	public boolean esMayorDeEdad(){
		return getEdad()>=18;
	}
	
	//---------------fin-----------
}
