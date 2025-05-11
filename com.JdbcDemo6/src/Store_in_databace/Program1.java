package Store_in_databace;

import java.sql.*;

public class Program1 {
	
//	static String dpath = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost/company?user=root&password=root1234";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Student stu = new Student(101, "Vijay", "Btm", 2022);
		
		regStudent(stu);

	}
	
	public static void regStudent(Student stu) {
			
//			Class.forName(dpath);
			
			try {
				
				Connection con = DriverManager.getConnection(url);
				
				System.out.println("Data base connected");

				// extracting the values from object
				int id = stu.id;
				String name = stu.name;
				String address = stu.address;
				int yearOfpass = stu.yearOfpass;
				

				String sql = "Insert into student values(?, ?, ?, ?)";
				PreparedStatement ps = con.prepareStatement(sql);
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, address);
				ps.setInt(4, yearOfpass);
				
				ps.executeUpdate();
				
				System.out.println("Student registered successfully!");
				
			} catch (Exception e) {
				e.printStackTrace();
			} 		
	}

}


class Student {
	
	int id;
	String name;
	String address;
	int yearOfpass;
	
	public Student(int id, String name, String address, int yearOfpass) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.yearOfpass = yearOfpass;
	}
	
}