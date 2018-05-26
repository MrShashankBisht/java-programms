     abstract class MyClass{
                                           abstract void display();
                                       }

     class AnnonyDemo{
                    public static void main(String ar[])
                                  {
                                     MyClass obj= new MyClass( ){

                                                                           void display()
                                                                              {
                                                                          System.out.println("annonymous class...");
                                                       
                                                                               }

                                                                            };         
                                    obj.display();                    

                                  }  }
  