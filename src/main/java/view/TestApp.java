package view;

import connection.DbConnection;

public class TestApp {
	public static void main(String[] args) {
		System.out.println("test >>>>>>>>> " + DbConnection.getConnection());

	}
}
