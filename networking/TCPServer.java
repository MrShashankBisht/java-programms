a)
import java.net.*;
import java.io.*;
class Server
{
public static void main(String[] args)
{
try
{
ServerSocket server = new ServerSocket(2000);
System.out.println("Server is ready, waiting for connection request...");
Socket s = server.accept();
System.out.println("Waiting for message...");
BufferedReader b = new BufferedReader(new
InputStreamReader(s.getInputStream()));
String msg = b.readLine();
Thread.sleep(1000);
System.out.println("Following message received : " + msg);
System.out.println("Sending acknowledgement ....");
Thread.sleep(2000);
PrintWriter out = new PrintWriter(s.getOutputStream());
out.println("Hello Client, Your message is received.");
out.flush();
System.out.println("Acknowledgement sent, closing connection....");
Thread.sleep(5000);
System.out.println("Connection closed.");
s.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}