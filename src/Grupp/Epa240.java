package Grupp;
import javafx.scene.paint.Color;

public class Epa240 extends Car {
	public double weight = 1.3;

	//Description of the Epa240

	public Epa240() {
		color = Color.BROWN;
		enginePower = 25;
		setTurboOn();
		modelName = "Epa240";
		stopEngine();
	}
	// Unique speed modifier for Epa240
	
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