package serialization_deserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ArrayDriverSerialization {
	
	public static void main(String[] args) throws IOException {
		Employ e1 = new Employ("Vishal" , 1 , "vishal123" , 2928193.2);
		Employ e2 = new Employ("Hariom" , 2 , "hari123" , 2928193.2);
		Employ e3 = new Employ("Shivam" , 3 , "shivam234" , 2928193.2);
		Employ e4 = new Employ("Shubha" , 4 , "shubham342" , 1928193.2);
		Employ e5 = new Employ("Rajesh" , 5 , "rajesh451" , 3228193.2);
		Employ e6 = new Employ("Sunny" , 6 , "sunny654" , 2300093.2);
		Employ [] x = new Employ[6];
		x[0]=e1; x[1]=e2;x[2]=e3; x[3]=e4;x[4]=e5;x[5]=e6;
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		try {
		    fos = new FileOutputStream("d:\\File Handling\\Program10.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(x);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fos.close();
			oos.close();
		}
		System.out.println("========Program Ends========");
		
	}

}
