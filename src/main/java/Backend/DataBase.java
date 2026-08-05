package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

	private static final String URL = "jdbc:mysql://localhost:3306/restaurant_dashboard";
	
	private static final String USER = "root";
	
	private static final String PASSWORD  =  "Fcauw9313$%^";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL,USER, PASSWORD);
	}
}
