import java.util.Random;

public class Main {
	// static - nie musi miec obiektu, uzywa sie do klas util

	public static void main(String[] args) {
		// literał
		int someNumber = 8;
		// Typ silny,
		// Integer
		// Methods m = new Methods();
		// m.firstMethod();
		// m.firstMethod();
		// m.firstMethod();
		// m.addTwoMore(5);
		// m.addTwoMore(someNumber);
		// int jakisWynik = m.square(11);
		// System.out.println(jakisWynik);
		// System.out.println(m.square(3));
		// m.arrayFiveXFive();
		// System.out.println();
		// m.print5x5x5();
		// System.out.println(m.mean(3, 2, 6));
		// System.out.println(m.charToInt('a'));
		// m.fooBar();
		// //
		Car maluch = new Car();
		// maluch.printSpec();
		// maluch.color = "yellow";
		// maluch.printSpec();
		// System.out.println(maluch.color);
		// //po kropce jest czyms innym
		// maluch.color.concat("asd").contains(maluch.color);
		// System.out.println(maluch);
		// //nie mozna bo private
		//// maluch.fuel = 100;
		// System.out.println(maluch.getTypeOfGas());
		// System.out.println("You have" + maluch.getFuel() + " l of fuel");
		// maluch.setMaxCappacityOfTank(45);
		// maluch.printSpec();

		// maluch.tank("GAZ", 7);

		System.out.println(maluch);
//		Car ferrari = new Car();
//		System.out.println(ferrari);
		CarFactory carFactory = new CarFactory();
		Car blackFerrari = carFactory.makeFerrari();
//		blackFerrari.printSpec();
		System.out.println(blackFerrari);
		Car trabant = carFactory.makeTrabant();
		System.out.println(trabant);
		// toString.maluch;
		Tires tires = new Tires();
		tires.random();
		Random generator = new Random();
		double number = 1 + generator.nextDouble() * 0.1;
		System.out.println(number);
		
		System.out.println(tires);
		System.out.println("\n" + "\n");
		trabant.drive(80);
		maluch.drive(150);
		trabant.getWearedOff();
		maluch.getWearedOff();
		SportsCar sportsCar = new SportsCar();
		sportsCar.burningTires();
//		sportsCar.
				System.out.println(tires.tireWearOff);
		System.out.println(tires.tireWearOff[1]);
		System.out.println(sportsCar);
		
	}

}
