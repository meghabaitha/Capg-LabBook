package com.capg.corejava.Lab1;
import java.util.Scanner;
public class FibonacciSeries {
	int n=5,count=20;
  static int n1=1,n2=1,n3; 
		
	
		public void nonrecursive()
	{ 
			int n1=1,n2=1,n3,i;
		System.out.println(n1);
		System.out.println(n2);
		for(i=2;i<=count;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
	
	public static void  recursive(int n)
	{
	   
	    if(n>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3; 
	        
	         System.out.println(n3);    
	         recursive(n-1);    
	    }    
	}
	
	
	public static void main(String[] args) {
		
		FibonacciSeries fb=new FibonacciSeries();
		//fb.nonrecursive();
		int count=20;
	recursive(count);
		
	}

}
