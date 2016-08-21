/*Class for getting input from keyboard*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class keyboardInput {
	private double number;
	private char letter;
	private boolean input;
	Scanner keyboard = new Scanner(System.in);

	keyboardInput()
	{		
	}



	/*Get one char from console using Scanner*/	
	public char getChar()
	{
		input = true;
		while(input)
		{
			try
			{
				letter=keyboard.next(".").charAt(0);
				input=false;
			}
			catch(InputMismatchException exception)
			{
				System.out.println("Please insert a number");
				keyboard.next();
			}
		}
		return letter;
	}

	/*Get a double value using Scanner*/

	public double getDouble() {
		input=true;
		while(input)
		{
			try
			{
				number=keyboard.nextDouble();
				input=false;
			}
			catch(InputMismatchException exception)
			{
				System.out.println("Please insert a number");
				keyboard.next();
			}
		}
		return number;
	}

}
