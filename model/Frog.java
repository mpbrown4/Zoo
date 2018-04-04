// Joes new animal
package model;

public class Frog {
	private String name;
	private int distance;
	private int age;
	
	public Frog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Frog(String name, int age, int distance) {
		super();
		this.name = name;
		this.distance = distance;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String speak() {
		return "RRRRRiiibbbittt!!!";
	}
	

}
