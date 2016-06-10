package cl.ejercicio;

import java.util.*;

public class Usuario {
	
	private String nombre;
	private ArrayList<PlayList> playlist;

	public Usuario(String nombre, ArrayList<PlayList> playlist) {
		super();
		this.nombre = nombre;
		this.playlist = playlist;
	}

	public ArrayList<PlayList> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(ArrayList<PlayList> playlist) {
		this.playlist = playlist;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
