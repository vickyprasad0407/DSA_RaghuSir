package com.raghu.sir;

import java.util.Scanner;

public class SelectionSorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of ann array");
		int n=sc.nextInt();
		int [] arr=new int [n];
		System.out.println("enter "+n+" element");
		for (int i = 0; i < arr.length; i++) {
			arr [i]=sc.nextInt();
		}
		System.out.println("user entered the array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("user printed the array");
		selectionSort(arr);
	}

	private static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int index=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[index]>arr[j]) {
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		System.out.println("after selection sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
