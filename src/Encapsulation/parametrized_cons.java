package Encapsulation;

public class parametrized_cons {
	private String name;
	private String color;
	private int cost;
	private int speed;
	//parameterized
	parametrized_cons (String name, String color,int cost,int speed) {
		super();
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.speed=speed;
	}
	public String getname() {
		return name;
		
	}
	public String getcolor() {
		return color;
		
	}
	public int getcost() {
		return cost;
		
	}
	public int getspeed() {
		return speed;
		
	}


}
