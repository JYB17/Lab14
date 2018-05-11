package edu.handong.csee.java.lab14.prob4;

import java.util.Scanner;								// import package 'java.util.Scanner'

public class Prob4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);					// create object of 'Scanner' class, 'keyboard'
		
		int num=0;											// declare variable 'num' and initiate to 0
		Boundary arr = new Boundary();					// create object of 'Boundary' class, 'arr'
		boolean repeat = true;								// declare boolean variable 'repeat' and initiate to 'true'
		
		while(repeat) {											// repeat while repeat is true
			try {												// try the followings
				System.out.print("Enter an integer: ");					// print message to get input
				num = keyboard.nextInt();						// get input 'num' from user
				
				arr.receive(num);								// call method 'receive' of 'arr'
			}
			catch(ArrayIndexOutOfBoundsException e) {					// if 'ArrayIndexOutOfBoundsException e' occurs, do the following
				System.out.println("Invalid array index access!");			// print the error message
				repeat = false;										// update 'repeat' to 'false'
			}
		}
	}

}
