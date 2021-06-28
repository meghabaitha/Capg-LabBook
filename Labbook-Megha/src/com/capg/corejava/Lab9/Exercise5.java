package com.capg.corejava.Lab9;
import java.util.function.Function;

  class Factor
{
	static double f=1;
	static double test(int x)
	
	{
		for(int i=1;i<=x;i++)
		{
			f=f*i;
		}
		return f;
	}
}
public class Exercise5 {

	

	public static void main(String[] args) {
		
		Function<Integer,Double> p=Factor::test;
		Double f = p.apply(5);
		System.out.println("Factorial of the number is :"+f);
	
	}

}
