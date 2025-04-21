package Singleton_with_serializable_deserializable_2;

import java.io.*;

//Singleton_with_serializable_deserializable_2.Singleton@282ba1e
//Singleton_with_serializable_deserializable_2.Singleton@282ba1e
//true


public class SingletonSerializationPattern {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Singleton s = Singleton.getInstance();
		
		// Serialization		
		FileOutputStream fos = new FileOutputStream("D://oct//code//simple1.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s);
		
		System.out.println(s);
		
		fos.close();
		oos.close();
		
		
		// Deserialization		
		FileInputStream fis = new FileInputStream("D://oct//code//simple1.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Singleton res = (Singleton) ois.readObject();
		
		System.out.println(res);
		
		
		fis.close();
		
		ois.close();
		
		System.out.println(s == res);

	}

}
