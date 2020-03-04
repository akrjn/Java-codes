package elite;
import java.util.*;
public class assign5 
{
	public static void main(String[] args)
	{
		String s;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the string: ");
		s=obj.nextLine();
		UserMainCode5 ob1=new UserMainCode5();
		int r=ob1.checkCharacters(s);
		if(r==1)
			System.out.println("Valid");
		if(r==-1) 
			System.out.println("Invalid");
	}
}
 class UserMainCode5
 {
	 static int checkCharacters(String s1)
	 {
		 int len=s1.length();
		 if((s1.charAt(0))==(s1.charAt(len-1)))
				 return 1;
		 else 
			 return -1;
	 }
 }