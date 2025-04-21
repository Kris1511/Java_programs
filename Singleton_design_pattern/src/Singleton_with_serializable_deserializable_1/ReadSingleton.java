package Singleton_with_serializable_deserializable_1;

import java.io.*;

public class ReadSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Singleton rs = Singleton.getObject();
			
			FileInputStream fis = new FileInputStream("D://oct//code//file1.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Singleton s = (Singleton) ois.readObject();
			
			System.out.println(s);
			
			System.out.println("Are both objects same? " + (rs == s));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
