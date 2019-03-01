package Grupp;
import javafx.scene.paint.Color;

	/**
	 * @author Bosses00 and MercuryBarium
	 *
	 */
	public class Volvo740 extends Car {
	private final static double trimFactor = 1.25;	

	/**
	 * 
	 * A description of the aspects of an Volvo740
	 * 
	 */
	public Volvo740() {
		color = Color.RED;
		enginePower = 100;
		modelName = "Volvo740";
		stopEngine();
	}

	
	/*
	 * @see Grupp.Car#speedFactor()
	 */
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}

	





}