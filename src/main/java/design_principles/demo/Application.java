package design_principles.demo;

/**
 * 
 * @author Tannu
 *
 */

public class Application {

	int s=0;
	void add(int x, int y)
	{
		s=x+y;
	}
	void sub(int x, int y)
	{
		s=x-y;
	}
	void mul(int x, int y)
	{
		s=x*y;
	}
	void div(int x, int y)
	{
		try {
		s=x/y;
	}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by 0 is not possible");
		}
	}
	void display()
	{
		System.out.println("The result is : "+s);
	}
}