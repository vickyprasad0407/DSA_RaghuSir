//write a recurssive method to print gcd 
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion13 {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the no m and n");
   int m=sc.nextInt();
   int n=sc.nextInt();
   int rs=getGCD(m,n);
   System.out.println("The greatest common divisor is :"+rs);
	}

	private static int getGCD(int m, int n) {
      if(m<n)
    	  return getGCD(n,m);
      if (m%n==0)
    	  return n;
		return getGCD(n,m%n);
	}

}
