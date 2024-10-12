package com.raghu.sir;

import java.util.Scanner;

public class BubbleSort {

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
		bubbleSort(arr);
	}

	private static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println("after bubble sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
