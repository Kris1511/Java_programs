package Singleton_with_serializable_deserializable_2;

import java.io.*;

public class Singleton implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	
	// return object instance only
	private Object readResolve() {		// use protected also
		return getInstance();
	}

}
