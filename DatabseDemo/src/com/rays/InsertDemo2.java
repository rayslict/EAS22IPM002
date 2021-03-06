package com.rays;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo2 {

	public static void main(String[] args) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Associates ID : ");
		int id = scanner.nextInt();		
		System.out.println("Enter Associates Email : ");
		String email = scanner.next();
		System.out.println("Enter Associates Mobile : ");
		long mobile =  scanner.nextLong();
		Connection connection=null;
		PreparedStatement pStatement = null;
		try {
		Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);		
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipm002", "root", "raysrmr");
		
			String qry = "insert into associates (id,email,mobile)values(?,?,?)";			
			pStatement = connection.prepareStatement(qry);
			pStatement.setInt(1, id);			
			pStatement.setString(2, email);
			pStatement.setLong(3, mobile);

			// 4. Execute the query or statement

			int a = pStatement.executeUpdate();
			if(a>0) {
				System.out.println(a+" Records Inserted....");
			}else {
				System.out.println("Records Not Inserted....");
			}
			
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}finally {
			pStatement.close();
			connection.close();
		}
	}

}
