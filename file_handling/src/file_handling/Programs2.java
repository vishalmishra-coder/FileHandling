package file_handling;
import java.io.File;
public class Programs2 {
	public static void main(String[] args) {
		File f1 = new File("d:\\");
//		File f1 = new File("d:\\Downloads");
		
		
		String [] s = f1.list();
		for(String p : s) {
			System.out.println(p);
		}
		
	}

}
