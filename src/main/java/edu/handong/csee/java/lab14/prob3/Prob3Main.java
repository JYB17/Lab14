package edu.handong.csee.java.lab14.prob3;

import java.util.Scanner;

public class Prob3Main {
	public static final Powercalc myCalculator = new Powercalc();			// create object of 'PowerCalc' class, 'myCalculator'
	
	public static final Scanner in = new Scanner(System.in);			// create object of 'Scanner' class, 'in'
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(in.hasNextInt()) {								// while 'in.hasNextInt()' is true, repeat
			int n = in.nextInt();					// declare 'n' and get input from user
			int p = in.nextInt();				// declare 'p' and get input from user
			
			try {													// try the followings
				System.out.println(myCalculator.power(n, p));			// print the message
			}catch(Exception e) {								// if 'Exception e' occurs,
				System.out.println(e);			// print out 'e'
			}
		}
	}

}
