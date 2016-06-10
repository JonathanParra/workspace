package cl.curso.java.semaforo;

public  class Semaforo {
	EstadoColor estadoSemaforo;

	public Semaforo(EstadoColor estadoSemaforo) {
		super();
		this.estadoSemaforo = estadoSemaforo;
	}

	public EstadoColor getEstadoSemaforo() {
		return estadoSemaforo;
	}

	public void setEstadoSemaforo(EstadoColor estadoSemaforo) {
		this.estadoSemaforo = estadoSemaforo;
	}
	public void cambiarColor(){
		this.getEstadoSemaforo().siguienteColor(this);
		System.out.println(this.getEstadoSemaforo());
	}
}
