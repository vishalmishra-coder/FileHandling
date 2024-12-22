package serialization_deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ListDriverSerialiazation {
	public static void main(String[] args) throws IOException {
		Employ e1 = new Employ("Vishal" , 1 , "vishal123" , 2928193.2);
		Employ e2 = new Employ("Hariom" , 2 , "hari123" , 2928193.2);
		Employ e3 = new Employ("Shivam" , 3 , "shivam234" , 2928193.2);
		Employ e4 = new Employ("Shubha" , 4 , "shubham342" , 1928193.2);
		Employ e5 = new Employ("Rajesh" , 5 , "rajesh451" , 3228193.2);
		Employ e6 = new Employ("Sunny" , 6 , "sunny654" , 2300093.2);
		List<Employ> l1 = new ArrayList<>();
		l1.add(e1);l1.add(e2); l1.add(e3); l1.add(e4); l1.add(e5); l1.add(e6);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
	    try {
			fos = new FileOutputStream("d:\\File Handling\\Program11.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(l1);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			fos.close();
			oos.close();
		}
	    System.out.println("Program Ends");
	}
	

}
