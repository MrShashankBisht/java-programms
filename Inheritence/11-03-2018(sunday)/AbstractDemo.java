       abstract class Account{
                     int id;
                     String name;
                     Account(int a,String b)
                      {
                         id=a;
                         name=b;
                       }
                      abstract void show();
                     }
       class Saving extends Account{
                            
                      Saving(int x,String y)
                      {
                        super(x,y);
                       }
                    void show()
                      {
                    System.out.println("Saving class:"+id+", "+name);
                      }

                        }
 class Current extends Account{
                            
                      Current(int x,String y)
                      {
                        super(x,y);
                       }
                    void show()
                      {
                    System.out.println("Current class:"+id+", "+name);
                      }
                        }
   class AbstractDemo{
                            public static void main(String... args)
                             {
                              /*  
                                Saving s=new Saving(101,"SAC");
                                Current c=new Current(501,"CAC");
                                 s.show();
                                 c.show();
                             */
                           
                         
                               Account ac;
                               ac=new Saving(101,"SAC");
                               ac.show();
                               ac=new Current(501,"CAC");
                               ac.show();
                           
                            }
                            }