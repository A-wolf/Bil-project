package Grupp;

import javafx.scene.paint.Color;

public class Scania extends Car {
	public double weight = 8;
	// Description of the Scania
	private Flatbed flatbed;

	public Scania() {
		color = Color.BLUE;
		enginePower = 700;
		modelName = "Scania";
		stopEngine();
		flatbed = new Flatbed();
	}
	// Unique speed modifier for Scania

	public double speedFactor() {
		return enginePower * 0.01;
	}

	public void gas(double amount) {
		if (!flatbed.isOpen()) {
			super.gas(amount);
		}
	}

	public void openFlatbed() {
		if (getCurrentSpeed() == 0) {
			flatbed.flakOpen();
		}
	}
	public void closeFlatbed() {
		if (getCurrentSpeed() == 0) {
			flatbed.flakClose();
		}
	}
}