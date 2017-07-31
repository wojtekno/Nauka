
public class Main {

	public static void main(String[] args) {

		 int someNumber = 8;
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
		//
		Car maluch = new Car();
		maluch.printSpec();
		maluch.color = "yellow";
		maluch.printSpec();
		System.out.println(maluch.color);
		//po kropce jest czyms innym
		maluch.color.concat("asd").contains(maluch.color);
		System.out.println(maluch);
		//nie mozna bo private
//		maluch.fuel = 100;
		System.out.println(maluch.getFuel());
		maluch.setMaxCappacityOfTank(155);
		maluch.printSpec();
	}

}
