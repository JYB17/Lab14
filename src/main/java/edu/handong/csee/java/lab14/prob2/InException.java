package edu.handong.csee.java.lab14.prob2;

import java.util.*;									// import package 'java.util.*'

public class InException {
	private int x=0, y=0;						// declare instance private variables and initiate to 0
	
	public InException() {
											// empty constructor
	}
	
	public void ErrorDet() {
		try {														// try the followings for any exception
			Scanner keyboard = new Scanner(System.in);			// create an object of 'Scanner' class, 'keyboard'
			
			System.out.print("x: ");						// print message to get input
			x = keyboard.nextInt();							// get input 'x' from user
			
			System.out.print("y: ");						// print message to get input
			y = keyboard.nextInt();									// get input 'y' from user
			
			System.out.println(this.x/this.y);					// print the result of 'x/y'
		}catch(ArithmeticException e) {														
			System.out.println("java.lan.ArithmeticException: " + e.getMessage());			// if 'ArithmeticException e' occurs, print the message
		}catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");					// if 'InputMismatchException e' occurs, print the message
		}catch(Exception e) {
			System.out.println("Some other exception has occurred: " + e.getMessage());		// if 'Exception e' occurs, print the message
		}
	}
}
