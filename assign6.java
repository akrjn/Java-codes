package elite;
import java.util.*;
public class assign6 
{
	public static void main(String[] args)
	{
		String s;
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string : ");
		s=obj.nextLine();
		System.out.println("Enter the number : ");
		n=obj.nextInt();
		UserMainCode6 ob1=new UserMainCode6();
		if(s.length()>=2*n)
		{
			String r=ob1.formNewWord(s,n);
		}
		else
			System.out.println("!!!!Invalid No. of characters as integer input!!!!!");
	}
}
class UserMainCode6
{
	static String formNewWord(String s1, int n1)
	{
		String s2,s3;int len=s1.length();
		s2=s1.substring(0,n1);
		s3=s1.substring((len-n1),len);
		System.out.println(s2.concat(s3));
		return s2.concat(s3);
	}
}