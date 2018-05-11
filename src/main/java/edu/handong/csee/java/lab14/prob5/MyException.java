package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception {
	private String message = null;					// declare instance variable 'message' and initiate to null
	
	public MyException() {		
		super();												// call constructor of superclass with no parameter
	}
	
	public MyException(String message) {
		super(message);											// call constructor of superclass with parameter 'message'
		this.message = message;								// update instance variable 'message' to parameter 'message'
	}
	
	public MyException(Throwable cause) {
		super(cause);										// call constructor of superclass with parameter 'cause'
	}
	
	public String toString() {
		return message;									// return value of message
	}
}
