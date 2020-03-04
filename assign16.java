package elite;
import java.util.*;
public class assign16
{
	public static void main(String[] args) 
	{
	Scanner obj=new Scanner(System.in);
	String s;int n;
	
	System.out.println("Enter the no of string elements ");
	n=obj.nextInt();
	String s1[]=new String[n];
	System.out.println("Enter the string ");
	for(int i=0;i<n;i++)
		s1[i]=obj.nextLine();
	System.out.println("Enter the string to be searched ");
	s=obj.nextLine();
	
	int r=UserMainCode16.getElementPosition(s,s1);
	System.out.println(r);
	}
}
class UserMainCode16
{
	static int getElementPosition(String s,String[] s1)
	{
		String temp;int pos=0;
	for(int i=0;i<=s1.length;i++)
	{
		if(s1[i].charAt(0)>s1[++ i].charAt(0))
		{
			temp=s1[i];
			s1[i]=s1[++i];
			s1[++i]=temp;
		}
	}
	for(int i=0;i<=s1.length;i++)
	{
		if(s1[i]==s)
		{
			pos=++i;
		}
	}
	return pos;
	}
}
	