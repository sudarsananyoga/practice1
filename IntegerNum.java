package com.stackroute.demo;
import java.util.Scanner;
public class IntegerNum {
	public static void main(String[] args)
	{
	    int num;
		System.out.println("enter the number:");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
			if((num%2!=0)&&(num>20 && num<30))
			{
				System.out.println("Tom");
			}
			if((num%2==0)&&(num>20 && num<30))
				System.out.println("Jerry");
	input.close();
}
}