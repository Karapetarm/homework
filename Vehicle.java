package edu.aca.lessonoop.inheritance;

public abstract class Vehicle {
	
	private int speed;
	private int weight;
	private int colour;
	private int seatsNumber;
	//vehicle has-a engine
	private Engine engine;
	
	
	public Vehicle(int speed, int weight, int colour, int seatsNUmber, Engine engine){
		this.speed = speed;
		this.weight = weight;
		this.colour = colour;
		this.seatsNumber = seatsNUmber;
		this.engine = engine;
	}
	
	protected abstract int gasExpense(int km);
	
	public String howToStartManual(){
		return "use the key to start the engine and press the gas acceleration";
	}
	
	@Override
	public String toString() {
		return "Vehicle [speed=" + speed + ", weight=" + weight + ", colour=" + colour + ", seatsNumber=" + seatsNumber
				+ ", engine=" + engine + "]";
	}

	protected int getSpeed() {
		return speed;
	}
	protected void setSpeed(int speed) {
		this.speed = speed;
	}
	protected int getWeight() {
		return weight;
	}
	protected void setWeight(int weight) {
		this.weight = weight;
	}
	protected int getColour() {
		return colour;
	}
	protected void setColour(int colour) {
		this.colour = colour;
	}
	protected int getSeatsNumber() {
		return seatsNumber;
	}
	protected void setSeatsNumber(int seatsNumber) {
		this.seatsNumber = seatsNumber;
	}
	protected Engine getEngine() {
		return engine;
	}
	protected void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	
	
}
