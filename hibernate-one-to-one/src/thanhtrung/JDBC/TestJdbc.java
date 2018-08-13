package thanhtrung.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false";
		String user = "hbstudent";
		String password = "hbstudent";
	
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			
			System.out.println("Connection success!");
		} catch (SQLException e) {
				
			e.printStackTrace();
		}

	}

}
