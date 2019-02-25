package Grupp;
import javafx.scene.paint.Color;

	public class Scania extends Car {


	//Description of the Scania	

	public Scania() {
		color = Color.BLUE;
		enginePower = 100;
		modelName = "Volvo740";
		stopEngine();
	}
	// Unique speed modifier for Scania 
	
	public double speedFactor() {
		return enginePower * 0.01;
	}

	





}