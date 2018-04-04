package model;

public class Fox {
	String name = "";
	int age = 0;
	String color = "";
	
	public Fox() {
		super();
	}
	
	public Fox(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String speak() {
		return "Yip Yip Yip";
	}
}
