package com.stackroute.demo;
import java.util.Scanner;
public class Vowels
{
	public static void main(String[ ] arg)
	{
	String str="";
	System.out.println("Enter a string : ");
	Scanner sc=new Scanner(System.in);
    str=sc.nextLine()	;
    for(int i=0;i<str.length();i++)
    {
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
	{
	System.out.println("Entered character "+str.charAt(i)+" is  Vowel"); 
	}
	else if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
		System.out.println("Entered character "+str+" is Consonant");
	      else
		System.out.println("Not a letter");	
	     sc.close();
	     
	}
}
}
