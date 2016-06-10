package cl.curso.java.guia9;

/**
 * 
 * @author Jonathan_Parra
 *
 */
public class Persona {
	private String nombre;
	private String apellido;
	private int numeroTelefono;
	/**
	 * Constructor por defecto.
	 */
	public Persona(){}
	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param numero
	 */
	public Persona(String nombre,String apellido,int numero){
		this.nombre=nombre;
		this.apellido=apellido;
		this.numeroTelefono=validarNumero(numero);
		
	}
	//valida el numero telefonico.
	public int validarNumero(int numero){
		String numeroT;
		numeroT=Integer.toString(numero);
		if(numeroT.length()>9){
			System.out.println("Numero telefonico no valido.");
			return 0 ;
		}
		return numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public void imprimir(){
		System.out.print(this.nombre+" "+this.apellido+"  telefono : "+this.numeroTelefono);
	}
	
	
	//----------------fin-----------
}