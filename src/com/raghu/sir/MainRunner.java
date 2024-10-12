//wajp to print the number from n to 1
package com.raghu.sir;

import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number ");
     int n=sc.nextInt();
     display(n);
	}

	public static void display(int n) {
    System.out.println(n);
    if (n>1) {
		display(n-1);
	}
	}

}
