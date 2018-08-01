package com.stackroute.demo;
import java.util.Scanner;
class Matches {

void match() {
		 int num;
		 int original=45;
		 System.out.println("enter the number");
		 Scanner n=new Scanner(System.in);
		 num=n.nextInt();
		 if(num<original)
		 {
			 System.out.println("number guessed is less than original number");
			 match();
		 }
		 else if(num==original)
		 {
			 System.out.println("number guessed matches original number");
			
		 }
		 else if(num>original) {
			 System.out.println("number guessed is greater than original number");
			 match();
		 }
	
n.close();
	}
}
public class Checknum
{
    public static void main(String args[])
    {
	Matches numb=new Matches();
    numb.match();
	
}
}
