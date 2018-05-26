import java.io.*;

class FileCharStreamCopyOperation{
    public static void main(String Args[])
     { 
        try{
        BufferedReader brin=new BufferedReader(new FileReader("filedemo.txt"));
        FileWriter fw=new FileWriter("filedemocopy.txt");
        String s;
        while((s=brin.readLine()) !=null)
          {
             fw.write(s);
           }        

         brin.close();
         fw.close();
        System.out.println("file copy operation is successfully done....");
            }
         catch(IOException ex)
             {
          System.out.println(ex);
             }
      }
         }