package edu.aca.lessonoop.inheritance;

public class Engine {
	
	private int power;
	private String gasType;
	private int cylinder;
	private float volume;
	private String material;
	private int gasExpense;
	
	
	
	public Engine(int power, float volume, int gasExpense) {
		super();
		this.power = power;
		this.volume = volume;
		this.gasExpense = gasExpense;
	}
	int getGasExpense() {
		return gasExpense;
	}
	void setGasExpense(int gasExpense) {
		this.gasExpense = gasExpense;
	}
	int getPower() {
		return power;
	}
	void setPower(int power) {
		this.power = power;
	}
	String getGasType() {
		return gasType;
	}
	void setGasType(String gasType) {
		this.gasType = gasType;
	}
	int getCylinder() {
		return cylinder;
	}
	void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	float getVolume() {
		return volume;
	}
	void setVolume(float volume) {
		this.volume = volume;
	}
	String getMaterial() {
		return material;
	}
	void setMaterial(String material) {
		this.material = material;
	}
	
	

}
