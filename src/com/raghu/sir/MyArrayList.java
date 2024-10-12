package com.raghu.sir;

import java.util.Arrays;

public class MyArrayList {

	Object obj [];
	int capacity,in=-1;
	public MyArrayList() {
         this(10);
	}

	public MyArrayList(int capacity) {

		this.capacity=capacity;
		obj=new Object [capacity];
	}
	void add(Object ele)
	{
		if (in==capacity-1)
		{
			grow();
		}
		obj[++in]=ele;
	}

	public void grow() {

		capacity=capacity*3/2+1;
		Object nb []=new Object[capacity];
		for (int i=0 ;i<=in ;i++)
		{
			nb[i]=obj[i];
		}
		obj=nb;
	}

	@Override
	public String toString() {
		return "[obj=" + Arrays.toString(Arrays.copyOf(obj, in+1)) + "]";
	}
	

	
}
