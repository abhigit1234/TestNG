package TestNG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class SQL_JDBC {
	@Test
	public void login() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/opencart","root","root");
		Statement st = con.createStatement();
		//String sql = "update employee set password='hasanth1234' where firstname = 'hasanth'";
		//String sql = "insert into  employee values('laxmidevi','devi','laxmi@gmail.com','9898922')";
		//String sql = "delete from employee where firstname='laxmidevi'";
		//st.executeUpdate(sql);
		
/*		String sql = "select name,age,dob from selenium";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
		String name = rs.getString("name");
		String age = rs.getString("age");
		String dob = rs.getString("dob");
		System.out.print(name+" ");
		System.out.print(age+" ");
		System.out.println(dob);
		}
*/
		con.close();
		System.out.println("success");
	}
	
}