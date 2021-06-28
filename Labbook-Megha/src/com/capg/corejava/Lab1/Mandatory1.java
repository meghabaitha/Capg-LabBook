package com.capg.corejava.Lab1;
import java.util.Scanner;

public class Mandatory1 {

	public static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0)
			{
				
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter thevalue:");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
int result=calculateSum(n);
		
		System.out.println(result);

	}


}