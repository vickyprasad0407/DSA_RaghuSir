//write a recurssive method to search the element from an array using recurssion
package com.raghu.sir;

import java.util.Scanner;

public class Recurssion5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int [] arr=new int [n];
		System.out.println("Enter the "+n+" element");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println ("enter the element");
		int ele=sc.nextInt();
		int in=searchArray(arr,ele);
		if (in==-1)
			System.out.println("Element is not present");
		else
			System.out.println("element is present at index "+in);
	}

	public static int searchArray(int[] arr, int ele) {

		return searchArray(arr,ele,0);
	}

	public static int searchArray(int[] arr, int ele, int i) {
	
		if (i==arr.length)
			return -1;
		if (arr[i]==ele) {
			return i;
		}else
		   return searchArray(arr,ele,i+1);
	}

}
