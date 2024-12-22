package file_handling;
import java.io.FileWriter;
import java.io.IOException;
public class Programs3 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Program Starts");
		FileWriter fw = null;
		try {
			
			fw = new FileWriter("d:\\File Handling\\Program3.txt");
			fw.write(65);
			fw.write(66);
			fw.write("\n");
			
			char [] c= {'a','b','c','d','e'};
			fw.write(c);
			fw.write(" ");
			fw.write(c , 1 , 3);
			fw.write("\n");
			String s1 = "Mohan and Sohan are Brothers";
			fw.write(s1);
			fw.write("\n");
			fw.write(s1 ,3 , 7);
			
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
		}
		finally {
			fw.close();
			System.out.println(" File Closed !!");
		}
		System.out.println("Program Ends!!");
		
		
	}

}
