//write a recurssive method to calculate sum of digit of a number
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion10 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		int sum=sumOfDigit(n);
		System.out.println(sum);
	}

	private static int sumOfDigit(int n) {

		if (n==0)
			return 0;
		return n%10+sumOfDigit(n/10);
	}

	

}
