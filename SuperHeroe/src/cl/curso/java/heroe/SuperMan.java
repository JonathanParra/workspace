package cl.curso.java.heroe;

public class SuperMan extends SuperHeroe {
	private int ataque1;
	private int ataque2;
	private int ataque3;
	private int ataque4;
	
	public SuperMan(){
		this.ataque1=10;
		this.ataque2=20;
		this.ataque3=30;
		this.ataque4=40;
	}
	
	public void recibirAtaque(Arma arma){
		if(arma instanceof Criptonita){
			this.setHP(0);
		}
		else if(arma instanceof Granada){
			super.setHP(100);
		}
	}
	public int getataque1(){
		return this.ataque1;
	}
	public int getataque2(){
		return this.ataque2;
	}
	public int getataque3(){
		return this.ataque3;
	}
	public int getataque4(){
		return this.ataque4;
	}
	
	
}
