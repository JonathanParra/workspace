package cl.curso.java.ejercicio7;

public class Usuario {
	private String nombre;
	private String passwod;
	private Perfil perfil;
	public Usuario(String nombre, String passwod, Perfil perfil,String nombre1,String descripcion) {
		super();
		this.nombre = nombre;
		this.passwod = passwod;
		this.perfil = new Perfil(nombre1,descripcion);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPasswod() {
		return passwod;
	}
	public void setPasswod(String passwod) {
		this.passwod = passwod;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
}
