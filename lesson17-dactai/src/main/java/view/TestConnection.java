package view;

import connection.DbConnection;

public class TestConnection {
	public static void main(String[] args) {
		System.out.println("test >>>>>>>>> " + DbConnection.getConnection());

	}

}
