import java.sql.*;
import java.io.*;
public class UpdateTest
{
public static void main(String[] args)
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con = DriverManager.getConnection("jdbc:odbc:myDb");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the id to update..");
int idup=Integer.parseInt(br.readLine());
PreparedStatement stmt= con.prepareStatement("select * from emp where empid=?");
stmt.setInt(1,idup);
ResultSet rset = stmt.executeQuery();

if(rset.next())
{
System.out.println("enter your updated info..");
System.out.println("enter the name");
String name=br.readLine();
stmt= con.prepareStatement("update emp set empname=? where empid=?");
stmt.setInt(2,idup);
stmt.setString(1,name);
stmt.executeUpdate();
System.out.println("record is updated");
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