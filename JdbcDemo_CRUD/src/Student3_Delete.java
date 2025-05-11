import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Student3_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		PreparedStatement st = null;
		
		Scanner sc = new Scanner(System.in);
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/company?user=root&password=root1234";
		String sql = "delete from student where id = ?";
		
		try {
//			step 1
			Class.forName(dpath);
			
//			step 2
			con = DriverManager.getConnection(url);
			
//			step 3
			st = con.prepareStatement(sql);
			
			System.out.println("Enter ID to delete from the record");
			
			int id = sc.nextInt();
			
			st.setInt(1, id);
			
//			step 4
			int data = st.executeUpdate();
			
//			step 5
			System.out.println(data + " row(s) deleted");
			
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
