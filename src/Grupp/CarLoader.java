package Grupp;

import java.util.ArrayList;

public class CarLoader {
	ArrayList<Vehicle> load=new ArrayList<Vehicle>();
	
	public void lastSkit(Vehicle c){
			if(load.size() < 5 && c.weight < 3){
					load.add(c);
			}
	}
	public void lastAv(){
			load.remove(load.size() - 1);
	}
	
	public void LastAvFörst(){
		load.remove(0);
	}
	
	
	
	
}