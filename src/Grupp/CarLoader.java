package Grupp;

import java.util.ArrayList;

public class CarLoader {
	ArrayList<Car> load=new ArrayList<Car>();
	
	public void lastSkit(Car c){
			if(load.size() < 5 && c.weight < 3){
					load.add(c);
			} 
	}
	public void lastAv(){
		for(int i = load.size() - 1; i >= 0; i--) {
			System.out.println("Unloading " + load.get(i).modelName);
			load.remove(i);
		}
	}
	
	
	
	
	
	
}