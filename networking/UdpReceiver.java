import java.net.*;
import java.io.*;
class UdpReceiver
{
public static void main(String[] args)
{
try
{
DatagramSocket receiver = new DatagramSocket(4000);
System.out.println("Receiver is ready, press ctrl+c to terminate...");
while(true)
{
System.out.println("Waiting for mesaages...");
DatagramPacket packet = new DatagramPacket(new byte[100], 100);
receiver.receive(packet);
String msg = new String(packet.getData());
System.out.println("Following message is received: " + msg.trim());
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}