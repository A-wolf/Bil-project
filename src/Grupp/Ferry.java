package Grupp;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Ferry extends Vehicle {
	public double weight = 100;
	private Flatbed flatbed;
	private CarLoader carLoader;
	ArrayList<Vehicle> load=new ArrayList<Vehicle>();
	
//Description of the båtFan	

public Ferry() {
	color = Color.BLUE;
	enginePower = 10000;
	modelName = "Färja";
	stopEngine();
	carLoader = new CarLoader();
	
}
// speed modifier for båtFan 

public double speedFactor() {
	
	return enginePower * 0.01;
}
public void lastSkit(Vehicle c) {
		carLoader.lastSkit(c);
}

	
	
	
	public void lastAvFörst(){
			carLoader.LastAvFörst();	
	}
	
	
	
	public void gas(double amount) {
		super.gas(amount);
	}

	

}