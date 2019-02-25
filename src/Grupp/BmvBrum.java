package Grupp;
import javafx.scene.paint.Color;

	public class BmvBrum extends Car {
	private final static double trimFactor = 2.5;

	//Description of the BmvBrum	

	public BmvBrum() {
		color = Color.RED;
		enginePower = 200;
		modelName = "BmvBrum";
		stopEngine();
	}
	// Unique speed modifier for BmvBrum 
	
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}

	





}