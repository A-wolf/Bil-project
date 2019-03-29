package Grupp;
import javafx.scene.paint.Color;
/**
	 * @author Bosses00 and MercuryBarium
	 *
	 */
public class Epa240 extends Vehicle {
	public double weight = 1.3;
	/**
	 * @see Grupp.Epa240#Epa240
	 * A description of the aspects of a Saab95
	 * 
	 */
	public Epa240() {
		color = Color.BROWN;
		enginePower = 25;
		setTurboOn();
		modelName = "Epa240";
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
	 * @see Grupp.Vehicle#setTurboOn()
	 * Turns the speed modifier turbo on 
	 * 
	 */	
		private void setTurboOn() {
			turboOn = true;
		}
		/**
		 * 
		 * @see Grupp.Vehicle#setTurboOn()
		 * Turns the speed modifier turbo on 
		 * 
		 */	
		private void setTurboOff() {
			turboOn = false;
		}

	

	
}