package elite;
import java.util.*;
public class assign8 
{
	
public static ArrayList<Integer> so(ArrayList<Integer>a1,ArrayList<Integer>a2)
{ 
	ArrayList<Integer>a3=new ArrayList<Integer>();
	a1.addAll(a2);
	Collections.sort(a1);
	a3.add(a1.get(2));
	a3.add(a1.get(6));
	a3.add(a1.get(8));
 
	return a3;
}
 
public static void main(String[] args)throws Exception  
{

  Scanner sc=new Scanner(System.in);
  int a,b;
  
  ArrayList<Integer> ar=new ArrayList<Integer>();
  System.out.println("Enter the first array");
  for(int i=0;i<5;i++)
  {
    a=sc.nextInt();
    ar.add(a);
  }
  ArrayList<Integer> ar1=new ArrayList<Integer>();
  System.out.println("Enter the second array");
  for(int j=0;j<5;j++)
  {
    b=sc.nextInt();
    ar1.add(b);
  }
  ArrayList<Integer> ret=new ArrayList<Integer>();
  ret=so(ar,ar1);
  for(int p=0;p<3;p++)
  System.out.println(ret.get(p));
 }
}