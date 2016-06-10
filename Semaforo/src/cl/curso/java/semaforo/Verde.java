package cl.curso.java.semaforo;

public class Verde extends EstadoColor{

	public Verde(){}
	@Override
	public void siguienteColor(Semaforo semaforo) {
		semaforo.setEstadoSemaforo(new Amarillo());
		
	}

}
