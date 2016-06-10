package cl.curso.java.conexion;

public class ConexionAbierta extends EstadoConexion{


	@Override
	public void abrir(Conexion conexion) {
		throw new ConexionAbiertaException("La conexion ya esta abierta");
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setConexion(new ConexionCerrada());
		System.out.println("conexion cerrada.");
		
	}

}
