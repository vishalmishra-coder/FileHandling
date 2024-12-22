package serialization_deserialization;

import java.io.Serializable;

public class Employ implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name ;
	int id ;
	transient String pwd ;
	double salary;
	Employ(){
//		no-arg constructor
	}
	Employ(String name , int id , String pwd , double salary){
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.salary = salary;
	}
	
	public String toString() {
		return "Name is :" + name + "\tId is : " + id + "\tPassword is : " + pwd + "\tSalary is : " + salary;
	}
	

}
