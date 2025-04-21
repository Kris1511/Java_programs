package Singleton_with_serializable_deserializable_1;
import java.io.*;

public class WriteSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			Singleton si = Singleton.getObject();
			
			FileOutputStream fos = new FileOutputStream("D://oct//code//file1.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(si);
			
			System.out.println(oos);
			
			oos.close();
			
			System.out.println("PrimeMinister object serialized to pm.obj");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
