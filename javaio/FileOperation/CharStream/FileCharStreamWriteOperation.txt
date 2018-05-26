import java.io.*;

class FileCharStreamWriteOperation{
    public static void main(String Args[])
     { 
        try{
        FileWriter fw=new FileWriter("filedemo.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));           
        System.out.println("enter ur content here:");
        String name=br.readLine();
        fw.write(name);
        fw.close();
        br.close();
        System.out.println("file content is written successfully");
            }
         catch(IOException ex)
             {
          System.out.println(ex);
             }
      }
         }