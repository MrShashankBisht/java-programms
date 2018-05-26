import java.net.*;
import java.util.Scanner;
import java.io.*;
class UdpSender
{
public static void main(String[] args)
{
try
{
DatagramSocket sender = new DatagramSocket(3000);
Scanner in = new Scanner(System.in);
while(true)
{
System.out.println("Enter Message, end to terminate...");
String msg = in.nextLine();
if(msg.equals("end"))
break;
DatagramPacket packet = new DatagramPacket(msg.getBytes(),
msg.length(), InetAddress.getLocalHost(), 4000);
sender.send(packet);
System.out.println("Successfully sent.");
}
sender.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}