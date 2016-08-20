

public class operation {
private double a;
private double b;
private char c;
String result="";

operation(double number1, double number2, char operation)
{
	a=number1;
	b=number2;
	c=operation;
}

public String getResult()
{
	return result;
}

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
