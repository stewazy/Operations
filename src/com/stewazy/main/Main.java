package com.stewazy.main;


/**
 * RED MINE --Dobijanje zadataka, code repo, Jenkins --continuous integration. (Jedna masina) 8082 port
 * broker na bazu? 
 * ne radimo mi na bazi
 * @author Stevan Mihajlov
 *
 */

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double firstNumber = 1;
		double secondNumber = 0;
		char op = ' ';
		KeyboardInput keyboardLine = new KeyboardInput(System.in);
		/*Input first number*/
		System.out.println("Welcome to program Operations:");
		System.out.println("The first number?\n");
		firstNumber=keyboardLine.getDouble();
		/*Input second number*/
		System.out.println("The second number?\n");
		secondNumber=keyboardLine.getDouble();
		/*Input operation*/
		System.out.println("Operation?\n");
		op=keyboardLine.getChar();
		/*Create object from class operation and calculate the result based on the users input*/
		Operation A= new Operation(firstNumber,secondNumber,op);
		A.calculate();
		System.out.println("Operation result: " + A.getResult());

	}

}
