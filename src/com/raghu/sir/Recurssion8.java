//define a recurssive method to return the reverse of a number
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion8 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rev=reverse(n);
		System.out.println(rev);
	}

	private static int reverse(int n) {

		return reverse(n,0);
	}

	private static int reverse(int n, int rev) {
		if(n==0)
			return rev;
		return reverse( n/10,rev*10+n%10);
	}

}
