package com.stackroute.demo;
import java.util.Scanner;
public class Alphabets {
	public static void main(String args[]) 
    {
        char m;
        System.out.print("Enter any alphabet:");
        Scanner sc=new Scanner(System.in);
        m = sc.next().charAt(0);
        if(m >= 97 && m <= 123)
        {
            System.out.println("Lower Case");
        }
        else if(m >= 65 && m <= 96)
        {
            System.out.println("Upper Case");
        }
        else if(m >= 48 && m <= 57)
        {
            System.out.println("Digit");
        }
        else
        {
             System.out.println("special character");
   } sc.close();
  }
}







