package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

import connection.DbConnection;

public class TestApp {
	
	public static void main(String[] args) {
		// connection
		System.out.println("Test connection --> " + DbConnection.getConnection());
	}
}
