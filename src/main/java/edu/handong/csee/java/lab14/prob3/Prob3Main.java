package edu.handong.csee.java.lab14.prob3;

import java.util.Scanner;

public class Prob3Main {
	public static final Powercalc myCalculator = new Powercalc();
	
	public static final Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			
			try {
				System.out.println(myCalculator.power(n, p));
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
