package com.capg.corejava.Lab1;
import java.util.Scanner;

public class TrafficLight {

	
	public static void main(String[] args) {
		System.out.println("Enter the color of choice");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		switch(n)
		{
		case "red":
		{
			System.out.println("Stop");
			break;
		}
		case"orange":
		{
			System.out.println("Ready");
			break;
		}
		case "green":
		{
			System.out.println("Go");
			break;
		}
		default:
		{
			System.out.println("Invalid color");
			break;
		}
		}
	}

}
