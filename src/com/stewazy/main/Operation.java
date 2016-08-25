package com.stewazy.main;

/**
 * Class that is used to process two numbers
 * @author Stevan Mihajlov
 *
 */

public class Operation {

	/**
	 * Local variables used:
	 * a and b are double type
	 * c is a char
	 * result is a String
	 */
	private double a;
	private double b;
	private char c;
	String result="";

	/**
	 * 
	 * @param number1 - first double number
	 * @param number2 - second double number
	 * @param operation - char which determines the operations which is going to be executed on first and second number
	 * Default constructor
	 */
	public Operation(double number1, double number2, char operation){
		a=number1;
		b=number2;
		c=operation;
	}

	/**
	 * Getter for the class variable result 
	 * @return - returns a string
	 */
	public String getResult(){
		return result;
	}

	/**
	 * Calculate method, executed the selected operation based on the variable c 
	 */
	public void calculate(){
		switch(c){

		case'+':{
			result=Double.toString(a+b);
		}break;

		case'-':{
			result=Double.toString(a-b);
		}break;

		case'*':{
			result=Double.toString(a*b);
		}break;

		case'/':{
			if(b==0)
			{
				result="Error: Division with zero!";
			}
			else
			{
				result=Double.toString(a/b);
			}
		}break;

		default:{
			result="error";
		}break;

		}
	}

	/**
	 * Test method for adding two numbers
	 * @param a
	 * @param b
	 * @return
	 */
	public int add (int a, int b){
		return a+b;
	}

}
