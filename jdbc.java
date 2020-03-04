package java_2;
import java.sql.*;
public class jdbc
{
	public static void main(String[] args) throws SQLException
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akshay","root","root");
			System.out.println("Connected");
			PreparedStatement st=con.prepareStatement("select * from blak");
			ResultSet rs=st.executeQuery();
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
		finally
		{
			con.setAutoCommit(false);
		}
	}
}
