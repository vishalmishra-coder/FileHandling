package file_handling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Programs4 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s1 = sc.nextLine();
		FileWriter fw=null;
		try {
			fw = new FileWriter("d:\\File Handling\\Program4.txt");
			fw.write(s1);
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		finally {
			fw.close();
			System.out.println("File Closed!!");
		}
		
		
	}

}
