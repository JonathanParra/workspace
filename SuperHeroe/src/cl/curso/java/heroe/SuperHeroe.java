package cl.curso.java.heroe;

public abstract class SuperHeroe {
	private int exp;
	private int HP;
	public SuperHeroe(){
		this.HP=100;
		this.exp=0;
	}

	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public SuperHeroe(String nombre, int hP) {
		super();
		HP = hP;
	}
	
	public void sumExp(){
		
	}
	public abstract void recibirAtaque(Arma arma);
}
