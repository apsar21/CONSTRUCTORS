package Encapsulation;

public class Animal {
	private String name;
	private String color;
	private String size;
	private int age;
	Animal(String name,String color,String size,int age){
		this.name=name;
		this.color=color;
		size=size;
		age=age;
		
	}
	public String getname() {
		return name;
	}
	public String getcolor() {
		return color;
	}
	public String getsize() {
		return size;
	}
	public  int getage() {
		return age;
	}

}
