package Grupp;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class b�tFan extends Vehicle {
	public double weight = 100;
	private Flatbed flatbed;
	private CarLoader carLoader;
	ArrayList<Vehicle> load=new ArrayList<Vehicle>();
	
//Description of the b�tFan	

public b�tFan() {
	color = Color.BLUE;
	enginePower = 10000;
	modelName = "F�rja";
	stopEngine();
	carLoader = new CarLoader();
	
}
// speed modifier for b�tFan 

public double speedFactor() {
	
	return enginePower * 0.01;
}
public void lastSkit(Vehicle c) {
		carLoader.lastSkit(c);
}

	
	
	
	public void lastAvF�rst(){
			carLoader.LastAvF�rst();	
	}
	
	
	
	public void gas(double amount) {
		super.gas(amount);
	}

	

}