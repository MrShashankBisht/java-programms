import java.io.File;
class CreateFile{
                                        
                          public static void main(String args[]) 
                                 {
                              try{
                              File f=new File("abc.txt");      
                              System.out.println( f.exists());
                              f.createNewFile();
                              System.out.println( f.exists());
                              }
                              catch(Exception ex)
                                    {
                              System.out.println(ex);
                                   }
                                  }
                  }



