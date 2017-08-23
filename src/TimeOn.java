
public class TimeOn {
	OnBoardComputer time;
	int h;
	int min;
	
	TimeOn(OnBoardComputer time) {
		//this.time = time;
		h = time.h;
		min = time.min;
	}
	
	public String toString() {
		return h + ":" + min;
	}
}
