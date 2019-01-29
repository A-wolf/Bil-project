package Grupp;
import javafx.scene.paint.Color;

public class Saab95 extends Car {

	//Description of the Saab95

	public Saab95() {
		color = Color.BLACK;
		enginePower = 125;
		setTurboOn();
		modelName = "Saab95";
		stopEngine();
	}
	// Unique speed modifier for Saab95 
	
	public double speedFactor() {
		double turbo = 1;
		if (turboOn = true){
			turbo = 1.3;
		return enginePower * 0.01 * turbo;
		}else{
			return enginePower*0.01;
		}
		
	}

		private void setTurboOn() {
			turboOn = true;
		}

		private void setTurboOff() {
			turboOn = false;
		}

	

	
}