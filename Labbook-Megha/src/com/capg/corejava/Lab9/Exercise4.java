package com.capg.corejava.Lab9;
import java.util.function.Supplier;

 class Number{
	static int x=8,y=9;
	static int check()
	{
		if(x<y)
		{
			return y; 
		}
		else 
			return x;
	}
}
public class Exercise4 {

	public static void main(String[] args) {
		Supplier<Integer> s=Number::check;
		int result=s.get();
		System.out.println(result);

	}

}
