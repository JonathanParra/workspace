package cl.java.DB;

import java.sql.*;

//sin statement

public class ConectarBaseDatos  {
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		PreparedStatement pstatementSelect = conexion.prepareStatement("SELECT * FROM alumnos WHERE nombre = ?");
//		pstatementSelect.setString(1,"Jonathan");

		Class.forName("com.mysql.jdbc.Driver"); //driver
		Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso", "alumnos", "java123");
	
		PreparedStatement pstatementInsert = conexion.prepareStatement("INSERT INTO  alumnos(idalumno,nombre,apellido,apellidoMaterno)"+"VALUE (?,?,?,?);");
		pstatementInsert.setInt(1,7);
		pstatementInsert.setString(2,"Jonathan");
		pstatementInsert.setString(3,"Parra");
		pstatementInsert.setString(4,"Villarroel");
		
		int resultpInsert=pstatementInsert.executeUpdate();
		System.out.println(resultpInsert);
		
	}
	
	public void insert(String nombre,String password){
		
	}
}
