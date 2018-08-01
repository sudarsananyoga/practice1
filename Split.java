package com.stackroute.demo;
import java.util.Scanner;
public class Split {

	public static void main(String[] args) {
		int n;
	    System.out.println("enter the number");
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print(i);
	    	}
	    }
       sc.close();
	}

}
