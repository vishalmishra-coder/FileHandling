package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programs9 {
	public static void main(String[] args) {
		File f1 = new File("d:\\File Handling\\Program7.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(f1);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
