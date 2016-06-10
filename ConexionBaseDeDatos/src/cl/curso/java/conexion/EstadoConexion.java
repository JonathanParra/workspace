package cl.curso.java.conexion;

public abstract class EstadoConexion {
		public EstadoConexion(){
			
		}
	
		public abstract void abrir(Conexion conexion);
		public abstract void cerrar(Conexion conexion);
}
