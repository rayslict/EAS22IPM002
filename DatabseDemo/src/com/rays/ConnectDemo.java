package com.rays;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		// 1. Load a Driver
		
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		//2. Connect to the DB
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipm002", "root", "raysrmr");
		

		System.out.println("Connected.....");
	}

}
