import java.sql.*;
public class NewClass
{
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://localhost:3306/speak_up";
	static final String un="root";
	static final String pwd="password";
	public static void main(String args[])
	{
		Connection conn=null;
		Statement stmt=null;
		try
		{
			try
			{
			Class.forName(JDBC_DRIVER);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			conn=DriverManager.getConnection(DB_URL,un,pwd);
			stmt=conn.createStatement();
                       
			String sql="select emotion from main";
                    try (ResultSet rs = stmt.executeQuery(sql)) {
                        while(rs.next())
                        {
                            
                            String name=rs.getString("emotion");
                            System.out.println("name: " + name);
                        }
                    }
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		try
		{
			if(stmt!=null)
				conn.close();
		}
		catch(SQLException e)
		{
		}
	}
}
			