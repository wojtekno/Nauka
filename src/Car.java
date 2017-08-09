
public class Car {
	// fields
	private double maxCapacityOfTank;
	private double fuel;
	String color;
	private Engine engine;
	private Tires tires;
	public double distanceDriven; 
	
	Car() {
		maxCapacityOfTank = 50;
		fuel = 29;
		color = "blue";
		engine = new Engine();
		tires = new Tires();
		distanceDriven = 20;
		
	}
	Car(double maxCapacityOfTank, int cylinders) {
		this.maxCapacityOfTank = maxCapacityOfTank;
		engine = new Engine();
		tires = new Tires();
		engine.setCylinders(cylinders); 
		fuel = 35;
	}
	
	public String toString() {
		return "Capacity: " + maxCapacityOfTank + "\n" + "Color: " + color + "\n" 
				+ "Fuel: " + fuel + "\n" + "Type of gas: " + engine.getTypeOfGas() + "\n" 
				+ "number of cylinders: " + engine.getCylinders();
	}

	void printSpec() {
		System.out.println("Capacity: " + maxCapacityOfTank + "\n" + "Color: " + color + "\n" 
				+ "Fuel: " + fuel + "\n" + "Type of gas: " + engine.getTypeOfGas() + "\n" 
				+ "number of cylinders: " + engine.getCylinders());
	}

	// getter
	double getFuel() {
		return fuel;
	}

	// setter
	void setMaxCappacityOfTank(double maxCapacity) {
		// czy mogę tak 5 < a < 15 ??
		if (5 < maxCapacity && maxCapacity < 150) {
			maxCapacityOfTank = maxCapacity;
		}

	}

	String getTypeOfGas() {
		return engine.getTypeOfGas();
	}

	void tank(String typeOfGas, int quantityOfGas) {
		if (typeOfGas.equals(engine.getTypeOfGas())) {
			if ((maxCapacityOfTank - fuel) < quantityOfGas) {
				System.out.println( "you could tank only: " 
						+ (maxCapacityOfTank - this.fuel) + " litres of " + engine.getTypeOfGas());
				fuel = maxCapacityOfTank;
				System.out.println("you did it, and now your tank is full: " + (int) fuel + " litres");

			} else {
				fuel = fuel + quantityOfGas;
				System.out.println(
						"You put " + quantityOfGas + " litres of gas and now there is " + (int) fuel + " litres");

			}
		} else {
			System.out.println("you want to put wrong type of gas.\n" + "Try " + engine.getTypeOfGas());
		}
	}
	
	void drive(int distanceToGo) {
		if (this.fuel > ((distanceToGo * engine.fuelBurningFactor) / 100) && tires.tireEndurance > (distanceToGo * tires.tireWearOff[0]) ) {
			this.distanceDriven =  + distanceToGo ;
			System.out.println("You are driving. Have a safe trip");
			System.out.println("You're at your destination. Thank you for a nice ride");
		} else if(this.fuel < ((distanceToGo * engine.fuelBurningFactor) / 100) && tires.tireEndurance < ((double)distanceToGo * tires.tireWearOff[0]) ){
			System.out.println("You dont have enough gasoline, and your tires aren't strong enough");
		} else if (this.fuel < (distanceToGo * engine.fuelBurningFactor) / 100) {
			System.out.println("Not enough fuel");
		} else {
			System.out.println("Your tires to old");
		}
	}
}


// string sie nieporuwnje "==" tylko ".equals"