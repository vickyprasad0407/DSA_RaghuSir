package com.raghu.sir;

public class MainQue {

	public static void main(String[] args) {
		MyQue ms=new MyQue(5);
		ms.enQue(45);
		ms.enQue(85);
		ms.enQue(95);
		System.out.println(ms);
		System.out.println(ms.size());
		System.out.println(ms.deQue());
		System.out.println(ms.deQue());
		System.out.println(ms);
		System.out.println(ms.size());
		

	}

}
