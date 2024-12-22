package file_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Programs7 {
	public static void main(String[] args) throws IOException {
		FileReader fr=null;
		try {
			fr = new FileReader("d:\\File Handling\\Program7.txt");
			int x = fr.read();
			while(x != -1)
			{
			System.out.print((char)x);
			x = fr.read();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fr.close();
			System.out.println("File Closed!!");
		}
	}

}
