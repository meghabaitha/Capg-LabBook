package com.capg.corejava.Lab9;


interface Space{
	String show(String str);
}
public class Exercise2 {

	

	public static void main(String[] args) {
		
		
		Space e2=(str)->
		{
			{
		String s =String.join(" ",str.split(""));
		return s;
			}
		};
		String s=e2.show("CD");
		System.out.println(s);
	}

}
