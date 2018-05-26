/*
important methods of File Class:-
1. boolean exists(): returns true whether specified physical file or directory exists in our system.
2. boolean createNewFile(): it will create new physical file.
3. boolean mkdir(): it will create new directory.
4. boolean isFile(): returns true if file object points to the physical file.
5. boolean isDirectory(): returns true if file object points to the physical directory
6. String[] list(): returns the names all files and directories of specified directory
7. long length: returns the number of characters available in specified file.
8. boolean delete: to delete the specified file or directory.
*/
import java.io.File;
class FileMethod{

                         static  void createFile()
                            {
                              try{
                              File f=new File("abc.txt");      
                              f.createNewFile();
                              System.out.println("file created....");
                              }
                              catch(Exception ex)
                                    {
                              System.out.println(ex);
                                   }
                            }

                        static   void createDirectory()
                             {
                                try{
                                   File f=new File("Mydir");      
                                   f.mkdir();
                                   System.out.println("directory created....");
                               }
                              catch(Exception ex)
                                    {
                              System.out.println(ex);
                                   }
                            }

                         static   void display()
                            {
                             try{
                           File f=new File("D:/java programs/Inheritence");
                           String [] lists=f.list();
                            System.out.println("content list of this directory are:-");
                             for(String val : lists)
                                 {
                             System.out.println(val);
                                  }
                               }
                              catch(Exception ex)
                                    {
                              System.out.println(ex);
                                   }
                            }
                         
                          public static void main(String args[]) 
                                 {
                                    createFile();
                                    createDirectory();
                                    display();
                                  }
                  }



