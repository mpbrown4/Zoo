package model;

public class Lion {

	boolean inPack = true;
	double weightInPounds = 300;
	int numberOfSiblings = 2;
	
	public Lion() {
		// TODO Auto-generated constructor stub
	}
	
	public String speak() {
		return "roar?";
	}
	
	public void setPackStatus(boolean newStatus) {
		this.inPack = newStatus;
	}
	public boolean getPackStatus() {
		return inPack;
	}
	public void setWeight(double newWeight) {
		this.weightInPounds = newWeight;
	}
	public double getWeight() {
		return weightInPounds;
	}
	public void setSiblingNumber(int newSiblingNumber) {
		this.numberOfSiblings = newSiblingNumber;
	}
	public int getSiblingNumber() {
		return this.numberOfSiblings;
	}
	

}
