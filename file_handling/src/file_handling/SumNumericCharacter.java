package file_handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class SumNumericCharacter {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		int sum =0;
		
		try {
			fis = new FileInputStream("d:\\File Handling\\Program8.txt");
			int x = fis.read();
			while(x!=-1) {
				if(x>=48 && x<=57) {
					sum = sum + x - 48;
				}
				x = fis.read();
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fis.close();
		}
		System.out.println("Sum of Numeric Characters is : " + sum);
		System.out.println("===========Program Ends !! ============");
		
	}

}
