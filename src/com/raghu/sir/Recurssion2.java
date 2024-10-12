//wajp to print the no from 1 to n
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion2 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int n=sc.nextInt();
     display(n);
	}

	public static void display(int n) {
       if (n>1) {
		display(n-1);
	}		
       System.out.println(n);
	}

}
