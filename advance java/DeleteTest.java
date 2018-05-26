import java.sql.*;
import java.io.*;
public class DeleteTest
{
public static void main(String[] args)
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con = DriverManager.getConnection("jdbc:odbc:myDb");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the id to delete..");
int idup=Integer.parseInt(br.readLine());
PreparedStatement stmt= con.prepareStatement("select * from emp where empid=?");
stmt.setInt(1,idup);
ResultSet rset = stmt.executeQuery();

if(rset.next())
{
stmt= con.prepareStatement("delete from emp where empid=?");
stmt.setInt(1,idup);
stmt.executeUpdate();
System.out.println("record is deleted");
}
else
{
System.out.println("Sorry record does not exist..");
}
con.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}