package java_2;

public class Myexplicitthrow 
{
	public static void main(String args[])
	{
	try 
	{
		Myexplicitthrow met=new Myexplicitthrow();
		System.out.println("length of JUNK is " +met.getStringSize("JUNK"));
		System.out.println("length of WRONG is " +met.getStringSize("WRONG"));
		System.out.println("length of null string is " +met.getStringSize(null));
	}
	catch(Exception ex)
	{
		System.out.println("Exception message "+ex.getMessage());
		
	}
	}
	public int getStringSize(String s)throws Exception
	{
		if(s==null)
		{
			throw new Exception("Null is passed");
		}
		else
		{
		int l=s.length();return l;
		}
	}
}
