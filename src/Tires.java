import java.util.Random;

public class Tires {
	String size;
	double[] tireWearOff;
	Random wearOffFactor;
	double a;
	double b;

	Tires() {
		this.size = "XL";
		tireWearOff = new double[4];
		wearOffFactor = new Random();
		for (int i = 0; i < 4; i++) {
			tireWearOff[i] = 1 + wearOffFactor.nextDouble() * 0.1 ;

		}

	}
	public String toString () {
		
		return "tires' size: " + this.size + "tires' factors:" +  this.tireWearOff[0] + "\n" 
				+ this.tireWearOff[1] + "\n" + this.tireWearOff[2] + "\n" 
				+ this.tireWearOff[3];
		
	}
	

	void random() {
		a = 1 + Math.random();
		b = 1 + Math.random();
		System.out.println(a);
		System.out.println(b);
	}
	// public int nextInt() {
	// return next(32);
	// }

}
