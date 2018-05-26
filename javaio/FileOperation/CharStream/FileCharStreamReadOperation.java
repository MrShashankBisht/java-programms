import java.io.*;
class FileCharStreamReadOperation{
    public static void main(String Args[])
     { 
        try{
        BufferedReader br=new BufferedReader(new FileReader("filedemo.txt"));         
        System.out.println("ur content is here:");
        String s;
        while((s=br.readLine()) !=null)
          {
             System.out.println(s);
          }        

        br.close();
    
            }
         catch(IOException ex)
             {
          System.out.println(ex);
             }
      }
         }