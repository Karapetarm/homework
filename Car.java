package edu.aca.lessonoop.inheritance;

public final class Car extends Vehicle {
	
	private final String type;
	
	public Car(String type, int speed, int weight, int colour, Engine engine){
		super(speed, weight, colour, 5, engine);
		this.type = type;
	}
	public void carSpecificMethod(){
		
	}

	@Override
	public final int gasExpense(int km) {
		return km * getEngine().getGasExpense();
	}

	@Override
	public String toString() {
		return super.toString() + " Car [type=" + type + "]";
	}
	
	

}
