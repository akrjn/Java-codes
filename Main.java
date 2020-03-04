package elite;
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in); 
		int n,r;
	UserMainCode ob1=new UserMainCode();
		System.out.print("Enter a positive integer : ");
		n=obj.nextInt();
		if(n>0)
		{
			r=ob1.checkSum(n);
			if(r==1)
				System.out.println("The sum of odd digits is odd");
			if(r==-1)
				System.out.println("The sum of odd digits is even");
		}
		else
		{
			System.out.println("Please Enter a positive integer!!!!!!\n");
		}
	}
}
	
	class UserMainCode
	{
		public int checkSum(int num)
		{
			int temp,sum=0,count=0;
			while(num>0)
			{
				temp=num%10;
				if(temp%2!=0) 
				{
					sum+=temp;
				}
				num/=10;
			}
			System.out.println("sum is "+sum);
			if(sum%2!=0)
				return 1;
			else
				return -1;
		}
	}
