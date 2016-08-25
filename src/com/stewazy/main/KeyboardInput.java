package com.stewazy.main;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class for keyboard input
 * * @author Stevan Mihajlov
 *
 */
public class KeyboardInput {

	/**
	 * Variables used
	 * number type double - stores a number from console input
	 * letter type char - stores a char from console input
	 * input type boolean used to check for errors
	 * keyboard - class Scanner for console input
	 */
	private double number;
	private char letter;
	private boolean input;
	Scanner keyboard = new Scanner(System.in);

	/**
	 * Default constructor
	 */
	KeyboardInput(){		
	}

	/**
	 * Method for getting a char from console input
	 * @return - returns a character 
	 */
	public char getChar(){
		input = true;
		while(input){
			try{
				letter=keyboard.next(".").charAt(0);
				input = false;
			}
			catch(InputMismatchException exception){
				System.out.println("Please insert a number");
				keyboard.next();
			}
		}
		return letter;
	}

	/**
	 * Method for getting a double value from console input
	 * @return - returns a double type
	 */
	public double getDouble() {
		input = true;
		while(input){
			try{
				number=keyboard.nextDouble();
				input = false;
			}
			catch(InputMismatchException exception){
				System.out.println("Please insert a number");
				keyboard.next();
			}
		}
		return number;
	}

}
