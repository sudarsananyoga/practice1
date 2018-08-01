package com.stackroute.demo;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0,temp,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter all the elements:");
		for(int i= 0; i < n; i++) 
		{
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
			if (a[i] < a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		} 		
		System.out.println("descending Order:");
		for (int i = 0; i < n ; i++) 
		{
			System.out.println(a[i]);
		}
		while(n>0)
		{
			r=n%10;
			if(r%2==0) 
			{
				sum=sum+r;
				}
			n=n/10;	
		}
		if(sum>25)
		{
			System.out.println("sum is greater than 25,true");
		}else
		{
			System.out.println("sum is less than 25,False");
			sc.close();
		}
	}

}
