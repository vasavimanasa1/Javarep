package jAVA;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		//palindrome means the number should be same when it reverse also
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		int s1=s.nextInt();
		int r,sum=0;
		int t=s1;
		while(s1>0)
		{
			r=s1%10;
			s1=s1/10;
			sum=(sum*10)+r;
		}
		if(t==sum)
		{
			System.out.println("The given number is palindrome::");
		}
		else
			System.out.println("The given number is not palindrome:");
	}
	

}
