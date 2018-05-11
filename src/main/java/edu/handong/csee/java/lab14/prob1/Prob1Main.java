package edu.handong.csee.java.lab14.prob1;

import java.util.Scanner;										// import package 'java.util.Scanner'
import java.util.Random;										// import package 'java.util.Random'

public class Prob1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);						// create an object of 'Scanner' class, 'keyboard'
		Random rand = new Random();										// create an object of 'Random' class, 'rand'
		
		int limit = 0;												
		int speed = 0;													// declare variables and initiate to 0
		
		System.out.print("Set the speed limit, officer: ");					// print message to get input 
		limit = keyboard.nextInt();										// get input 'limit' from user
		speed = rand.nextInt(101);											// set 'speed'to random number
		
		SpeedLimitter lim = new SpeedLimitter(limit, speed);			// create an object of 'SpeedLimitter' class, 'lim'
		
		lim.warnSpeedLimit();										// call method 'warnSpeedLimit' from 'lim'
		
		keyboard.close();											// call method 'close' from 'keyboard'
		
	}

}
