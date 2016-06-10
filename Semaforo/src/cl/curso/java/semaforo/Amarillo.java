package cl.curso.java.semaforo;

public class Amarillo extends EstadoColor {
	
	public Amarillo(){
		
	}
	@Override
	public void siguienteColor(Semaforo semaforo) {
		semaforo.setEstadoSemaforo(new Rojo());
	}

}
