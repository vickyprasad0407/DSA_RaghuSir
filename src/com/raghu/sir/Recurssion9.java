//write a recurssive method to check the palindrome no 
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion9 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean rs=isPalindrome(n);
		if(rs)
			System.out.println("palindrome number");
		else
			System.out.println("number");
	}

	private static boolean isPalindrome(int n) {

		return isPalindrome(n,0,n);
	}

	private static boolean isPalindrome(int n, int rev,int temp) {
		// TODO Auto-generated method stub
		if(n==0)
			return temp==rev;
		return isPalindrome(n/10,rev*10+n%10,temp);
	}

}
