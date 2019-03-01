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
	 * A description of the aspects of an Saab95
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
		 * @see Grupp.Saab95#setTurboOn()
		 * Turns the speed modifier turbo on 
		 * 
		 *@see Grupp.Saab95#setTurboOff()
		 * Turns the speed modifier turbo off 
		 * 
		 * 
		 */
		private void setTurboOn() {
			turboOn = true;
		}

		private void setTurboOff() {
			turboOn = false;
		}

	

	
}