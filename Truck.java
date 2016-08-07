package edu.aca.lessonoop.inheritance;

public class Truck extends Vehicle {
	
	private int loadWeight;
	private int transferWeightLimit;
	private TruckBed bed;

	public Truck(int speed, int weight
			, int colour, Engine engine, TruckBed bed
			, int transferWeightLimit) {
		super(speed, weight, colour, 5, engine);
		this.bed = bed;
		this.transferWeightLimit = transferWeightLimit;
	}

	@Override
	protected int gasExpense(int km) {
		return km * getEngine().getGasExpense() + (int) (loadWeight * 0.1);
	}

	@Override
	public String toString() {
		return super.toString() + " Truck [transferWeightLimit=" + transferWeightLimit + "]";
	}
	
	@Override
	public String howToStartManual(){
		return "use the key to start the engine, make sure the bed key is present as well.";
	}
	
	public boolean addStuff(int kg){
		int total = loadWeight + kg;
		if(total <= transferWeightLimit){
			loadWeight = total;
			return true;
		}
		return false;
	}
	

}