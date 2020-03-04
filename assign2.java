package elite;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class assign2
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int r,j;
		System.out.println("Enter the number in format : XXX-XXX-XXXX");
		String s=obj.nextLine();
		UserMainCode1 ob1=new UserMainCode1();
		r=ob1.ValidateNumber(s);
		if(r==1)
			System.out.println("Valid Number Format");
		if(r==-1)
			System.out.println("Invalid Number Format");	
	}
}
class UserMainCode1
{
	public int ValidateNumber(String s1)
	{
		Pattern p=Pattern.compile("[0-9][0-9][0-9](-)[0-9][0-9][0-9](-)[0-9][0-9][0-9][0-9]");
		Matcher m=p.matcher(s1);
		if(m.find()&&m.group().contentEquals(s1))
		{
		
		return 1;
		}
		else
		{
			return -1;
		}
	}
}
		
