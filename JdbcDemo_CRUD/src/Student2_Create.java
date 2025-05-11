import java.util.Scanner;
import java.sql.*;

public class Student2_Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		PreparedStatement st = null;
		
		Scanner sc = new Scanner(System.in);
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/company?user=root&password=root1234";
		String sql = "insert into student values(?, ?, ?, ?, ?, ?)";
		
		try {
			
//			step 1
			Class.forName(dpath);
			
//			step 2
			con = DriverManager.getConnection(url);
			
//			step 3
			st = con.prepareStatement(sql);
			
			System.out.println("Enter ID, Name, Age, Mark, Email, Phone");
			
			int id = sc.nextInt();
			String name = sc.next();
			int age = sc.nextInt();
			int mark = sc.nextInt();
			String email = sc.next();
			int phone = sc.nextInt();
			
			st.setInt(1, id);
			st.setString(2, name);
			st.setInt(3, age);
			st.setInt(4, mark);
			st.setString(5, email);
			st.setInt(6, phone);
			
//			step 4
			int data = st.executeUpdate();
			
//			step 5
			System.out.println(data + " row(s) inserted");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
//			step 6
			try {
				con.close();
				st.close();
				sc.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
