//write a recurrsive method to print the factorial of n
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion4 {

	public static void main(String[] args) {
   
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rs=getFactorial(n);
		System.out.println(rs);
	}

	public static int getFactorial(int n) {

		if (n==0 || n==1) {
			return 1;
		}
		return n*getFactorial(n-1);
	}

}
