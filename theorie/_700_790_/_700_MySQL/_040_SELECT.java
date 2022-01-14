package theorie._700_790_._700_MySQL;

//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class _040_SELECT {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/mysql";
		String user = "root";
		String password = "";
		
		
		// try-with-resource
		try (Connection con = DriverManager.getConnection(url, user, password)) {
			
			String query = "SELECT Host, User FROM user;";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				// Columns
				System.out.print(rs.getString(1) + " - ");
				System.out.print(rs.getString(2));
				System.out.println();
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
