package Seleniumprograms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCDemo {
	

		public static void main(String[] args){
			// TODO Auto-generated method stub

			try {
				
			// To retrieve data from MySQL
			Class.forName("com.mysql.jdbc.Driver");
			//Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/CTS_DB","root","root");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL52?characterEncoding=latin1", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp2");

			while(rs.next())
		
			System.out.println(rs.getInt(1)+"\t | "+rs.getString(2)+"\t | "+rs.getString(3)+"\t | "+rs.getInt(4)+"\t | "+rs.getInt(5)+"\t | "+rs.getInt(6)+"\t | "+rs.getInt(7));
			con.close();
		
			}catch(ClassNotFoundException c) {
				c.printStackTrace();
				System.out.println("The class name you mentioed is not correct");
			}catch(SQLException s){
				System.out.println("please chec the url or username or password to connect with the My SQL data base");
			}
		}
		
}
