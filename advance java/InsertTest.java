import java.sql.*;
import java.io.*;
public class InsertTest
{
public static void main(String[] args)
{
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the id");
int id=Integer.parseInt(br.readLine());
System.out.println("enter the name");
String name=br.readLine();
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con = DriverManager.getConnection("jdbc:odbc:myDb");
PreparedStatement stmt= con.prepareStatement("insert into emp values(?,?)");
stmt.setInt(1,id);
stmt.setString(2,name);
stmt.executeUpdate();
System.out.println("record is inserted");
con.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}