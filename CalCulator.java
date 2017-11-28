package Cal;

import java.io.*;

import java.util.*;
public class CalCulator {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		
		
		double a, c, sum = 0;
		
		
		Scanner s = new Scanner(System.in);
		
		try{
		
		System.out.print(">");
		
		a = s.nextDouble();
		char b = s.next().charAt(0);
		c = s.nextDouble();
		
		if(a == 0)
		{
			System.out.print("Bye, now.");
			return;
			
		}
		
		if(b == '+')
		{
			sum = a + c;
		}
		
		
		if(b == '-')
		{
			sum = a - c;
		}
		
		if(b == '*')
		{
			sum = a * c;
		}
		
		
		if(b == '/')
		{
			sum = a / c;
		}
		
		if(b == '^')
		{
			sum = Math.pow(a, c);
		}
		
		
		
		
		System.out.println(sum);
		
		
		}
		catch(Exception e){
			
			System.out.print("Something is wrong.please try again");
			
		}
		
		
		
		
	}

}
