package com.raghu.sir;

import java.util.Scanner;

public class InsertionSort {

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
		insertionSort(arr);
	}

	private static void insertionSort(int[] arr) {

		for (int i =1 ; i < arr.length; i++) {
			int key=arr[i];
			int j=i-1;
			while (j>-1 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println("after insertion sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
