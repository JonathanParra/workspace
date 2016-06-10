package cl.game.java;

public abstract class Personaje {
	private int hp;
	private String nombre;
	private String genero;
	private int nivel;
	private int atak;
	private int defensa;
	private int velocidad;
	private int defensaEspecial;
	private int ataqueEspecial;
	private int exp;

	public Personaje(int hp, String nombre, String genero, int nivel, int atak, int defensa, int velocidad,
			int defensaEspecial, int ataqueEspecial, int exp) {
		super();
		this.hp = hp;
		this.nombre = nombre;
		this.genero = genero;
		this.nivel = nivel;
		this.atak = atak;
		this.defensa = defensa;
		this.velocidad = velocidad;
		this.defensaEspecial = defensaEspecial;
		this.ataqueEspecial = ataqueEspecial;
		this.exp = exp;
	}

	public int getExp() {
		return this.exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getAtak() {
		return atak;
	}

	public void setAtak(int atak) {
		this.atak = atak;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getDefensaEspecial() {
		return defensaEspecial;
	}

	public void setDefensaEspecial(int defensaEspecial) {
		this.defensaEspecial = defensaEspecial;
	}

	public int getAtaqueEspecial() {
		return ataqueEspecial;
	}

	public void setAtaqueEspecial(int ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

	public abstract void atacar(Personaje personaje);

	public abstract void defensa(Personaje personaje);

	public abstract void experiencia(Personaje personaje);
	
	public abstract void contraGerrero();
	public abstract void contraMago();
	public abstract void contraCurandero();
	public abstract void contraAsesino();
	/*public abstract void contraGerrero();
	public abstract void contraGerrero();*/
	

}
