package com.raghu.sir;

public class MainArrayList {

	public static void main(String[] args) {

		MyArrayList ml=new MyArrayList();
		MyArrayList ml2=new MyArrayList(5);
		ml.add(10);
		ml.add(20);
		ml.add(30);
		System.out.println(ml);
		ml2.add(33);
		ml2.add(43);
		ml2.add(44);
		ml2.add(54);
		ml2.add(64);
		System.out.println(ml2);
		ml2.add(74);
		System.out.println(ml2);
	}

}
