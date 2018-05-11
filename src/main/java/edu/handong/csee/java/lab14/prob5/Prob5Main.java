package edu.handong.csee.java.lab14.prob5;

import java.util.Scanner;									// import package 'java.util.Scanner'
public class Prob5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {															// try the followings
			Scanner keyboard = new Scanner(System.in);					// create object of 'Scanner' class, 'keyboard'
			String str = keyboard.nextLine();										// get input 'str' from user
			
			Prob5Main.myTest(str);									// call method 'myTest' of 'Prob5Main'
		}catch(MyException mae) {										// if 'MyException mae' occurs,
			System.out.println("Inside catch block: " + mae);				// print the message
		}
		
	}
	
	static void myTest(String str) throws MyException{					// method 'myTest'
		if(str.equals("null")) {
			throw new MyException("String val is null");			// if 'str.eqauls' is null, create object of 'Exception' class, with parameter "String val is null"
		}
		else {
			System.out.println("String val is " + str);			// else, print the message
		}
	}

}
