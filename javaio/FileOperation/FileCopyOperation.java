import java.io.*;

class FileCopyOperation{
    public static void main(String Args[])
     { 
        try{
        FileInputStream fin=new FileInputStream("filedemo.txt");
        FileOutputStream fout=new FileOutputStream("filedemocopy.txt");
        int b;
          do{
                b=fin.read();
                 if(b==-1)
                   break;
                 fout.write(b);
              }while(b!=-1);      
          fin.close();
         fout.close();
        System.out.println("file copy operation is successfully done....");
            }
         catch(IOException ex)
             {
          System.out.println(ex);
             }
      }
         }