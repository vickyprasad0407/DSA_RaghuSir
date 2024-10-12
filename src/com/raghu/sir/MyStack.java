package com.raghu.sir;

public class MyStack {

	int top=-1,capacity;
	Object stk [];
	public MyStack(int capacity)
	{
		this.capacity=capacity;
		stk=new Object[capacity];
	}
	public void push(Object ele) {

		if(top==capacity-1)
		{
			System.out.println("Stack overflow.....");
			return;
		}
		stk[++top]=ele;
		
	}
	public Object pop() {

		if (top==-1)
		{
			System.out.println("stack under flow....");
			return "";
			
		}
		
		return stk[top--];
	}
	public String toString()
	{
		String st="[ ";
		for(int i=0  ;i<=top ;i++)
		{
			st=st+stk[i]+" ";
		}
		return st+" ]";
		
	}
	public int size() {
		return top+1;
	}
	public Object peek() {
		if (top==-1)
		{
			System.out.println("Stack under flow");
			return " ";
		}
		return stk[top];
	}
	
}
