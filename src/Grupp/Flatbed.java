package Grupp;

public class Flatbed {

	private int flakDegresOpen = 0;
	public boolean flakOpen = false;

	public void flakOpen() {

		for (flakDegresOpen = 0; flakDegresOpen <= 70; flakDegresOpen++) {
			if (flakDegresOpen == 70) {
				flakOpen = true;
			}
		}

	}

	public void flakClose() {
		for (flakDegresOpen = 0; flakDegresOpen >= 0; flakDegresOpen--) {
			if (flakDegresOpen == 0) {
				flakOpen = false;
			}
		}
	}

	public boolean isOpen(){
		return flakOpen;
	}
}