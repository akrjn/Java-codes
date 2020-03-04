package elite;

import java.util.Scanner;
public class assign26 
{

public static void main(String[] args) 
{
Scanner obj=new Scanner(System.in);
System.out.println("Enter the size of array1");
int x=obj.nextInt();
System.out.println("Enter the size of array2");
int y=obj.nextInt();

int m[]=new int[x];
int n[]=new int[y];
System.out.println("Enter the array1 elements");
for(int i=0;i<m.length;i++)
m[i]=obj.nextInt();
System.out.println("Enter the array2 elements");
for(int i=0;i<n.length;i++)
n[i]=obj.nextInt();

int sum=UserMainCode26.getSumOfIntersection(m, n, x, y);

System.out.println("Sum = "+sum);
}
}

class UserMainCode26
{
public static int getSumOfIntersection(int a[],int b[],int x,int y)
{
int sum=0;
boolean c=false;
for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
if(a[i]==b[j])
{
sum+=a[i];
c=true;
}
}
}
if(c==false)
System.out.println("No Common Elements Found");
return sum;
}
}