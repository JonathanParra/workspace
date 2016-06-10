package cl.curso.java.conexion;

public  class Conexion {
		EstadoConexion conexion;
		
		public Conexion(EstadoConexion conexion) {
			this.conexion = conexion;
		}
		
		public EstadoConexion getConexion() {
			return conexion;
		}

		public void setConexion(EstadoConexion conexion) {
			this.conexion = conexion;
		}

		public void abrir(){
			this.getConexion().abrir(this);
		}
		public void cerrar(){
			this.getConexion().cerrar(this);
		}
		
}
