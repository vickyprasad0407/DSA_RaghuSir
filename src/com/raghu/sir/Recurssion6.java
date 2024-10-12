//write a recurrsion  method to check the user enter is prime or not
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("enter the no. which you want to check");
		int n=sc.nextInt();
		boolean rs=isPrime(n);
		if (rs)
			System.out.println("prime number");
		else
			System.out.println("Number");
	}

	private static boolean isPrime(int n) {

		return isPrime(n,2);
	}

	private static boolean isPrime(int n, int i) {

		if (i>n/2)
			return true;
		if (n%i==0)
			return false;
		else
		  return isPrime(n,i+1);
	}

}
