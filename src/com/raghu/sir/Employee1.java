package com.raghu.sir;

public class Employee1 implements Comparable                                                                                                                                                                                                                                                                           
{

	int id;
	String name;
	double salary;
	public Employee1(int id, String name, double salary) {

	this.id=id;
	this.name=name;
	this.salary=salary;
	}
	public int compareTo(Object obj)
	{
		Employee1 e=(Employee1)obj;
		if (this.salary>e.salary)
			return 1;
		else 
			return-1;
	}

}
