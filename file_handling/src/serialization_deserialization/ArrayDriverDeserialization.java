package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ArrayDriverDeserialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("d:\\File Handling\\Program10.ser");
			ois = new ObjectInputStream(fis);
			Employ[] e = (Employ[])ois.readObject();
			for(Employ x : e) {
				System.out.println(x);
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fis.close();
			ois.close();
		}
		System.out.println("==============Program Ends============");
	}

}
