package cl.curso.java.pregunta1;

public class Triangulo extends FiguraGeometrica {
	private int base;
	private int altura;
	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public void dibujar() {
		
		
	}
	@Override
	public double calcularArea() {
		return (base*altura)/2;
		
	}
	
}
