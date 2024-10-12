//wajp to evaluate the post fix expression
package com.raghu.sir;

import java.io.CharConversionException;
import java.util.Scanner;
import java.util.Stack;

public class EvaluatePostFix {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter valid post fix expression");
		String st=sc.next();
		double ev=evaluatePostFix(st);
		System.out.println(ev);
	}

	private static double evaluatePostFix(String st) {

		Stack<Double> stk=new Stack<Double>();
		Scanner sc=new Scanner (System.in);
		for(int i=0 ;i<st.length() ;i++)
		{
			char ch=st.charAt(i);
			if (Character.isAlphabetic(ch))
			{
				System.out.println("enter the value of : "+ch);
				double v=sc.nextDouble();
				stk.push(v);
				
			}
			else
			{
				double y=stk.pop();
				double x=stk.pop();
				switch (ch)
				{
				case '+':stk.push(x+y);
				break;
				case '-':stk.push(x-y);
				break;
				case '*': stk.push(x*y);
				break;
				case '/': stk.push(x/y);
				break;
				case '%': stk.push(x%y);
				
				}
				
			}
			
		}
		return stk.pop();
	}

}
