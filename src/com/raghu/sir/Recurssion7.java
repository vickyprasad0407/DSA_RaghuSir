//write a recurssive method to return true if the number is perfect
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion7 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean rs=isPerfect(n);
		if (rs)
			System.out.println("perfect number");
		else
			System.out.println("number");
	}

	private static boolean isPerfect(int n) {
		return isPerfect(n,1,0);
	}

	private static boolean isPerfect(int n, int i,int sum) {
		if(i>n/2)
			return n==sum;
		if(n%i==0)
		{
			sum=sum+i;
		}
		return isPerfect(n,++i,sum);
	}

}
