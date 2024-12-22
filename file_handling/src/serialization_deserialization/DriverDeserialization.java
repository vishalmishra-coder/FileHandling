package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DriverDeserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("d:\\File Handling\\Program9.ser");
			ois = new ObjectInputStream(fis);
			Object o =ois.readObject();
			Employ e1 = (Employ)o;
			System.out.println(e1);
			Employ e2 = (Employ)ois.readObject();
			System.out.println(e2);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fis.close();
			ois.close();
		}
		
		
	}

}
