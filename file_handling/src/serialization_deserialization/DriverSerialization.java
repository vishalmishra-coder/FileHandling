package serialization_deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DriverSerialization {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		Employ e1 = new Employ("Sunny" , 12 , "sunny123" , 293820.282);
		Employ e2 = new Employ("Ram" , 13 , "ram234" , 29378203.292);
		
		try {
			fos = new FileOutputStream("d:\\File Handling\\Program9.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
			oos.writeObject(e2);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			
			fos.close();
			oos.close();
		}
		System.out.println("=========Serialization is Completed==========");
	}

}
