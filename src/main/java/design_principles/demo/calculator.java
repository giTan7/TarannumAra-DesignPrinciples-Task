package design_principles.demo;

import java.io.*;
public class calculator {

	public static void main(String[] args)throws IOException
	{
		int a,b,n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 integer nos : ");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		System.out.println("Enter 1 for addition \n 2 for substraction \n 3 for multiplication \n 4 for division : ");
		n=Integer.parseInt(br.readLine());
		Application obj = new Application();
		if(n==1)
		{
			obj.add(a,b);
			obj.display();
		}
		if(n==2)
		{
			obj.sub(a,b);
			obj.display();
		}
		if(n==3)
		{
			obj.mul(a,b);
			obj.display();
		}
		if(n==4)
		{
			obj.div(a,b);
			obj.display();
		}

	}

}