import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WileyConnection {
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyc352", "root", "2@rot48wDYA*");
	}

	public static Connection getConnection(String url, String username, String password) throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
}
