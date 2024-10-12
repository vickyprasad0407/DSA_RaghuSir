package com.raghu.sir;

import java.util.Scanner;

public class MainStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the capacity of the stack");
		int capacity=sc.nextInt();
         MyStack ms=new MyStack(capacity);
         System.out.println("do you want to push the element");
         String s=sc.next();
         if(s.equalsIgnoreCase("yes"))
         {
         while (true)
         {
        	 System.out.println("push the element");
        	 double d=sc.nextDouble();
        	 ms.push(d);
        	 System.out.println("do you want to add more elements");
        	 String str=sc.next();
        	 if (str.equalsIgnoreCase("no")) {
				break;
			} 	 
         }
         }
         System.out.println("element after push");
         System.out.println(ms);
         System.out.println("do you want size of the stack");
         String s3=sc.next();
         if (s3.equalsIgnoreCase("yes")) 
        	 System.out.println(ms.size());
         System.out.println("do you want to pop the element");
         String s1=sc.next();
         if (s1.equalsIgnoreCase("yes")) {
        	 while(true)
        	 {
			System.out.println("pop the element");
        	 System.out.println(ms.pop());
        	 System.out.println("do you want more pop");
        	 String s2=sc.next();
        	 if(s2.equalsIgnoreCase("no"))
        		 break;
        	 }
		}
         System.out.println("element after pop");
         System.out.println(ms);
         
         System.out.println("do you want size of the stack");
          s3=sc.next();
         if (s3.equalsIgnoreCase("yes")) 
        	 System.out.println(ms.size());
         System.out.println("do you want peek of the stack");
         String s4=sc.next();
         if (s4.equalsIgnoreCase("yes")) 
        	 System.out.println(ms.peek());
         System.out.println(ms);
	}

}
