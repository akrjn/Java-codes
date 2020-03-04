package java_2;
import java.io.*;
public class Testfile 
{
	public static void main(String st[])throws Exception
	{
		String s="pw2.java";
		String s1="pw1.java";
		int i;
		FileInputStream fis=new FileInputStream(s1);
		//Bufferedwriter bw=new BufferedWriter(new OutputStreamWriter)
		FileOutputStream bw=new FileOutputStream(s,false);
		fis.skip(0);
		while((i=fis.read())!=-1)
		{
			bw.flush();
			bw.write(i);;
		}
		bw.close();
		fis.close();
	}
	
}

