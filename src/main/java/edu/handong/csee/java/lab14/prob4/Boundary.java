package edu.handong.csee.java.lab14.prob4;

public class Boundary {
	private static int [] arr = new int[5];						// declare instance array variable 'arr' with size 5 
	private static int cnt = 0;								// declare instance variable 'cnt' and initiate to 0
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException{
		int i = cnt;															// declare variable 'i' and initiate to 0
		arr[i] = num;													// update arr[i] to parameter 'num'
		cnt++;												// increment 'cnt'
		System.out.printf("arr[%d] <- %d \n", i, num);			// print the result
		
	}
}
