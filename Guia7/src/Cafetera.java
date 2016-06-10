/**
 * 
 * @author Jonathan_Parra;
 *
 */


public class Cafetera {
	private int cantidadMaxima;
	private int cantidadActual;
	
	public Cafetera(){
		this.cantidadMaxima=1000;
	}
	public Cafetera(int capacidadMaxima){
		this.cantidadActual=capacidadMaxima;
	}
	public Cafetera(int cantidadMaxima,int cantidadActual){
		if(cantidadActual>cantidadMaxima){
			this.cantidadActual=cantidadMaxima;
		}
	}
	public void llenarCafetera(){
		this.cantidadActual=this.cantidadMaxima;
	}
	public void servirTaza(int capacidad){
		if(this.cantidadActual<capacidad)
		{
			capacidad=this.cantidadActual;
		}
		else {
			this.cantidadActual-=capacidad;
		}
	}
	public void vaciarCafetera(){
		this.cantidadActual=0;
	}
	public void agregarCafe(int cafe){
		this.cantidadActual+=cafe;
	}
	public int getCantidadMaxima() {
		return cantidadMaxima;
	}
	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}
	public int getCantidadActual() {
		return cantidadActual;
	}
	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	
}

