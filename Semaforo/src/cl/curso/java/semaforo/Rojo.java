package cl.curso.java.semaforo;

public class Rojo extends EstadoColor {

		public Rojo(){}
	@Override
	public void siguienteColor(Semaforo semaforo) {
		semaforo.setEstadoSemaforo(new Verde());
	}

}
