package com.club.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private Connection connection = null;
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private final String username="hr";
	private final String password="hr";
	
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		if(connection == null){
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(URL,username,password);
			
		}
		System.out.println("122");
		return connection;
	}
	
	public String closeConnection() throws SQLException
	{
		String closed = "open";
		connection.close();
		connection = null;
		
		if(connection == null)
		{
			closed = "closed";
		}
		return closed;
	}
}

