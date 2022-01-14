package theorie._700_790_._700_MySQL;

//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class _020_SHOW_DATABASES {

	public static void main(String[] args) {
		
		// Der letzte Teil des Strings ist der Name der Datenbank		
		String url = "jdbc:mysql://localhost:3306/mysql";
		String user = "root";
		String password = "";
		
		// try-with-resource
		try (Connection con = DriverManager.getConnection(url, user, password)) {
			
			String query = "SHOW DATABASES;";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
