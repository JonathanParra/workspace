package cl.curso.java.heroe;

public class Batman extends SuperHeroe {

	private int ataque1;
	private int ataque2;
	private int ataque3;
	private int ataque4;
	
	public Batman(){
		this.ataque1=15;
		this.ataque2=10;
		this.ataque3=25;
		this.ataque4=40;
	}
	
	public void recibirAtaque(Arma arma){
			if(arma instanceof Criptonita){
				super.setHP(100);
			}else if(arma instanceof Granada){
				super.setHP(0);
			}
	}
}
