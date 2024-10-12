//write a recurssive method to return n fibonaccci no 
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion12 { 

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		int fib=getFib(n);
		System.out.println(fib);
	}

	private static int getFib(int n) {
		if(n==1)
		{
			System.out.println(n);
			return 0;
		}
		if (n==2)
		{
			System.out.println(n);
			return 1;
		}
		return getFib(n-1)+getFib(n-2);
	}

}
