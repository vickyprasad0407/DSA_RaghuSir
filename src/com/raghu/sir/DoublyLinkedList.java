package com.raghu.sir;

public class DoublyLinkedList {

	class Node
	{
		Object data;
		Node prev;
		Node next;
		Node (Object data)
		{
			this.data=data;
		}
	}
	Node head;
	void add (Object data)
	{
		Node n=new Node(data);
		if (head==null)
		{
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=n;
		n.prev=temp;
	}
	@Override
	public String toString() {
		String st="[ ";
		Node temp=head;
		while (temp!=null)
		{
			st=st+temp.data;
			if (temp.next!=null)
				st=st+"<==>";
			temp=temp.next;
		}
		return st+" ]";
	}
	public void addFirst(Object data) {

		Node n=new Node (data);
        n.next=head;
        if (head!=null)
        	head.prev=n;
		head=n;
	}
	public Object deleteFirst() {

		if (head==null)
		{
			System.out.println("list is empty");
			return "";
		}
		Object data=head.data;
		head=head.next;
		if (head!=null)
			head.prev=null;
		return data;
	     }
	public Object deleteLast() {

		Node temp=head;
		while (temp.next!=null)
		   temp=temp.next;
		if (temp.prev!=null)
		temp.prev.next=null;
		else
			head=null;
		
		
		return temp.data;
	}
	public void add(Object data, int in) {

		if (in==0)
		{
			addFirst(data);
			return;
		}
		Node temp=head;
		while (temp!=null && in>1)
		{
			temp=temp.next;
			in--;
			
		}
		if (in==1 && temp!=null)
		{
		Node n=new Node (data);
		n.prev=temp;
		n.next=temp.next;
		temp.next=n;
		if (n.next!=null)
			n.prev.next=n;
		}
		else
			System.out.println("index not in the range");
	}
	public Object delete(int in) {

		if(in==0)
		{
			return deleteFirst();
		}
		Node temp=head;
		while (temp!=null && in >0)
		{
			temp=temp.next;
			in--;
			
		}
		if (temp!=null)
		{
			System.out.println("INDEX NOT IN THE RANGE");
			return "";
		}
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
		return temp.data;
	}
	public void reverse() {
 
		Node temp=head;
		Node th=head;
		while (temp!=null)
		{
		     th=temp;
			Node curr=temp.next;
			temp.next=temp.prev;
			temp.prev=curr;
			temp=curr;
		}
		head=th;
		
	}
	public int search(Object data) {

		Node temp=head;
		int in=0;
		while (temp!=null)
		{
			if (temp.data.equals(data))
				return in;
			in++;
			temp=temp.next;
		}
		return -1;
	}
	
}
