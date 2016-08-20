

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
