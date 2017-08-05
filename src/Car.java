
public class Car {
	//fields
	private double maxCapacityOfTank = 50;
	private double fuel = 35;
	String color;
	private String typeOfGas = "GAZ";
	
	void printSpec () {
		System.out.println("Capacity: " + maxCapacityOfTank + "\n"
				+ "Color: " + color + "\n"
				+ "Fuel: " + fuel + "\n"
				+ "Type of gas: " + typeOfGas);
	}
	//getter
	double getFuel () {
		return fuel;
	}
	//setter
	void setMaxCappacityOfTank (double maxCapacity) {
		// czy mogę tak 5 < a < 15 ??
		if ( 5 < maxCapacity && maxCapacity < 150 ) {
			maxCapacityOfTank = maxCapacity;
		}
		
	}
	
	String getTypeOfGas () {
		return typeOfGas;
	}
	
	void tankYourCar (String typeOfGas, int quantityOfGas) {
		if ( typeOfGas .equals(this.typeOfGas)) {
			if ((maxCapacityOfTank - fuel) < quantityOfGas ) {
				System.out.println("you could tank only: "+ (maxCapacityOfTank - this.fuel) + " litres of " + this.typeOfGas);
				fuel = maxCapacityOfTank;
				System.out.println("you did it, and now your tank is full: " +(int)fuel + " litres");
				
			}
			else {
			fuel = fuel + quantityOfGas;
			System.out.println("You put " + quantityOfGas + " litres of gas and now there is " + (int)fuel + " litres");
			
			
			}
		}
		else {
			System.out.println("you want to put wrong type of gas.\n"   
					+ "Try " + this.typeOfGas);
		}
	}
}

//zrob funkcje tankuj(pomysl co bedzie przyjmowac i zwracac)
// jesli tankujesz to dodajesz
// ma capacity (zatankowales 35 ltr)
// naleznosc za paliwo 
// car - benzyna/gaz/ropa
// komunikat z odpowiednia benzyna
// string sie nieporuwnje "==" tylko  ".equals"