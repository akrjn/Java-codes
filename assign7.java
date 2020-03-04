package elite;
import java.util.*;
public class assign7 
{
	public static void main(String[] args)
	{
		int n;
		Scanner obj=new Scanner(System.in);
		UserMainCode7 ob1=new UserMainCode7();
		System.out.print("Enter the number : ");
		n=obj.nextInt();
		if(n>0)
		{
			int r=ob1.reverseNumber(n);
			System.out.println(r);
		}
		else
			System.out.println("Invalid Input!!!!Enter positive number\n");	
	}
}
class UserMainCode7
{
	static int reverseNumber(int n1)
	{
		int temp=0,rem;
		while(n1>0)
		{
			rem=n1%10;
			temp=(temp*10)+rem;
			n1/=10;
		}
		return temp;
	}
}