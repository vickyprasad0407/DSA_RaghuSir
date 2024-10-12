package com.raghu.sir;

public class Employee {

	private int eid;
	private String ename;
	private double esal;
	public Employee(int eid, String ename, double esal) {
        this.eid=eid;
        this.ename=ename;
        this.esal=esal;
	}
	public String toString()
	{
		return "[ "+eid+"  "+ename+"  "+esal+" ]";
	}
	public int hashCode()
	{
		return eid;
	}
	public boolean equals(Object obj)
	{
		Employee e=(Employee)obj;
		return this.esal==e.esal;
	}
}
