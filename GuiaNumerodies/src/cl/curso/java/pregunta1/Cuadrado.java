package cl.curso.java.pregunta1;

public class Cuadrado extends FiguraGeometrica {
	public int lado;

	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularArea() {
		return lado*lado;
		
	}
	
}
