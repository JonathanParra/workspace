package cl.java.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConectarseDB {

	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.108:3306/curso", "alumnos", "java123");
			Statement s=conexion.createStatement();
			
			String nombreUsuario = JOptionPane.showInputDialog("Ingrese un nombre");
			String password = JOptionPane.showInputDialog("Ingrese un password");
			
			//s.executeQuery("select * from usuarios where"+"'nombre_usuario='"+nombreUsuario+"'AND"+"password= '"+password+"';");  //seleccionas un numbre y passwors de la base de datos;
			
				
			s.executeUpdate("INSERT INTO usuarios" + "(nombre_usuario,password)"+ "VALUES('"+nombreUsuario+"','"+password+"');");
			//ResultSet rs = s.executeQuery("select * from alumnos");
			//ResultSet rs = s.executeQuery("select * from usuarios where" + "nombre_usuario ='"+nombreUsuario+"'AND"+"password ='"+password+"';");
//			if(rs.next()){
//				JOptionPane.showMessageDialog(null, "Accesocorrecto");
//				
//			}
//			else{
//				JOptionPane.showMessageDialog(null, "Acceso denegado");
//			}
			
			//while(rs.next()){
				//System.out.println(rs.getInt(1));
				//System.out.println(rs.getInt("idalumno"));
				
				//System.out.println(rs.getString("nombre"));
				//System.out.println(rs.getString(2));
			//}
			//int resultado = x.executeUpdate("INSERT INTO curso.alumnos(idalumnos,nombre,apellido)"+"VALUES('3','juan','maldonado');");
			
		
	}

}
