package Encapsulation;

public class Dog1 {
	private String name;
	private String color;
	private String breed;
	private int age;
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
		
	}
	public void setcolor(String color){
		this.color=color;
	}
	public String getcolor() {
		return color;
		
	}
	public void setbreed(String breed) {
		this.breed=breed;
	}
	public String getbreed() {
		return breed;
		
	}
	public void setage(int age) {
		if (age>5) {
		this.age=age;
		}
		else{
			this.age=0;
			
		}
	}
	public int getage() {
		return age;
		
	}
}
