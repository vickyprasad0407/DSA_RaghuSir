package com.raghu.sir;

public class MainSinglyLinkedList {

	public static void main(String[] args) {

		SinglyLinkedList sl=new SinglyLinkedList();
		sl.add(85);
		sl.add(95);
		sl.add(75);
		sl.add(65);
		sl.add(45);
		System.out.println(sl);
		sl.addFirst(35);
		System.out.println(sl);
		System.out.println(sl.deleteFirst());
		System.out.println(sl.deleteLast());
		System.out.println(sl);
		sl.add(100, 3);
		System.out.println(sl);
		System.out.println("the mid element is "+sl.midData());
		sl.delete(3);
		System.out.println(sl);
		System.out.println("index is "+sl.search(95));
		System.out.println("the mid element is "+sl.midData());
		System.out.println(sl.sum());
		sl.reverse();
	    System.out.println(sl);
	}	

}
