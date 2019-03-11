package Grupp;
import javafx.scene.paint.Color;

	/**
	 * @author Bosses00 and MercuryBarium
	 *
	 */
	public class BmvBrum extends Car {
	private final static double trimFactor = 2.5;
	public double weight = 1.4;

	/**
	 * @see Grupp.BmvBrum#BmvBrum
	 * A description of the aspects of an BmvBrum
	 * 
	 */
	public BmvBrum() {
		color = Color.RED;
		enginePower = 200;
		modelName = "BmvBrum";
		stopEngine();
		
	}
	// Unique speed modifier for BmvBrum 
	
	/* 
	 * @see Grupp.Car#speedFactor()
	 */
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}

	





}