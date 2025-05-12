package myjava.database;

import java.sql.*;

public class SimpleDBConnect2 {

	public static void main(String... args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "xxxxxxxxxx");
			Statement stmt = conn.createStatement();
			String sql = "select name from test";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String name = rs.getString("name");
				System.out.println(name);
			}

			rs.close();
			stmt.close();
			conn.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
