package file_handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CountCharacter {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		int count=0;
		try {
			fis = new FileInputStream("d:\\File Handling\\Program8.txt");
			int x = fis.read();
			while(x!=-1) {
				count++;
				x = fis.read();	
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fis.close();
			System.out.println("Connection Closed!!");	
		}
		System.out.println("Total Charactes are : " + count);
		System.out.println("===========Programs Ends============");
		
	}

}
