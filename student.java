package java_2;
import java.util.*;
public class student
{

	private static Scanner obj;

	public static void main(String[] args)
	{
		obj = new Scanner(System.in);
		String name;
		int a[],total=0;
		System.out.print("Enter the student name : ");
		name=obj.nextLine();
		
		System.out.print("Enter no. of subjects: ");
		a=new int[obj.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the marks of subject "+(i+1) + ": ");
			a[i]=obj.nextInt();
			total+=a[i];
		}
		System.out.print ("Name of student : "+name);
		for(int i=0;i<a.length;i++)
		{
			System.out.print("\nMarks of subject " +(i+1) +" is " +a[i]);
		}
		System.out.println("\nTotal marks : " +total);
	}

}
