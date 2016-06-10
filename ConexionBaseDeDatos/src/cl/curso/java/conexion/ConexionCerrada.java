package cl.curso.java.conexion;

public class ConexionCerrada extends EstadoConexion{

	@Override
	public void abrir(Conexion conexion) {
		conexion.setConexion(new ConexionAbierta());
		System.out.println("conexion abierta.");
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new  ConexionCerradaException("la conexion ya esta CERRADA");
		
	}

}
