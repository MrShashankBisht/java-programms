import java.io.*;

class CharStreamConsoleInput{
    public static void main(String Args[])
     { 
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));           
        System.out.println("enter the name:");
        String name=br.readLine();
        System.out.println("your name is:"+name);
            }
         catch(IOException ex)
             {
          System.out.println(ex);
             }
      }
         }