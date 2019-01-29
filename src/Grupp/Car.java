package Grupp;

import javafx.scene.paint.Color;

public abstract class Car implements Movable{
	public boolean turboOn = false;
	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name
	public double x = 0;
	public double y = 0;
	public double dir = 0;
	
public double getEnginePower() {
	return enginePower;
}

public double getCurrentSpeed() {
	return currentSpeed;
}
public Color getColor() {
	return color;
}
public void startEngine() {
	currentSpeed = 0.1;
}

public void stopEngine() {
	currentSpeed = 0;
}

public abstract double speedFactor(); 


private void incrementSpeed(double amount) {
	currentSpeed = getCurrentSpeed() + speedFactor() * amount;
}

private void decrementSpeed(double amount) {
	currentSpeed = getCurrentSpeed() - speedFactor() * amount;
}

public void gas(double amount) {
	incrementSpeed(amount);
}

public void brake(double amount) {
	decrementSpeed(amount);
}
public void move(){
	x += currentSpeed;
	
}

public void turnLeft(){
dir++;	
}
public void turnRight(){
dir--;}
}