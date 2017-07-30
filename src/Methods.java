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
		return number*number;
	}

	
	//ulepszyc zeby mozna bylo wybrac ilosc kolumn i bokow
	void arrayFiveXFive() {
		int i;
		int j;
		int [][] fiveXFive = new int[5][5];
		for (i=0; i<5; i++) {
			for (j=0; j<5; j++) {
				fiveXFive[i][j] = j+1;
				System.out.print((i+1)+","+fiveXFive[i][j]+" ");
			}
			System.out.println();
			
		}
	} 
	void print5x5x5 () {
		for(int i=1;i<6;i++) {
			for (int j=1;j<6;j++) {
				for (int k=1;k<6;k++) {
					System.out.print(i+","+j+","+k+" ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
	}
	
	double mean (int one, int two, int three) {
		return (one+two+three)/3;
	}
}
