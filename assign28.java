package elite;
import java.util.Scanner;

class UserMainCode28
{

static String validateIDLocations(String s1,String s2)
{
String id,loc,s3,s4;
int a=0;
id=s1;
loc=s2;
boolean n=id.matches("['CTS']+[-\\.\\s]+[a-zA-Z]{3}+[-\\.\\s]+[0-9]{4}");
for(int i=0;i<3;i++)
{
if(id.charAt(i+4)==loc.charAt(i))
a++;
}
if(n==true && a==3)
return "Valid ID";
else
return "Invalid ID";

}
}
public class assign28
{

public static void main(String[] args)
{

String a,b;
Scanner scn=new Scanner(System.in);
System.out.println("Enter the id");
a=scn.next();
System.out.println("Enter the location");
b=scn.next();
String c=UserMainCode.validateIDLocations(a,b);
System.out.println(c);
} 
}
