package edu.handong.csee.java.lab14.prob1;

public class SpeedLimitter {
	private int speed = 0;									// declare instance private variable 'speed' and initiate to 0 
	private int limit = 0;									// declare instance private variable 'limit' and initiate to 0
	
	public SpeedLimitter(int limit, int speed) {
		this.limit = limit;								// update instance 'limit' to parameter 'limit'
		this.speed = speed;								// update instance 'speed' to parameter 'speed'
	}
	
	public void warnSpeedLimit() {
		try {																			// try the followings
			if(this.speed > this.limit) {
				throw new Exception("Speed Limit " + this.limit + "km exceeded!");		// if 'speed' is higher than 'limit', create object of 'Exception' class, with parameter ""Speed Limit " + this.limit + "km exceeded!""
			}
			System.out.println("You are a law abiding citizen!");					// print out the message
		}catch(Exception e) {												// if, Exception e occurs, do the following
				System.out.println(e.getMessage());					
				System.out.println("You are being fined. ");			// print the result
			}
		System.out.println("Your current speed: " + this.speed);		// print the current speed
	}
}
