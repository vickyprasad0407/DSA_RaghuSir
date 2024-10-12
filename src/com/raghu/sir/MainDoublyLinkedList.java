package com.raghu.sir;

public class MainDoublyLinkedList {

	public static void main(String[] args) {

		DoublyLinkedList dl=new DoublyLinkedList();
		dl.add(85);
		dl.add(95);
		dl.add(75);
		dl.add(65);
		dl.add(45);
		System.out.println(dl);
		dl.addFirst(35);
		System.out.println(dl);
		System.out.println("delete first : "+dl.deleteFirst());
		System.out.println("delete last : "+dl.deleteLast());
		System.out.println(dl);
		dl.add(39,2);
		System.out.println(dl);
		System.out.println(dl.delete(2));
		System.out.println(dl);
		dl.reverse();
		System.out.println(dl);
		System.out.println("searched index is : "+dl.search(25));
	}

}
