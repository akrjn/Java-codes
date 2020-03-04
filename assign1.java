package java_2;

public class assign1
{
	public static void main(String[] args)
	{
		String s1="The quick brown fox jumps over the lazy dog";
		System.out.println("The character at 12th index is "+s1.charAt(12));
		System.out.println(s1.contains("is"));
		System.out.println(s1.concat(" and killed it"));
		System.out.println(s1.endsWith("dogs"));
		System.out.println(s1.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println(s1.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.length());
		System.out.println(s1.contentEquals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println(s1.replaceFirst("The","A"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
	}
}
