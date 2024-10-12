//define a method to check the string is palindrome or not
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion14 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		boolean rs=isPalindrome(str);
		if(rs)
			System.out.println("palindrome");
		else
			System.out.println("not the palindrome");
	}

	private static boolean isPalindrome(String str) {
		return isPalindrome(str,0,str.length()-1);
	}

	private static boolean isPalindrome(String str, int i, int j) {

		if (i>=j)
			return true;
		if (str.charAt(i)!=str.charAt(j))
			return false;
		return isPalindrome(str,++i,--j);
	}

}
