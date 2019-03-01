package Grupp;
import javafx.scene.paint.Color;


public class bigBoi extends Car {
	private int flakDegresOpen = 0;
	public boolean flakOpen = false;
	private String[] Load = new String[5];  
//Description of the bigBoi	

public bigBoi() {
	color = Color.BLUE;
	enginePower = 700;
	modelName = "Scania";
	stopEngine();
}
// Unique speed modifier for bigBoi 

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
	
	
	public void lastSkit(){
		if(flakOpen = true){
		Load[0] += "car";
		
		}
	}
	public void gas(double amount) {
		if(flakOpen = false){
		super.gas(amount);
	}
	}



}