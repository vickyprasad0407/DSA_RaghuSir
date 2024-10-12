//process of creating object in multiple way by using constructor
package com.raghu.sir;

public class CopyConstructor {

	int id;
	String name;
	double perc;
	public CopyConstructor() {

      System.out.println("hii i am a customised zero parameterised constructor");		
	}
public CopyConstructor(int id,String name, double perc) {
     this.id=id;
     this.name=name;
     this.perc=perc;
	System.out.println("i am the original object whic you want to copy");	
	}
public CopyConstructor(CopyConstructor cc) {

	this.id=cc.id;
	this.name=cc.name;
	this.perc=cc.perc;
	
}

	public static void main(String[] args) {

		CopyConstructor c1=new CopyConstructor();
		CopyConstructor c2=new CopyConstructor(123,"ramesh",73.5);//first way to create object
		CopyConstructor s2=c2;// alias of c2 and s2
		System.out.println("hii i am the alias of c2 "+s2);
		CopyConstructor c3=new CopyConstructor();//second way to create a object
		c3.id=c2.id;
		c3.name=c2.name;
		c3.perc=c2.perc;
		System.out.println("i am the second way to create an object  "+c3);
		CopyConstructor c4=new CopyConstructor(c2.id,c2.name,c2.perc);
		System.out.println("i am the third way to create an object  "+c4);
		CopyConstructor c5=new CopyConstructor(c2);
		System.out.println("c5 is the concept of copy constructor  "+c5);
	}
	@Override
	public String toString() {
		return "CopyConstructor [id=" + id + ", name=" + name + ", perc=" + perc + "]";
	}

}
