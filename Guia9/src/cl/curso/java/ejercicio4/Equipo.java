package cl.curso.java.ejercicio4;

public class Equipo {
	private String nombre;
	private int partidosGandados;
	private int partidosPerdidos;
	private int partidosEmpatados;
	private int partidosJugados;
	private int puntos;
	
	public Equipo(){}

	public Equipo(String nombre, int partidosGandados, int partidosPerdidos, int partidosEmpatados, int partidosJugados,
			int puntos) {
		super();
		this.nombre = nombre;
		this.partidosGandados = partidosGandados;
		this.partidosPerdidos = partidosPerdidos;
		this.partidosEmpatados = partidosEmpatados;
		this.partidosJugados = partidosJugados;
		this.puntos = puntos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPartidosGandados() {
		return partidosGandados;
	}

	public void setPartidosGandados(int partidosGandados) {
		this.partidosGandados = partidosGandados;
	}

	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}

	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}

	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}

	public int getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public void ganar(){
		setPuntos(getPuntos()+3);
		setPartidosGandados(getPartidosGandados()+1);
		setPartidosJugados(getPartidosJugados()+1);
	}
	public void perder(){
		setPartidosPerdidos(getPartidosPerdidos()+1);
		setPartidosJugados(getPartidosJugados()+1);
	}
	public void empatar(){
		setPuntos(getPuntos()+1);
		setPartidosEmpatados(getPartidosEmpatados()+1);
		setPartidosJugados(getPartidosJugados()+1);
	}
	public void imprimir(){
		System.out.println("Nombre :"+getNombre()+"\tPartidos jugados :"+getPartidosJugados()+"\tPuntos totales :"+getPuntos()+"\n Partidos ganados : "+getPartidosGandados()+"\n Partidos perdidos : "+getPartidosPerdidos()+"\n Partidos empatados : "+getPartidosEmpatados());
	}
}
