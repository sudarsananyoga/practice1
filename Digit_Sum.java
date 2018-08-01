package com.stackroute.demo;
import java.util.Scanner;
public class Digit_Sum {
 public static void main(String args[])
 {
	 int number,sum=0;
	 System.out.println("enter the number till 0");
	 Scanner sc=new Scanner(System.in);
	 number=sc.nextInt();
	 while(number!=0)
	 {
		 sum=sum+number;
		 number=sc.nextInt();
	 }
	 System.out.println(sum);
	 sc.close();
 }
}
