package Grupp;
import java.util.ArrayList;

import javafx.scene.paint.Color;

	

public class bigBoi extends Car {
	public double weight = 16;
	private Flatbed flatbed;
	private CarLoader carLoader;
	ArrayList<Car> load=new ArrayList<Car>();
	
//Description of the bigBoi	

public bigBoi() {
	color = Color.BLUE;
	enginePower = 1400;
	modelName = "bigBoi";
	stopEngine();
	flatbed = new Flatbed();
	carLoader = new CarLoader();
	
}
// speed modifier for bigBoi 

public double speedFactor() {
	
	return enginePower * 0.01;
}
public void lastSkit(Car c) {
	if (flatbed.isOpen()) {
		carLoader.lastSkit(c);
	}
}

	
	
	
	public void lastAv(){
		if(!flatbed.isOpen()){
			flatbed.flakOpen();
			carLoader.lastAv();
		}
	}
	
	
	
	public void gas(double amount) {
		if(!flatbed.isOpen()){
		super.gas(amount);
	}
	}

	

}