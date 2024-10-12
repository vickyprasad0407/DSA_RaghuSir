/*wajp to check the string is balanced or not
 * we use stack to check wheather the string is balanced or not
 */
package com.raghu.sir;

import java.util.Scanner;
import java.util.Stack;

public class StringBalanced {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.next();
		boolean rs=isBalanced(st);
		if (rs)
			System.out.println("String is balanced");
		else
			System.out.println("String is not balanced");
	}

	private static boolean isBalanced(String st) {

		if (st.length()%2==1)
			return false;
		Stack<Character>stk=new Stack<Character>();
		for (int i=0 ;i<st.length() ;i++)
		{
			char ch=st.charAt(i);
			if (ch=='{' || ch=='(' || ch=='[')
				stk.push(ch);
			else
			{
				 if (st.isEmpty())
					 return false;
				 char pch=stk.pop();
				 if (ch=='}' && pch=='{')
					 return true;
				 if (ch==')' && pch=='(')
					 return true;
				 if (ch==']' && pch=='[')
					 return true;
			}
			
		}
		return stk.isEmpty();
	}

}
