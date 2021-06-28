package com.capg.corejava.Lab5;
import java.util.Scanner;

public class NameException extends Exception {

	public NameException(String str)
	{
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String fname=sc.nextLine();
		System.out.println("Enter your last name: ");
		String lname=sc.nextLine();
		
		
		
		try {
			if(fname==null&&lname==null)
			{
				throw new NameException("Name is not valid");
			}
			else
			{
				System.out.println("Full name :" + fname +" " + lname);
				System.out.println("Name is valid");
			}
		}
		catch(NameException ee)
		{
			System.out.println(ee);
		}
	}

}
