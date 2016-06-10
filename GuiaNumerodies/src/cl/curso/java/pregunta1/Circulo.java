package cl.curso.java.pregunta1;


public class Circulo extends FiguraGeometrica {
	private double radio;
	
	

	public Circulo(double radio) {
		super();
		this.radio = radio;
	
	}
	

	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	@Override
	public void dibujar() {
		
		
	}

	@Override
	public double calcularArea() {
		return Math.PI*radio*radio;
	}
	
}
