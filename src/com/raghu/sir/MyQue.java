package com.raghu.sir;

public class MyQue {

	private int capacity,front,rare;
	private Object mq [];
	public MyQue(int capacity) {

		this.capacity=capacity;
		front=rare=-1;
		mq=new Object [capacity];
	}
	public void enQue(Object ele) {

		if (rare==capacity-1)
		{
			System.out.println("que is full...");
			return;
		}
		if (front ==-1)
			front=0;
		mq [++rare]=ele;
	}
	
	public Object deQue() {

		if (front==-1)
		{
			System.out.println("que is empty...");
			return null;
		}
		Object obj=mq[front++];
		if (front>rare)
			front=rare=-1;
		return obj;
	}
	public String toString ()
	{
	 String st="[ ";
	 for (int i=front ;i<=rare ;i++)
	 {
		 st=st+mq[i]+"  ";
	 }
	 return st+" ]";
	}
	public int size()
	{
		if (front ==-1)
			return 0;
		return rare-front+1;
	}
}
