package Annotation;

public class Demo1 {
	
	void sample() {
		System.out.println("Hello world");
	}
	
	@Deprecated		// means in future this will no longer used
	void greet() {
		System.out.println("Hello");
	}
	
	void betterGreet() {
		System.out.println("Hello user...");
	}

}
