package cl.curso.java.conexion;

public class Programa {

	public static void main(String[] args) {
		try{
			ConexionCerrada uno=new ConexionCerrada();
			Conexion conexion1=new Conexion(uno);
			conexion1.abrir();
			conexion1.cerrar();
		
		}catch(ConexionAbiertaException e){
			System.out.println(e.getMessage());
		}
		

	}

}
