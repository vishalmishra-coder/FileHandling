package file_handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Programs6 {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("d:\\File Handling\\Program6.txt");
			
			fos.write(65);
			fos.write("\n".getBytes());
			fos.write('B');
			fos.write("\n".getBytes());
			byte [] a = {'a','b','c','d','e','f'};
			byte [] b = {10 , 20 , 30 , 40};
			fos.write(a);
			fos.write(" ".getBytes());
			fos.write(a , 1 ,4);
			fos.write("\n".getBytes());
			fos.write(b);
			fos.write("\n".getBytes());
			String s1 = "Mohan";
			fos.write(s1.getBytes());
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			fos.close();
			System.out.println("File Closed!");
		}
		
		
	}

}
