package com.raghu.sir;

import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("enter the first employee details i.e. id, name,salary");
		int id1=sc.nextInt();
		String name1=sc.next();
		double sal1=sc.nextDouble();
		Employee e1=new Employee(id1,name1,sal1);
		System.out.println("enter the second employee details i.e. id, name,salary");
		int id2=sc.nextInt();
		String name2=sc.next();
		double sal2=sc.nextDouble();
		Employee e2=new Employee(id2,name2,sal2);
		System.out.println("enter the third employee details i.e. id, name,salary");
		int id3=sc.nextInt();
		String name3=sc.next();
		double sal3=sc.nextDouble();
		Employee e3=new Employee(id3,name3,sal3);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e3));
		
	}

}
