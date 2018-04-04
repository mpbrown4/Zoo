package model;

public class Goat {
	private String name;
	private String location;
	private int age;
	
	public Goat() {
			super();
	}
	public Goat(String name, String location, int age) {
		super();
		this.name = name;
		this.location = location;
		this.age = age;
	}	
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getlocation(){
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getage(){
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String speak() {
		return "bleat";
	}
}
