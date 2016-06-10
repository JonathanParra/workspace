
public class Persona {
	String nombre;
	String apellidoPaterno;
	String apellidoMaterno;
	int edad;
	public Persona(){
		nombre="Jonathan";
		apellidoPaterno="Parra";
		apellidoMaterno="Villarroel";
		edad= 23 ;
	}
	public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void imprimir(Persona x){
		System.out.print("nombre: "+x.nombre+" ");
		System.out.print(x.apellidoPaterno+" ");
		System.out.println(x.apellidoMaterno);
		System.out.println("edad: "+x.edad);
		
	}
	
		
}

