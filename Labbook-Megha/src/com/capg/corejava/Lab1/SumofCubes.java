package com.capg.corejava.Lab1;
import java.util.Scanner;

public class SumofCubes {
	
	
	public static void main(String[] args) {
		System.out.println("Enter thevalue:");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		//SumofCubes ob =new SumofCubes();
		
		//int result=ob.sumOfDigits(n);
		int result=sumOfDigits(n);
		
		System.out.println(result);
	}
		
public static int sumOfDigits(int n)
{
	int sum=0;
  while(n!=0)
  {
	  int rem=n%10;
	  sum=sum+(rem*rem*rem);
	  n=n/10;
  }
  return sum;
}
}
