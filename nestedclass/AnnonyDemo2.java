     interface MyInterface{
                                           void display();
                                       }

     class AnnonyDemo2{
                    public static void main(String ar[])
                                  {
                                    MyInterface obj= new MyInterface( ){

                                                                           public void display()
                                                                              {
                                                                          System.out.println("annonymous class...");
                                                       
                                                                               }

                                                                            };         
                                    obj.display();                    

                                  }  }
  