import java.io.*;
class FileReadOperation{
    public static void main(String Args[])
     { 
        try{
       
        FileInputStream fin=new FileInputStream("filedemo.txt");         
        System.out.println("ur content is here:");
        int b;
         do{
               b=fin.read();
               if(b==-1)
               {
                  break;
                }
              System.out.print((char)b);
                 
                }while(b!=-1);                
     
        fin.close();
    
            }
         catch(IOException ex)
             {
          System.out.println(ex);
             }
      }
         }