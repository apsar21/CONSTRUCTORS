package Encapsulation;

public class Student {
	int roll;
	String name;
	
	Student(){
		System.out.println("First constructor");
	}
	Student(String name,int roll){
		this(name);
		System.out.println("Second constructor");
	}
	Student(String name){
		this();
		System.out.println("Third constructor");
	}

}
