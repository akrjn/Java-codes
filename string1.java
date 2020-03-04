package java_2;

public class string1
{
	public static void main(String ar[])
	{
		String s1="Ranbir Kapoor";
		String s2="Ranveer Singh";
			System.out.println(s1.equals(s2));
			System.out.println(s1.charAt(3));
			System.out.println(s1.indexOf('b'));
			System.out.println(s1.concat(s2));
			System.out.println(s1.lastIndexOf('r'));
			System.out.println(s1.length());
			System.out.println(s1.replace("Kapoor", "Singh"));
	}
}