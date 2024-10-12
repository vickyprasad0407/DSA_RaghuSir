//wajp to return the sum of first n natural number
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion3 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int n=sc.nextInt();
     int sum=sumOfFirstNaturalNumber(n);
     System.out.println(sum);
	}

	public static int sumOfFirstNaturalNumber(int n) {
    
		if (n==0)
			return 0;
		return n+sumOfFirstNaturalNumber(n-1);
	}

}
