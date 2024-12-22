package file_handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Programs5 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String name = sc.nextLine();
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println("Enter the weight : ");
		double weight = sc.nextDouble();
		FileWriter fw =null;
		
		try {
			
			fw = new FileWriter("d:\\File Handling\\Program5.txt");
			fw.write("Name is : " + name);
			fw.write("\nAge is : " + age + " years");
			fw.write("\nWeight is : " + weight );
			
		} 
		
		catch (IOException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		finally {
			
			fw.close();
			System.out.println("File Closed");
			
		}
		
	}

}
