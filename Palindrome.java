package com.stackroute.demo;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		long num,s=0;
		long r,sum=0,temp;
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextLong();
		temp=num;
		while(num>0)
		{
			r=num%10;
			if(r%2==0) 
			{
				s=s+r;
				}
			sum=(sum*10)+r;	
			num=num/10;	
		}
		if(temp==sum) 
		{
    	  System.out.println("number is a palindrome");
    	  if(s>25)
    	  {
    		  System.out.println("sum is greater than 25");
    	  }
    	  if(s<25) {
    		  System.out.println("sum is less than 25");
    	  }
      }
		else
    	  System.out.println("number is not a palindrome");
		sc.close();
	}

}
