package Grupp;
import javafx.scene.paint.Color;
	/**
	 * 
	 * @author Bosses00 and MercuryBarium
	 *
	 */
public class Scania extends Car {
	public double weight = 8;
	private Flatbed flatbed;

	/**
	 * @see Grupp.Scania#Scania
	 * A description of the aspects of a Saab95
	 * 
	 */

	public Scania() {
		color = Color.BLUE;
		enginePower = 700;
		modelName = "Scania";
		stopEngine();
		flatbed = new Flatbed();
	}
	/* 
	 * @see Grupp.Car#speedFactor()
	 */
	public double speedFactor() {
		return enginePower * 0.01;
	}

	/* 
	 * @see Grupp.Car#gas(double)
	 */
	public void gas(double amount) {
		if (!flatbed.isOpen()) {
			super.gas(amount);
		}
	}

	/**
	 * @see Grupp.Flatbed#flakOpen()
	 */
	public void openFlatbed() {
		if (getCurrentSpeed() == 0) {
			flatbed.flakOpen();
		}
	}
	/**
	 * @see Grupp.Flatbed#flakClose()
	 */
	public void closeFlatbed() {
		if (getCurrentSpeed() == 0) {
			flatbed.flakClose();
		}
	}
}