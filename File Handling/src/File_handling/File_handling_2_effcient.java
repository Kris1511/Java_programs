package File_handling;

import java.io.*;

public class File_handling_2_effcient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path1 = "D:\\oct\\input.txt";
		
		String path2 = "D:\\oct\\output.txt";
		
		try {
			FileReader fr = new FileReader(path1);
			
			FileWriter fw = new FileWriter(path2);
			
			BufferedReader br = new BufferedReader(fr);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			String x;
			
			while ((x = br.readLine()) != null) {
				bw.write(x);
			}
			
			bw.flush();    // force fully pushed to the buffered writer
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
