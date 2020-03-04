package java_2;

import java.util.ArrayList;

class ArrayListTest
{
public static void main(String[] s)
{
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(1);
	a.add(2);
	a.add(3);
	System.out.println(a);
	for(Integer o:a)
		System.out.println(o);
}
}
