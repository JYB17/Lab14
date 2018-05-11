package edu.handong.csee.java.lab14.prob6;

import java.util.Scanner;							// import package 'java.util.Scanner'

public class Prob6Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name, race;										// declare variables 'name', 'race'
		int age=0;										// declare variable 'age' and initiate to 0
		Scanner keyboard = new Scanner(System.in);				// create object of 'Scanner' class, 'keyboard'
		CustomID obj = new CustomID();							// create object of 'CustomID' class, 'obj'
		
		while(true) {											// while true, repeat
			try {												// try the followings
				if(obj.getState() == 0) {							// if 'obj.getState' is 0,
					System.out.print("Enter your name: ");			// print message to get input
					name = keyboard.nextLine();						// get input 'name' from user
					obj.setName(name);									// call method 'setName' from 'obj'
				}
				else if(obj.getState() == 1) {					// if 'obj.getState' is 1,
					System.out.print("Enter your age: ");			// print message to get input
					age = keyboard.nextInt();						// get input 'age' from user
					keyboard.nextLine();						// remove buffer
					obj.setAge(age);							// call method 'setAge' from 'obj'
				}
				else if(obj.getState() == 2) {					// if 'obj.getState' is 2,
					System.out.print("Enter your race: ");			// print message to get input
					race = keyboard.nextLine();							// get input 'race' from user
					obj.setRace(race);								// call method 'setRace' from 'obj'
				}
			}
			catch(Exception e) {								// if 'Exception e' occurs, 
				System.out.println(e.getMessage());					// print the message, the value of 'e.getMessage'
				continue;											// continue
			}
		}
	}

}
