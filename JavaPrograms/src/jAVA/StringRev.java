package jAVA;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		String rev="";
		System.out.println("The original string is:: "+str);
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
	
		System.out.println("After reversing the string is:: "+rev);
	}

}
