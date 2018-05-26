import java.net.*;
class LocalHost{
  public static void main(String args[])
    {
    try{
       InetAddress address=InetAddress.getByName(args[0]);
       System.out.println("Ip address is: "+address.getHostAddress());
       }
    catch(Exception ex)
     {
     System.out.println(ex);

    }

    }
}