class Shared{
        void show(String msg)   
            {
             System.out.println("welcome");      
             try{
                  Thread.sleep(1000);
                 }
              catch(Exception ex)
                 {
   System.out.println(ex);
                  }
               System.out.println(":"+msg);
            }
}      
 class Thread1 extends Thread{
                      Shared s;
                      String msg;
                      Thread1(Shared s1,String s2)
                      {
                         s=s1;
                         msg=s2;
                       }
                     public void run()
                        {
                            synchronized(s)
                           {
                           s.show(msg);
                            }
                        }
                                                   }
 class Thread2 extends Thread{
                      Shared s;
                      String msg;
                      Thread2(Shared s1,String s2)
                      {             
                         s=s1;
                         msg=s2;
                       }
                     public void run()
                        {
                            synchronized(s)
                           {
                           s.show(msg);
                            } 
                        }
                          }

class SyncDemo{
                 public static void main(String args[])
                    {
                  Shared s=new Shared();
                  Thread1 t1=new Thread1(s,"ram");
                  Thread2 t2=new Thread2(s,"raj");
                   t1.start();
                    t2.start();
                     }
                        }
   

 