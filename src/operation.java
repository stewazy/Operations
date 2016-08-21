/*Class that contains two numbers, result and an operation and an operation*/

public class operation {
	private double a;
	private double b;
	private char c;
	String result="";

	/*Class constructior*/
	operation(double number1, double number2, char operation)
	{
		a=number1;
		b=number2;
		c=operation;
	}

	/*Method for getting result*/

	public String getResult()
	{
		return result;
	}

	/*Method for calculating the result based on operation*/

	public void calculate()
	{
		switch(c)
		{

		case'+':
		{
			result=Double.toString(a+b);
		}break;

		case'-':
		{
			result=Double.toString(a-b);
		}break;

		case'*':
		{
			result=Double.toString(a*b);
		}break;

		case'/':
		{
			if(b==0)
			{
				result="Error: Division with zero!";
			}
			else
			{
				result=Double.toString(a/b);
			}
		}break;

		default:
		{
			result="error";
		}break;

		}
	}

}
