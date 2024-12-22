package file_handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class CountNumericCharacter {
	public static void main(String[] args) throws IOException {
		int count =0;
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("d:\\File Handling\\Program8.txt");
			int x = fis.read();
			while(x!=-1) {
				if(x>=48 && x <=57) {
					count++;
				}
				x = fis.read();
				
			}
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		}
		finally {
			fis.close();
		}
		System.out.println("Total Numeric Character are : " + count);
		System.out.println("Program Ends !!");
		
	}

}
