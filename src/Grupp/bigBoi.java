package Grupp;
import java.util.ArrayList;

import javafx.scene.paint.Color;

	

public class bigBoi extends Car {
	public double weight = 16;
	private Flatbed flatbed;
	ArrayList<Car> load=new ArrayList<Car>();
	
//Description of the bigBoi	

public bigBoi() {
	color = Color.BLUE;
	enginePower = 1400;
	modelName = "bigBoi";
	stopEngine();
	flatbed = new Flatbed();
}
// speed modifier for bigBoi 

public double speedFactor() {
	
	return enginePower * 0.01;
}


	
	
	public void lastSkit(Car c){
		if(flatbed.isOpen()){
			if(load.size() < 5 && c.weight < 3){
					load.add(c);
				
			} else {
				System.out.println("Vehicle is either too heavy or load is full!");
			}
		}
	}
	public void lastAv(){
		if(!flatbed.isOpen()){
			flatbed.flakOpen();
		}
		for(int i = load.size() - 1; i >= 0; i--) {
			System.out.println("Unloading " + load.get(i).modelName);
			load.remove(i);
		}
	}
	
	
	
	public void gas(double amount) {
		if(!flatbed.isOpen()){
		super.gas(amount);
	}
	}

	

}