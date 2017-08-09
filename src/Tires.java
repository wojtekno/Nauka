import java.util.Random;

public class Tires {
	String size;
	double[] tireWearOff;
	Random generator;
	double a;
	double b;
	int tireEndurance;

	Tires() {
		this.size = "XL";
		tireWearOff = new double[4];
		generator = new Random();
		for (int i = 0; i < 4; i++) {
			tireWearOff[i] = 1 + (generator.nextDouble() * 0.1) ;

		}
		tireEndurance = 20;

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
