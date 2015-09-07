package restaurant.reservation.util;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private final static String DB_URL="jdbc:mysql://localhost:3306/restaurant_db";
	private final static String DB_User="root";
	private final  static String DB_PASSWORD="Ymumapap8391";
	static{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("My SQL JDBC driver has loaded");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.err.println("Error in loading MySQL JDBC");
	}
		}
	public static Connection connect(){
		Connection conn=null;
				try{
		conn=DriverManager.getConnection(DB_URL,DB_User,DB_PASSWORD);
				System.out.println("Connection Successful");}catch(SQLException e){
					e.printStackTrace();
					System.err.println("Connection NOT Successful");
				}
		return conn;
	}

public static void main(String[] args){
	DBUtils.connect();
}}