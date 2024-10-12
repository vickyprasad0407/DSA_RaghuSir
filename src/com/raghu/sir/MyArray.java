package com.raghu.sir;

import java.util.Arrays;

public class MyArray {

	public static void main(String[] args) {

		int [] arr= {10,20,30,40};
		String st=Arrays.toString(arr);//print the array without using for each loop i.e converting into string
		System.out.println(st);
		int [] br=Arrays.copyOf(arr, arr.length);//creating the copy of an array
		System.out.println(Arrays.toString(br));
		int [] y=arr;//alias of arr
		System.out.println(y[1]);
		int [] ar= {15,30,20,70,14};
		//Arrays.sort(ar);//sort the array in accending order
		//Arrays.sort(ar, 0, 3);
		Arrays.parallelSort(ar);
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.binarySearch(ar, 70));//give the index of the array
		
	}

}
