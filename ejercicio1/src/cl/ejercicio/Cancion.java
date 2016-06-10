package cl.ejercicio;

import java.util.Comparator;

public class Cancion {
	private String nombre;
	private String artista;
	private int duracionMin;

	public Cancion(String nombre, String artista, int duracionMin) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracionMin = duracionMin;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getDuracionMin() {
		return duracionMin;
	}

	public void setDuracionMin(int duracionMin) {
		this.duracionMin = duracionMin;
	}
	
	@Override
	public boolean equals(Object obj){
		
		return obj instanceof Cancion & this.getArtista().equals(((Cancion)obj).getArtista()) & this.getNombre().equals(((Cancion)obj).getNombre());
	}


}
