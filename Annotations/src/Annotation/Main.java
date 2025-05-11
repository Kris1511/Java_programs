package Annotation;

import java.util.*;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")  
		int a = 10;		// warnings gone when use @SuppressWarnings("unused") 
		
		Demo1 d2 = new Demo2();
		
		d2.sample();
		
		d2.greet();
		
//		both warning we get arraylist and al 
		
		@SuppressWarnings({"rawtypes", "unused"})
		ArrayList al = new ArrayList<>();

	}

}
