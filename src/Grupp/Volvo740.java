package Grupp;
import javafx.scene.paint.Color;

	public class Volvo740 extends Car {
	private final static double trimFactor = 1.25;

	//Description of the Volvo740	

	public Volvo740() {
		color = Color.RED;
		enginePower = 100;
		modelName = "Volvo740";
		stopEngine();
	}
	// Unique speed modifier for Volvo740 
	
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}

	





}