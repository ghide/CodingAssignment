package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {
	
	private static  String HOST = "localhost";
	private static  String PASSWORD= "Test123!";
	private static  int PORT = 3306;
	private static  String SCHEMA= "Mysql";
	private static  String USER = "root";
	
public static Connection getConnection() {
		
		String uri = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", HOST, PORT, SCHEMA, USER, PASSWORD);
		//Connecting with url=jdbc:mysql://localhost:3306/Mysql?user=root&password=Test123!&useSSL=false
		System.out.println("Connecting with url=" + uri);
		
		
		try {
			Connection conn = DriverManager.getConnection(uri);
			System.out.println("Connection to schema '" + SCHEMA + "' is successful.");
			return conn;
			
		} catch (SQLException e) {
			System.out.println("Unable to get connection at " + uri);
			throw new DbException("Unable to get connection at \" +uri");
		}
	}
}

