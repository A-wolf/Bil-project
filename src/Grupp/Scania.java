package Grupp;
import javafx.scene.paint.Color;
	
	
	public class Scania extends Car {
		private boolean flakOpen = false;

	//Description of the Scania	

	public Scania() {
		color = Color.BLUE;
		enginePower = 700;
		modelName = "Scania";
		stopEngine();
	}
	// Unique speed modifier for Scania 
	
	public double speedFactor() {
		return enginePower * 0.01;
	}

	public void flakOpen(){
		flakOpen = true;
	}
	public void flakClose(){
		flakOpen = false;
	}





}