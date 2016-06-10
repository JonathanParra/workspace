package cl.curso.java.login_app;

import java.sql.*;

public class UsuarioDAO {
	public static boolean validar(Usuario usuario) throws SQLException{
		Conexion con=Conexion.getConexion();
		PreparedStatement st=con.getConnection().prepareStatement("select * from  usuarios where  nombre_usuario = ? AND password = ?;");
		st.setString(1, usuario.getUsuario());
		st.setString(2, usuario.getPassword());
		ResultSet rs = st.executeQuery();
		return rs.next();
	}
}
