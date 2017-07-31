import java.util.List;

public class Methods {

	void firstMethod() {
		System.out.println("Hurra, moja pierwsza metoda");
	}

	void addTwoMore(int twoMore) {
		twoMore += 2;
		System.out.println(twoMore);
	}

	int square(int number) {
		firstMethod();
		return number * number;
	}

	// ulepszyc zeby mozna bylo wybrac ilosc kolumn i bokow
	void arrayFiveXFive() {
		int i;
		int j;
		String[][] fiveXFive = new String[5][5];
		// fiveXFive[0] = new String[7]
		for (i = 0; i < fiveXFive.length; i++) {
			for (j = 0; j < fiveXFive[0].length; j++) {
				fiveXFive[i][j] = (i + 1) + "," + (j + 1);
				System.out.print(fiveXFive[i][j] + " ");
			}
			System.out.println();

		}
	}

	void print5x5x5() {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				for (int k = 1; k < 6; k++) {
					System.out.print(i + "," + j + "," + k + " ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}

	double mean(int one, int two, int three) {
		return (double) (one + two + three) / 3;
	}

	int charToInt(char letter) {
		return (int) letter;
	}
	
	void fooBar () {
//		for (int i = 1; i<=100; i++) {
//			if (i % 3 == 0) {
//				System.out.print("Foo");
//			} 
//			if (i % 5 == 0) {
//				System.out.print("Bar");
//			}
//			if (i % 3 != 0 && i % 5 != 0)  {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		int i = 1;
		while (i <=100) {
			if (i % 3 == 0) {
				System.out.print("Foo");
			} 
			if (i % 5 == 0) {
				System.out.print("Bar");
			}
			if (i % 3 != 0 && i % 5 != 0)  {
				System.out.print(i);
			}
			System.out.println();
			i++;
		}
	}
}
