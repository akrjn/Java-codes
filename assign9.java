package elite;
import java.util.*;
public class assign9
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
String s;

System.out.println("Enter the date ");
s=obj.nextLine();
boolean r=UserMainCode9.validateDate(s);
//System.out.println(r);

if(r==true)
System.out.println("Valid Date Format");
else
System.out.println("Invalid Date Format");


}
}
class UserMainCode9
{
public static boolean a=false,b=false,c=false;
static boolean validateDate(String s1)
{
String temp=s1;
boolean x=temp.matches("[0-9][0-9](-)[0-1][0-9](-)[0-2][0-9][0-9][0-9]");

if(x)
{
if(temp.charAt(0)==3)
{if(temp.charAt(1)==1||temp.charAt(0)==0)
a=true;}
if(temp.charAt(3)==1)
{if(temp.charAt(4)==0||temp.charAt(4)==1||temp.charAt(4)==2)
b=true;}
else
c=x;

}
if(a==true&&b==true)
c=true;
return c;

}
}
