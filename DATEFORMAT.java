package java_2;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DATEFORMAT
{
	public static void main(String[] args)throws ParseException
	{
		Date now=new Date();
		System.out.println(now);
		SimpleDateFormat ft=new SimpleDateFormat("E dd MM yyyyy 'at' hh:mm:ss a zzz");
		System.out.println(ft.format(now));
		ft=new SimpleDateFormat("dd");
		Date d=new Date();
		System.out.println(ft.format(d));
	}
}
