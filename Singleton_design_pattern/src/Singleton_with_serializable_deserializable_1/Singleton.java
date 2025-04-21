package Singleton_with_serializable_deserializable_1;

import java.io.*;

public class Singleton implements Serializable {
	
	private static final long serislVersionUID = 1L;
	
	private static Singleton pm = null;
	
	public Singleton() {
		System.out.println("Constructor called");
	}
	
	public static Singleton getObject() {
		if (pm == null) {
			pm = new Singleton();
		}
		return pm;
	}
	
	
	// readResolve method to maintain singleton after deserialization return exists object
	protected Object readResolve() {
		return getObject();
	}

}
