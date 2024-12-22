package file_handling;
import java.io.File;
import java.io.IOException;
public class Programs1 {
	public static void main(String[] args) {
		System.out.println("Program Start!!");
		File f1 = new File("d:\\File Handling\\ Program1.txt");
		try {
			f1.createNewFile();
			System.out.println("File is Created");
			
		} catch (IOException e) {
			
			System.out.println("File is Not created");
			System.out.println(e.getMessage());
		}
		
//		f1.delete();
//		System.out.println("File is Deleted!");
		
	    System.out.println(f1.getTotalSpace());
	    System.out.println(f1.length());
//	    f1.setWritable(false);
	    System.out.println(f1.getAbsolutePath());
		System.out.println("Program Ends!!");
		
		
	}

}
