package elite;
import java.util.*;
public class assign4 
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		UserMainCode4 ob1=new UserMainCode4();
		String s,r;
		System.out.println("Enter the string with even no: of characters");
		s=obj.nextLine();
		int len=s.length();
		if(len%2==0)
		{
			r=ob1.getMiddleCharspresent(s);
			System.out.println(r);
		}
		else
		{
			System.out.println("Please enter even number string!!!!");
		}
	}
}
class UserMainCode4
{
	static String getMiddleCharspresent(String s1)
	{
		int len2=(s1.length())/2;
		return s1.substring((len2-1),(len2+1));
	}
}