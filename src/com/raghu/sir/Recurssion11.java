//define a recurssive method to return product of a digit
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion11 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int pro=getProduct(n);
		System.out.println(pro);
	}

	private static int getProduct(int n) {
		// TODO Auto-generated method stub
		if(n<10)
			return n;
		return n%10*getProduct(n/10);
	}

	

}
