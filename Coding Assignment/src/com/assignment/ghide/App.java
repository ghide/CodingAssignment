
package com.assignment.ghide;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger asterisk = new AsteriskLogger();
		asterisk.log("Hello");
		asterisk.error("Hello");
		
		SpacedLogger spaced  = new SpacedLogger();
		spaced.log("Hello");
		spaced.error("Hello");
		

	}

}
