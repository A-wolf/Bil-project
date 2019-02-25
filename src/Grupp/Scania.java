package Grupp;
import javafx.scene.paint.Color;
	
	
	public class Scania extends Car {
		private int flakDegresOpen = 0;
		private boolean flakOpen = false;
	//Description of the Scania	

	public Scania() {
		color = Color.BLUE;
		enginePower = 700;
		modelName = "Scania";
		stopEngine();
	}
	// Unique speed modifier for Scania 
	
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
}