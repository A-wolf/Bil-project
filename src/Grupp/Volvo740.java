package Grupp;
import javafx.scene.paint.Color;

	/**
	 * @author Bosses00 and MercuryBarium
	 *
	 */
	public class Volvo740 extends Vehicle {
	private final static double trimFactor = 1.25;
	public double weight = 1;

	/**
	 * @see Grupp.Volvo740#Volvo740
	 * A description of the aspects of a Volvo740
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