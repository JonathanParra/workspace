package cl.curso.java.singleton;

public class Motor {
	private static Motor _motor;
	
	private Motor(){
		
	}
	
	public static  Motor getInstancia(){
		if(null == _motor){
			Motor motor=new Motor();
			_motor = motor;
		}
		return _motor;
	}
}
