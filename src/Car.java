
public class Car {
	//fields
	private double maxCapacityOfTank;
	private double fuel;
	String color;
	
	void printSpec () {
		System.out.println("Capacity: " + maxCapacityOfTank + "\n"
				+ "Color: " + color + "\n"
				+ "Fuel: " + fuel);
	}
	//getter
	double getFuel () {
		return fuel;
	}
	//setter
	void setMaxCappacityOfTank (double maxCapacity) {
		if (maxCapacity < 5 || 150 < maxCapacity) {
			System.out.println("You cannot because it has to be beetwen 5 an 150");
		}
		else {
			maxCapacityOfTank = maxCapacity;
		}
		
	}

}

//zrob funkcje tankuj(pomysl co bedzie przyjmowac i zwracac)
// jesli tankujesz to dodajesz
// ma capacity (zatankowales 35 ltr)
// naleznosc za paliwo 
// car - benzyna/gaz/ropa
// komunikat z odpowiednia benzyna
// string sie nieporuwnje "==" tylko  ".="