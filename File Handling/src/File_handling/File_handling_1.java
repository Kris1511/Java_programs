package File_handling;
import java.io.*;

public class File_handling_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path1 = "D:\\oct\\input.txt";
		
		String path2 = "D:\\oct\\output.txt";
		
		try {
			FileInputStream fis = new FileInputStream(path1);
			
			FileOutputStream fos = new FileOutputStream(path2);
			
			int x;
			
			// 
			while((x = fis.read()) != -1) {
				fos.write(x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
