package com.java.test;

import java.util.Scanner;

public class addition {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		float  a, b;
		   Scanner scan=new Scanner(System.in);
			//system.in - input stream
		   
			
			System.out.println("Enter the value of a:");
			a=scan.nextInt();
			
			System.out.println("Enter the value of b:");
			b=scan.nextInt();
         double addition=a+b;
        
         double multiplication=a*b;
         double division=a/b;
         System.out.println("Addition="+addition);
        
         System.out.println("Multiplication="+multiplication);
         System.out.println("Division="+division);
         
    	
	}
	public static void main1(String[] args)
	{
		float  a, b;
		   Scanner scan=new Scanner(System.in);
		   
		   System.out.println("Enter the value of a:");
			a=scan.nextInt();
			
			System.out.println("Enter the value of b:");
			b=scan.nextInt();
	
			 double subtraction=a-b;
	
			 System.out.println("Subtraction="+subtraction);
	
	
	
	
	
	
	
	
	
	
	}

}
