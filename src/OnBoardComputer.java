import java.util.Random;

public class OnBoardComputer {
//	Car c = new Car();
	Random generator = new Random();
	double estimateNumber = 1 + 0.1 * generator.nextDouble();
	TimeOn ti = new TimeOn(this);
	int h;
	int min;
	
	 TimeOn makeTime(double distance) {
		ti.h = (int) ((distance / (80 * estimateNumber)));
		ti.min = (int) (((distance / (80 * estimateNumber) * 60) - (h * 60))) ;
		return ti;
		
	}
}
