package com.capg.corejava.Lab1;
import java.util.Scanner;

public class Mandatory3 {

	public static boolean checkNumber(int n)
	{
		boolean check=true;
		int rem=n%10;
		n=n/10;
		while(n>0)
		{
			int rem1=n%10;
			if(rem<rem1)
			{
				check=false;
				break;
			}
			
			rem=rem1;
			n=n/10;
		}
		
		
		return check;
	}
	public static void main(String[] args) {
		System.out.println("Enter thevalue:");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
boolean result=checkNumber(n);
		if(result)
		{
		System.out.println("Increasing number");
		}
		else
		{
			System.out.println("Not increasing number");
		}

}
}
