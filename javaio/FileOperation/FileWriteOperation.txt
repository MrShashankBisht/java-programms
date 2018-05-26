import java.io.*;

class FileWriteOperation{
    public static void main(String Args[])
     { 
        try{
        FileOutputStream fout=new FileOutputStream("filedemo.txt",true);
        DataInputStream din=new DataInputStream(System.in);           
        System.out.println("enter ur content here:");
        String name=din.readLine();
        byte b[]=name.getBytes();       
        fout.write(b);
        fout.close();
        System.out.println("file content is written successfully");
            }
         catch(IOException ex)
             {
          System.out.println(ex);
             }
      }
         }