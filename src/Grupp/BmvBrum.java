package Grupp;
import javafx.scene.paint.Color;

	public class BmvBrum extends Car {
	private final static double trimFactor = 2.5;

	//Description of the Volvo740	

	public BmvBrum() {
		color = Color.RED;
		enginePower = 200;
		modelName = "BmvBrum";
		stopEngine();
	}
	// Unique speed modifier for Volvo740 
	
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}

	





}