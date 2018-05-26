import java.net.*;
class IPFinder{
  public static void main(String args[])
    {
    try{
       InetAddress address=InetAddress.getLocalHost();
       System.out.println("system Ip address is: "+address.getHostAddress());
       }
    catch(Exception ex)
     {
     System.out.println(ex);

    }

    }
}