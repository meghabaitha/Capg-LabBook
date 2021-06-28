package com.capg.corejava.Lab1;
import java.util.Scanner;

public class Mandatory4 {

	public static boolean checkNumber(int n) {
		boolean check=true;
	
		while(n>1)
		{
			if(n%2!=0)
			{
				check=false;
			break;
			}
			n=n/2;	
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
		System.out.println("Power of 2");

	}
		else
		{
			System.out.println("Not power of 2");
		}


}
}