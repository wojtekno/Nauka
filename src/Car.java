import java.util.Random;

public class Car {
	// fields
	private double maxCapacityOfTank;
	private double fuel;
	String color;
	private Engine engine;
	private Tires tires;
	private double distanceDriven;
	double[] wearedOff;
	boolean[] conditionArray;
	boolean condition;
	double distanceToGo;
	Random generator;
	double estimateNumber;
	//OnBoardComputer time = new OnBoardComputer();
		
	Car() {
		maxCapacityOfTank = 50;
		fuel = 29;
		color = "blue";
		engine = new Engine();
		tires = new Tires();
		conditionArray = new boolean[4];
		distanceDriven = 850;
		wearedOff = new double[4];
		for (int i = 0; i < 4; i++) {
			wearedOff[i] = distanceDriven * tires.tireWearOff[i];
		}
		generator = new Random();
		estimateNumber = 1 + 0.1 * generator.nextDouble();
	}

	Car(double maxCapacityOfTank, int cylinders) {
		this.maxCapacityOfTank = maxCapacityOfTank;
		engine = new Engine();
		tires = new Tires();
		conditionArray = new boolean[4];
		engine.setCylinders(cylinders);
		fuel = 35;
		distanceDriven = 600;
		wearedOff = new double[4];
		for (int i = 0; i < 4; i++) {
			wearedOff[i] = distanceDriven * tires.tireWearOff[i];
		
		}
		generator = new Random();
		estimateNumber = 1 + 0.1 * generator.nextDouble();
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

	boolean ifTiresOk() {
		for (int i = 0; i < 4; i++) {
			conditionArray[i] = (wearedOff[i] + (this.distanceToGo * tires.tireWearOff[i])) < tires.getTireEndurance();
			if (conditionArray[i] == false) {
				condition = false;
				break;
			} else {
				condition = true;
			}
		}
		return condition;
	}
	
	//convert number to hh:mm
	void drive(double distanceToGo) {
		ifTiresOk();
		
		if (condition == true && this.fuel > ((distanceToGo * engine.fuelBurningFactor) / 100)) {
			System.out.println("You have " + distanceToGo + "km to go and you will use aprox "
					+ (distanceToGo * engine.fuelBurningFactor) / 100 + "out of " + this.getFuel()
					+ " you have now \nHave a nice trip");

			this.fuel -= (distanceToGo * engine.fuelBurningFactor * estimateNumber) / 100;
			for (int i = 0; i < 4; i++) {
				wearedOff[i] += this.distanceToGo * tires.tireWearOff[i];
			}
			System.out.println("Thank you for safe trip. It took you " + ((distanceToGo / (80 * estimateNumber)))
					+ "hours.\nYou burnt " + (distanceToGo * engine.fuelBurningFactor * estimateNumber) / 100
					+ "l of gasoline");

		} else {
			if (this.fuel < ((distanceToGo * engine.fuelBurningFactor) / 100)) {
				System.out.println("You don't have enough gas");
			}
			if (condition == false) {
				System.out.println("Your tires are too old");
			}

		}
	}
}

// string sie nieporuwnje "==" tylko ".equals"