package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
	 
public class Conexion {
	
	public static Connection conectar() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jardineria?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "admin", "4DM1n4DM1n");
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery("select * from empleado");
//		
//		while (resultSet.next()) {
//			String codigoEmpleado = resultSet.getString("codigo_empleado");
//			String nombre = resultSet.getString("nombre");
//			System.out.println("Resultado X: Codigo empleado: " + codigoEmpleado + " Nombre del empleado: " + nombre);
//		}
//		connection.close();
		
		return connection;
		
//		Connection con = null;
//			
//		String password = "4DM1n4DM1n";
//		String usuario = "admin";
//		String url = "jdbc:mysql://localhost:3306/jardineria?user=" + usuario
//				+ "&password=" + password;
//		try {
//			con = DriverManager.getConnection(url);
//			if (con != null) {
//				System.out.println("Conectado");
//			}
//		} catch (SQLException e) {
//			System.out.println("No se pudo conectar a la base de datos");
//			e.printStackTrace();
//		}
//		return con;
		
	}// fin Connection

} //fin del class
