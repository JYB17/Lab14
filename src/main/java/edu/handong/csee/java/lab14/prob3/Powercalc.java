package edu.handong.csee.java.lab14.prob3;

public class Powercalc {
	public long power(int n, int p) throws Exception{
		long result = 0;									// declare variable and initiate to 0
		
		result = (long)Math.pow(n,  p);						// update variable 'result' using 'Math.pow' with parameter 'n', 'p'
		
		if(n<0 || p<0) {												// if 'n' or 'p' is more than 0, 
			throw new Exception("n or p should not be negative.");		// create object of 'Exception' class, with parameter "n or p should not be negative."
		}
		
		if(n==0 && p==0) {											// if both 'n' and 'p' is 0,
			throw new Exception("n and p should not be zero.");			// create object of 'Exception' class, with parameter "n and p should not be zero."
		}
		
		return result;						// return the value of result
		
	}
}
