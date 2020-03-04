package java_2;
import java.sql.*;
public class jdbc1
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","root");
			System.out.println("Connected");
			
			PreparedStatement ps=con.prepareStatement("update blak set esal=44444 where ename='Akshay';");
			ps.executeUpdate();
			ps.close();
			
			ps=con.prepareStatement("select * from blak");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("emp_no"));
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getInt("depno"));
			}
		}
		catch(SQLException |ClassNotFoundException se)
		{
			System.out.println(se);
		}
	}
}
