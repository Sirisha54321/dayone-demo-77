package com.wipro.calculator;

import java.util.Scanner;
//Class Name and File Name are same
public class Addition {

	// Entry point of Java Program
	public static void main(String args[]) {
		
		// read input from keyBoard
		//new keyword used to create the object
		Scanner scan=new Scanner(System.in);
		
		int numberOne,numberTwo,result;
		System.out.println(" Enter Number 1");
		numberOne=scan.nextInt();
		System.out.println(" Enter Number 2");
		numberTwo=scan.nextInt();
		
		result=numberOne+numberTwo;
		
		System.out.println("Addition of Two Number " + result );
		System.out.println("Welcome to Stackroute Program");
		
	}
	
}
