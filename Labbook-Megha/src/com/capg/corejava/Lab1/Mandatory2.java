package com.capg.corejava.Lab1;
import java.util.Scanner;

public class Mandatory2 {

	public static int calculateDifference(int n)
	{
		int sum1=0,sum2=0,sum=0;
		for(int i=0;i<=n;i++)
		{
			sum1=sum1+(i*i);
		}
		for(int i=0;i<=n;i++)
		{
			sum2=sum2+i;
			
		}
		sum2=(sum2*sum2);
		sum=sum2-sum1;
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter thevalue:");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
int result=calculateDifference(n);
		
		System.out.println(result);


	}

}
