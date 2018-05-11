package edu.handong.csee.java.lab14.prob1;

import java.util.Scanner;
import java.util.Random;

public class Prob1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		int limit = 0;
		int speed = 0;
		
		System.out.print("Set the speed limit, officer: ");
		limit = keyboard.nextInt();
		speed = rand.nextInt(101);
		
		SpeedLimitter lim = new SpeedLimitter(limit, speed);
		
		lim.warnSpeedLimit();
		
		keyboard.close();
		
	}

}
