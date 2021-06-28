package com.capg.corejava.Lab5;
import java.util.Scanner;


public class AgeException extends Exception {
	
	public AgeException(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		try {
			if (age<=15)
			{
				throw new AgeException("Invalid Age");	
			}
			else
			{
				System.out.println("Your age is valid");
			}
		}
		catch(AgeException ae)
		{
			System.out.println(ae);
		}
			
		
	}

}
