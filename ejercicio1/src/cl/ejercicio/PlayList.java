package cl.ejercicio;

import java.util.*;


public class PlayList  {
	private String nombre;
	private List<Cancion> canciones;
	private ArrayList<Usuario> seguidores;

	public PlayList(String nombre, ArrayList<Cancion> canciones, ArrayList<Usuario> seguidores) {
		super();
		this.nombre = nombre;
		this.canciones = canciones;
		this.seguidores = seguidores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	public ArrayList<Usuario> getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(ArrayList<Usuario> seguidores) {
		this.seguidores = seguidores;
	}

	public void agregarCanciones(Cancion cancion){
		if(!buscarCancion(cancion)){
			this.getCanciones().add(cancion);
		}
		else
			System.out.println("La cancion ya pertenece a esta lista.");
	}
	
	public void eliminarCancion(Cancion cancion){
		if(buscarCancion(cancion)){
			this.getCanciones().remove(cancion);
		}
		
		
	}
	
	public int duracionMinuto(){
		int duracionTotal=0;
		for(Cancion aux : this.getCanciones()){
			duracionTotal+=aux.getDuracionMin();
		}
		return duracionTotal;
	}
	
	public void agregarSeguidor(Usuario user){
		this.getSeguidores().add(user);
	}
	
	public void eliminarSeguidor(Usuario user){
		this.getSeguidores().remove(user);
	}
	
	public boolean buscarCancion(Cancion cancion){
		for(Cancion aux : this.getCanciones()){
			if(aux.equals(cancion)){
				return true;
			}	
		}
		return false;
	}
	
	public void ordenarCancion(){
		
		Collections.sort( this.getCanciones(), new Comparator<Cancion>() {

			
			public int compare(Cancion arg0, Cancion arg1) {
				
				 return new Integer(arg0.getDuracionMin()).compareTo(new Integer(arg1.getDuracionMin()));
			}
		});
	}
	
	

	
	

	
	
}
