
public class Engine {

	private int cylinders;
	private double capacityOfEngine;
	private String typeOfGas;
	
	Engine() {
		cylinders = 4;
		capacityOfEngine = 3.7;
		typeOfGas = "ON";
	}
	
	public String getTypeOfGas() {
		return typeOfGas;
	}

	public void setTypeOfGas(String typeOfGas) {
		this.typeOfGas = typeOfGas;
	}

	void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public int getCylinders() {
		return cylinders;
	}
}
//
// overloading toString
//stworz klase komputer pokladowy, ktory ma metode - olac to
//tablica kol samochodu, ich parametr - ile jeszcze przezyja w %?
//metoda drive w car ktora przyjmuje odleglosc do przejechania, przelicznik paliwa, czy przejedziesz, ile spaliles
//zcierasz opone (randomowe liczby) o wspolczynnik randowmowy, klase kola tablica klasy kol, 