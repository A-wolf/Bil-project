package Grupp;

import javafx.scene.paint.Color;

/**
 * @author Bosses00 and MercuryBarium
 *
 */
public abstract class Car implements Movable {
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