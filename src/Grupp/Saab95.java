package Grupp;
import javafx.scene.paint.Color;
/**
 * 
 * @author Bosses00 and MercuryBarium
 *
 */
public class Saab95 extends Car {
	/**
	 * @see Grupp.Car#Saab95
	 * A description of the aspects of a Saab95
	 * 
	 */
	public Saab95() {
		color = Color.BLACK;
		enginePower = 125;
		setTurboOn();
		modelName = "Saab95";
		stopEngine();
	}

	/* 
	 * @see Grupp.Car#speedFactor()
	 */
	public double speedFactor() {
		double turbo = 1;
		if (turboOn = true){
			turbo = 1.3;
		return enginePower * 0.01 * turbo;
		}else{
			return enginePower*0.01;
		}
		
	}

		/**
		 * 
		 * @see Grupp.Car#setTurboOn()
		 * Turns the speed modifier turbo on 
		 * 
		 */	
		private void setTurboOn() {
			turboOn = true;
		}

		/**
		 * 
		 *@see Grupp.Car#setTurboOff()
		 * Turns the speed modifier turbo off 
		 * 
		 */
		private void setTurboOff() {
			turboOn = false;
		}

	

	
}