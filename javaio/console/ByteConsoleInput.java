import java.io.*;

class ByteConsoleInput{
    public static void main(String Args[])
     { 
        try{
        DataInputStream din=new DataInputStream(System.in);           
        System.out.println("enter the name:");
        String name=din.readLine();
        System.out.println("your name is:"+name);
            }
         catch(IOException ex)
             {
          System.out.println(ex);
             }
      }
         }