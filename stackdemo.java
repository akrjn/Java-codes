package java_2;
import java.util.*;
public class stackdemo 
{
	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push("Christian Bale");
		s.push("Brad Pitt");
		s.push("Leonardo DiCaprio");
		s.push("Al pacino");
		s.push("Robert DeNiro");
		System.out.println("stack elements:"+s);
		System.out.println("First Elements: "+s.peek());
		System.out.println("Stack elemens :"+s);
		System.out.println("Popping Out:"+s.pop());
		System.out.println("Stack elements: "+s);
		s.push("Mohanlal");
		System.out.println("After adding: "+s);
		System.out.println("Popping Out: "+s.pop());
		System.out.println("Stack elements: "+s);
		System.out.println("First Element: "+s.peek());
		
		Enumeration e=s.elements();
		System.out.println("Elements are : ");
		while(e.hasMoreElements());
		{
		System.out.println(e.nextElement());
		}
	}
}
