package myjava.database.postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresJDBC {

	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}

		System.out.println("PostgreSQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "xxxxxxxxx");
			Statement st = connection.createStatement();
            		ResultSet rs = st.executeQuery("select * from names");
			
			if (rs.next()) {
				System.out.println(rs.getString(2));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			System.out.println("Connection successful!");
		}
	}
}
