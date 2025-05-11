package Serialization;

import java.io.*;

public class DeserialDemo {
	public static void main(String[] args) {
		
		try {
			
			String path = "D:\\oct\\code\\important.txt";
			
			FileInputStream fis = new FileInputStream(path);
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student st = (Student) ois.readObject();
			
			System.out.println(st.id + " " + st.name);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
