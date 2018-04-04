package model;

public class TrappedZooKeeper {
	private String name;
	private String uniformColor;
	private int age;
	private Boolean wasEaten;

	public TrappedZooKeeper() {
		
	}
	public TrappedZooKeeper(String name, String uniformColor, int age, Boolean wasEaten) {
		super();
		this.name = name;
		this.uniformColor = uniformColor;
		this.age = age;
		this.wasEaten = wasEaten;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniformColor() {
		return uniformColor;
	}

	public void setUniformColor(String uniformColor) {
		this.uniformColor = uniformColor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Boolean getWasEaten() {
		return wasEaten;
	}

	public void setWasEaten(Boolean wasEaten) {
		this.wasEaten = wasEaten;
	}
	public String speak() {
		return "Help!";
	}
}
