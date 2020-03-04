package elite;
import java.util.*;
public class assign3
{
	public static void main(String[] args)
	{
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=obj.nextInt();
		UserMainCode3 ob1=new UserMainCode3();
		int sum=ob1.sumOfSquaresOfEvenDigits(n);
		System.out.print("The Sum of Squares of Even Digits in the number is : "+sum);
	}
}
class UserMainCode3
{
	static int sumOfSquaresOfEvenDigits(int num)
	{
		int temp,sum1=0;
		while(num>0)
		{
			temp=num%10;
			if(temp%2==0)
				sum1+=(temp*temp);
			num/=10;
		}
		return sum1;
	}
}