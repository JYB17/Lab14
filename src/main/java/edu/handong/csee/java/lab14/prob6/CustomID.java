package edu.handong.csee.java.lab14.prob6;

public class CustomID extends Exception {
	private String[] races = new String[] {"Vulcans", "Romulan", "Klingons"};		// declare instance array variable 'races' and initiate to "Vulcans", "Romulan", "Klingons"
	private String name = "";								// declare instance variable 'name' and initiate to ""
	private int age=0;									// declare instance variable 'age' and initiate to 0
	private String race = "";						// declare instance variable 'race' and initiate to ""
	private int state=0;								// declare instance variable 'state' and initiate to 0
	
	public void setName(String str) throws Exception{
		if(str.length()<5) {													// if 'str.length' is less than 5,
			state=0;													// update 'state' to 0 
			throw new Exception("Your name is short! Try again!");				// create object of 'Exception' class, with parameter "Your name is short! Try again!"
		}
		else {															// else, do
			this.name = str;										// update instance variable 'name' to parameter 'str'
			System.out.println("Name is valid");					
			System.out.println("Name: " + this.name);						// print the messages
			state++;												// increment 'state'
		}
	}
	
	public void setAge(int num) throws Exception{
		if(num<18) {																// if 'num' is less than 18,
			state = 1;														// update 'state' to 1
			throw new Exception("You are too young! Try again!");				// create object of 'Exception' class, with parameter "You are too young! Try again!"
		}
		else {										// else, do
			this.age = num;												// update instance variable 'age' to parameter 'num'
			System.out.println("Age is valid");							
			System.out.println("Age: " + this.age);										// print the messages
			state++;											// increment 'state'
		}
	}
	
	public void setRace(String race) throws Exception{
		for(int i=0; i<races.length; i++) {						// repeat from i=0 till i<races.length, incrementing i
			if(races[i].equals(race)) {								// if 'races[i]' equals 'race',
				this.race = races[i];								// update instance variable 'race' to 'races[i]' 
				System.out.println("Race is valid");	
				System.out.println("Race: " + races[i]);			// print the messages
				state = 0;									// update 'state' to 0
				return;									// return
			}
		}
		state = 2;											// update 'state' to 2
		throw new Exception("Human! Try again!");					// create object of 'Exception' class, with parameter "Human! Try again!"
	}
	
	public int getState() {						
		return state;					// return value of 'state'
	}
}
