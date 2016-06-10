package cl.game.java;

public abstract class Criatura extends Personaje{

	public Criatura(int hp, String nombre, String genero, int nivel, int atak, int defensa, int velocidad,
			int defensaEspecial, int ataqueEspecial, int exp) {
		super(hp, nombre, genero, nivel, atak, defensa, velocidad, defensaEspecial, ataqueEspecial, exp);
		
	}

	
	
}
