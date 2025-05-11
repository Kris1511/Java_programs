package Serialization;
import java.io.*;

public class SerialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Student stu = new Student(101, "Omkar");
			
			System.out.println(stu.id + ", " + stu.name);
			
			System.out.println("This object will be removed");
			
			// serialization
			String path = "D:\\oct\\code\\important.txt";
			
			FileOutputStream fos = new FileOutputStream(path);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(stu);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
