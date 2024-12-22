package file_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Programs8 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		
			try {
				fis = new FileInputStream("d:\\File Handling\\Program7.txt");
				int x = fis.read();
				while(x!=-1) {
					System.out.print((char)x);
					x = fis.read();
				}
				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
			finally {
				fis.close();
				
			}
		
		
		
		
	}
	
	

}
