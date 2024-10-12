package com.raghu.sir;

public class MainEmployee1 {

	public static void main(String[] args) {

		Employee1 e1=new Employee1(123,"rajesh",67767.89);
		Employee1 e2=new Employee1(124,"rakesh",87767.99);
		System.out.println(e1.compareTo(e2));
	}

}
