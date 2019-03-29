package Grupp;

import javafx.scene.paint.Color;

/**
 * @author Bosses00 and MercuryBarium
 *
 */
public abstract class Vehicle implements Movable {
	public boolean turboOn = false;
	public double enginePower; // Engine power of the vehicle
	public double currentSpeed; // The current speed of the vehicle
	public Color color; // Color of the vehicle
	public String modelName; // The vehicle model name
	public double x = 0;
	public double y = 0;
	public double dir = 0;
	public double weight;

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

	/**
	 * @return The unique Speed factor of a car
	 */
	public abstract double speedFactor();

	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}
	
	public void gas(double amount) {
		
		if(amount < 0 || amount > 1){
			return;
		}
		else{
		incrementSpeed(amount);
		}
	}

	public void brake(double amount) {
		if(amount < 0 || amount > 1){
			return;
		}
		else{
		decrementSpeed(amount);
		}
	}

	public void move() {
		x += getCurrentSpeed() * Math.cos(dir);
		y += getCurrentSpeed() * Math.sin(dir);
	}

	public void turnLeft() {
		dir += Math.PI / 4;
	}

	public void turnRight() {
		dir -= Math.PI / 4;
	}
	

}