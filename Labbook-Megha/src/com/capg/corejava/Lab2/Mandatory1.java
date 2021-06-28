package com.capg.corejava.Lab2;
import java.util.Scanner;

public class Mandatory1 {

	public static int getSecondSmallest ( int arr[],int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]> arr[j])
				{
					temp= arr[i];
					 arr[i]= arr[j];
					 arr[j]=temp;
				}
			}
		}
		return  arr[1];
}
	public static void main(String[] args) {
		System.out.println("Enter no. of Elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=getSecondSmallest(arr,n);
		System.out.println("Second smallest number from the array is :"+result);
	}

}
