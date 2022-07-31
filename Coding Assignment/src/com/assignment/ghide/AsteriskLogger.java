
package com.assignment.ghide;

public class AsteriskLogger implements Logger{

	public void log(String log) {
		
		System.out.println("Hello");
		
	}
	public void error(String error) {
		
		System.out.println("***ERROR: " + error +"***");
		
		
	}

}
