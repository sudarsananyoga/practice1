package com.stackroute.demo;

import java.util.Scanner;
public class Repeat
{
	public static void main(String[] args) 
	{
	 String word="";
	 System.out.println("enter the string");
	 Scanner sc=new Scanner(System.in);
	 word=sc.next();
	 System.out.println("enter the number");
	 int n=sc.nextInt();
	 System.out.print(word);
	sc.close();
	for(int i=0;i<n;i++) {
		for(int j=word.length()-n;j<word.length();j++) {
			
		
			System.out.print(word.charAt(j));
	}
	}	
	}
}