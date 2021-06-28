package com.capg.corejava.Lab5;
import java.util.Scanner;


public class EmployeeException extends Exception {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary");
		int sal=sc.nextInt();
		
		try {
			if (sal<=3000)
			{
				throw new EmployeeException();	
			}
			else
			{
				System.out.println("Your salary is valid");
			}
		}
		catch(EmployeeException ae )
		{
			System.out.println(ae);
		}
			
		
	}

}
