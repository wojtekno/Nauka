
public class Car {
	// fields
	private double maxCapacityOfTank;
	private double fuel;
	String color;
	private Engine engine;
	private Tires tires;
	private double distanceDriven;
	double[] wearedOff;

	Car() {
		maxCapacityOfTank = 50;
		fuel = 29;
		color = "blue";
		engine = new Engine();
		tires = new Tires();
		distanceDriven = 950;
		wearedOff = new double[4];
		for (int i = 0; i < 4; i++) {
			wearedOff[i] = distanceDriven * tires.tireWearOff[i];

		}

	}

	Car(double maxCapacityOfTank, int cylinders) {
		this.maxCapacityOfTank = maxCapacityOfTank;
		engine = new Engine();
		tires = new Tires();
		engine.setCylinders(cylinders);
		fuel = 35;
		distanceDriven = 600;
		wearedOff = new double[4];
		for (int i = 0; i < 4; i++) {
			wearedOff[i] = distanceDriven * tires.tireWearOff[i];

		}
	}

	public String toString() {
		return "Capacity: " + maxCapacityOfTank + "\n" + "Color: " + color + "\n" + "Fuel: " + fuel + "\n"
				+ "Type of gas: " + engine.getTypeOfGas() + "\n" + "number of cylinders: " + engine.getCylinders();
	}

	void printSpec() {
		System.out.println("Capacity: " + maxCapacityOfTank + "\n" + "Color: " + color + "\n" + "Fuel: " + fuel + "\n"
				+ "Type of gas: " + engine.getTypeOfGas() + "\n" + "number of cylinders: " + engine.getCylinders());
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

	void getWearedOff() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Tyre No: " + i + " is worn " + wearedOff[i]);
		}
		System.out.println("out of " + tires.getTireEndurance());
	}

	void tank(String typeOfGas, int quantityOfGas) {
		if (typeOfGas.equals(engine.getTypeOfGas())) {
			if ((maxCapacityOfTank - fuel) < quantityOfGas) {
				System.out.println("you could tank only: " + (maxCapacityOfTank - this.fuel) + " litres of "
						+ engine.getTypeOfGas());
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

	double getDistnaceDriven() {
		return distanceDriven;
	}

	void drive(int distanceToGo) {
		boolean[] conditionArray;
		conditionArray = new boolean[4];
		int i = 0;

		if (this.fuel > ((distanceToGo * engine.fuelBurningFactor) / 100)) {
			for (i = 0; i < 4; i++) {
				conditionArray[i] = (wearedOff[i] + (distanceToGo * tires.tireWearOff[i])) < tires.getTireEndurance();
				if (conditionArray[i] == false) {
					System.out.println("Your tires are too old");
					break;
				}
				if (conditionArray[3] == true) {
					for (i = 0; i < 4; i++) {
						wearedOff[i] += /* wearedOff[i] + */ (tires.tireWearOff[i] * distanceToGo);
					}
					System.out.println("You have " + distanceToGo + "km to go and you will use aprox "
							+ (distanceToGo * engine.fuelBurningFactor) / 100 + "out of " + this.getFuel()
							+ " you have now \nHave a nice trip");
				}
			}
		} else {
			for (i = 0; i < 4; i++) {
				conditionArray[i] = (wearedOff[i] + (distanceToGo * tires.tireWearOff[i])) < tires.getTireEndurance();
				if (conditionArray[i] == false) {
					System.out.println("Your tires are too old and you don't have enough gas");
					break;
				}
				if (conditionArray[3] == true) {
					System.out.println("You have don't have enough gas");

				}
			}
		}
	}
}

// string sie nieporuwnje "==" tylko ".equals"