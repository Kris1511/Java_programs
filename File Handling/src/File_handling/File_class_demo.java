package File_handling;
import java.io.*;
import java.util.Scanner;

public class File_class_demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		String path = "D:\\oct\\code\\important.txt";
//		
////		String path = "D:\\oct\\code\\important2.txt";	it'll hide the file
//		
//		File file = new File(path);
//		
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.isHidden());
//		System.out.println(file.isFile());
//		System.out.println(file.canRead());
//		System.out.println(file.canWrite());
//		System.out.println(file.canExecute());
//		System.out.println(file.getName());
//		System.out.println(file.getParent());
//		System.out.println(file.getCanonicalPath());	// throws exception
//		System.out.println(file.getPath());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String name = sc.next();
		
		System.out.print("Hello welcome ");
		
		// err to print the output
		System.err.println(name);		// output is red color cause we use "err" PrintStream
		
		

	}

}
