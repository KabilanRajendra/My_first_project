package com.java.test;
import java.util.Scanner;

public class Rectangle {
	  public static void main(String args[])  
	    {  
	    float length,breath;
	    Scanner scan=new Scanner(System.in);
		//system.in - input stream
		
		System.out.println("Enter the value of length:");
		length=scan.nextInt();
		
		System.out.println("Enter the value of breath:");
		breath=scan.nextInt();

	    
	    double  area=breath*length; 
	    double perimeter=2*(breath+length);	    
	    
	    System.out.println("Area of rectangle="+area);
	    System.out.println("Perimeter of rectangle="+perimeter);

} 
	  }
