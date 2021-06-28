package com.capg.corejava.Lab9;

interface Expression
{
	public double power(int x,int y);
}
public class Exercise1 {
     
	public static void main(String[] args) {
      
		Expression e=(x,y)->
		{
			{
				 double pow = Math.pow(x, y);
				return pow;
			}
		};
		
		 double pow=e.power(2, 3);
		System.out.println("Value of x^y is :" + pow);
	}

}
