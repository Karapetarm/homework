package edu.aca.lessonoop.inheritance;

public class VehicleRunner {
	
	public static void main(String[] args){
		Engine carEngine = new Engine(12, 20, 2);
		Car car = new Car("cabriolet", 200, 300, 1, carEngine);
		car.gasExpense(0);
		
		Engine truckEngine = new Engine(15, 50, 5);
		Truck truck = new Truck(80, 1000000, 1, truckEngine, new TruckBed(), 500);
		
		Vehicle carVehicle = car;
		Vehicle truckVehicle = truck;
		
		car = (Car)carVehicle;
		
		Vehicle[] roadVehicle = new Vehicle[2];
		roadVehicle[0] = car;
		roadVehicle[1] = truck;
		
		for(Vehicle v : roadVehicle){
			System.out.println(v);
			System.out.println(v.howToStartManual());
			System.out.println("Gas Expense: " + v.gasExpense(5));
		} 
		
		if(car instanceof Vehicle){
			System.out.println("car is vehicle");
		}else{
			System.out.println("meh");
		}
		
		if(car.getClass().equals(Vehicle.class)){
			System.out.println("car is vehicle");
		}else{
			System.out.println("meh");
		}
		
	
	}

}
