package Grupp;
import java.util.ArrayList;

import javafx.scene.paint.Color;

	

public class bigBoi extends Car {
	private static final Car Scania = null;
	private int flakDegresOpen = 0;
	public boolean flakOpen = false;
	ArrayList<Car> load=new ArrayList<Car>();
	
//Description of the bigBoi	

public bigBoi() {
	color = Color.BLUE;
	enginePower = 700;
	modelName = "Scania";
	stopEngine();
}
// speed modifier for bigBoi 

public double speedFactor() {
	return enginePower * 0.01;
}

public void flakOpen(){
	if (currentSpeed > 0){
		return;
	}else{
	for(flakDegresOpen = 0; flakDegresOpen <= 70; flakDegresOpen++){
		if(flakDegresOpen == 70){
			flakOpen = true;
		}
		}
	
	}
	
}
public void flakClose(){
	for(flakDegresOpen = 0; flakDegresOpen >= 0; flakDegresOpen--){
		if(flakDegresOpen == 0){
			flakOpen = false;
		}
}
}
	
	
	public void lastSkit(Car c){
		if(flakOpen = true){
			if(load.size() < 5 && c.weight < 3){
					load.add(c);
				
			} else {
				System.out.println("Vehicle is either too heavy or load is full!");
			}
		}
	}
	public void lastAv(){
		if(flakOpen = false){
			flakOpen();
		}
		for(int i = load.size() - 1; i >= 0; i--) {
			System.out.println("Unloading " + load.get(i).modelName);
			load.remove(i);
		}
	}
	
	
	
	public void gas(double amount) {
		if(flakOpen = false){
		super.gas(amount);
	}
	}

	

}