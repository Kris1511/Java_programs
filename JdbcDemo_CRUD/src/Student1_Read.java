import java.sql.*;

public class Student1_Read {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// step - 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loaded driver");
		
		
//		step - 2
		String url = "jdbc:mysql://localhost:3306/company";
		String uname = "root";
		String pass = "root1234";
		
		Connection con = DriverManager.getConnection(url, uname, pass);
		System.out.println("Connection established");
		
//		step - 3
		Statement st = con.createStatement();
		System.out.println("Statement created...");
		
//		step - 4
		String sql = "select * from student";
		
		ResultSet rs = st.executeQuery(sql);
		System.out.println("Query excuted..");
		
//		step - 5		// next method use for overall data in db
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " +
					rs.getInt(4) + " " + rs.getString(5) + rs.getInt(6));
		}
		
//		step - 6
		rs.close();
		st.close();
		con.close();

	}

}
