package com.capg.corejava.Lab1;
import java.util.Scanner;

public class PrimeNumber {

	public static void prime(int n)
	{
		for(int i=2;i<=n;i++)
	
		{
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag++;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				prime(n);
				
		
	}

}
