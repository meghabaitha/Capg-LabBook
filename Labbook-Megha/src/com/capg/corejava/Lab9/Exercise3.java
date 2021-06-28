package com.capg.corejava.Lab9;

 interface intf {
	boolean test(String username,String password);
}
public class Exercise3 {
	public static void main(String[] args) {
	 intf e=(username,password)->
			 {
		 
		 {
			if(username.length()<7) {
				return  false;
			}
			else { 
				 return true;}
		 }
			 

	};
	
	boolean str=e.test("meghabaitha","meghabaitha");
	System.out.println(str);
	}
}
