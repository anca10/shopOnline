package main.java.com.fortech.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainTest {
	public static void main(String[] args){
		String url = "jdbc:postgresql://localhost:5432/myDb";
		String user = "postgres";
		String pass = "parola";
		Connection conn = null;
		
		try{
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, user, pass);
			
			Statement st = conn.createStatement();
			
			ResultSet result = st.executeQuery("SELECT name from cities");
			
			while(result.next()){
				System.out.println(result.getString("name"));
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
