package cosas;

public class cosaslokas {
	
	public static void papa(){
		System.out.println("preguntale a tu mama.");
		mama();
	}
	
	public static void mama(){
		System.out.println("preguntale a tu papa");
		papa();
	}
	
	public static void main(String[] args) {
		mama();

	}

}
