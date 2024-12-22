package serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ListDriverDeserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("d:\\File Handling\\Program11.ser");
			ois = new ObjectInputStream(fis);
			List<Employ> o = (List<Employ>)ois.readObject();
			for(Object x : o) {
				System.out.println(x);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			fis.close();
			ois.close();
		}
	}

}
