import java.net.*;
import java.io.*;
class Client
{
public static void main(String[] args)
{
try
{
System.out.println("Client started, sending connection request...");
Thread.sleep(2000);
Socket s = new Socket("localhost", 2000);
Thread.sleep(1000);
System.out.println("Connection completed, sending message...");
PrintWriter out = new PrintWriter(s.getOutputStream());
Thread.sleep(2000);
out.println("Hello Server!");
out.flush();
System.out.println("Message sent, waiting for acknowledgement.....");
BufferedReader b = new BufferedReader(new
InputStreamReader(s.getInputStream()));
String msg = b.readLine();
Thread.sleep(1000);
System.out.println("Following acknowledgement received : " + msg);
System.out.println("Closing connection...");
Thread.sleep(5000);
System.out.println("Connection Closed.");
s.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
30
}