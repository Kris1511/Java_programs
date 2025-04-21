package Singleton_pattern;
import java.io.*;

public class PrimeMinister {
	
	private static PrimeMinister pm = null;
	
	private PrimeMinister() {
		
	}
	
	public static PrimeMinister getObject() {
		
		if (pm == null) {
			pm = new PrimeMinister();
		}
		
		// else internally
		return pm;
	}

}
