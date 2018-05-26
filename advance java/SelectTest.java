import java.sql.*;
public class SelectTest
{
public static void main(String[] args)
{
try
{
int id=101;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con = DriverManager.getConnection("jdbc:odbc:myDb");
PreparedStatement stmt= con.prepareStatement("select * from emp where empid=?");
stmt.setInt(1,id);
ResultSet rset = stmt.executeQuery();
 System.out.println("Following records are selected...");
 while(rset.next())
{
System.out.println(rset.getInt(1)+ "\t" + rset.getString(2));
}
con.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}