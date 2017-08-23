
public class SportsCar extends Car implements Talking {

	SportsCar() {
		super();
	}
	
	SportsCar(double maxCapacityOfTank, int cylinders) {
		super(maxCapacityOfTank, cylinders);
	}

	void burningTires() {
		System.out.println("wrrruuuu");
	}
	
	public void sayIt(String something) {
		System.out.println(something);
	}
	

}
