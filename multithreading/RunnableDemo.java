class ChildThread1 implements Runnable{
                              
                                  public void run()
                                     {
                                           //thread logic here...
                                       for(int i=1;i<=10;i++)
                                        {
                                            try{
                                             Thread.sleep(1000);
                               System.out.println("child thread1-["+i+"]");
                                        
                                           }
                                            catch(Exception ex)
                                              {
                                       System.out.println(ex);
                                              }
 
                                 
                                           }
                                    }
                                 }
 class ChildThread2 implements Runnable{
                                   public void run()
                                     {
                                           //thread logic here...
                                       for(int i=1;i<=10;i++)
                                        {
                                     
                                              try{
                                             Thread.sleep(1000);
                               System.out.println("child thread2-["+i+"]");
                                        
                                           }
                                            catch(Exception ex)
                                              {
                                       System.out.println(ex);
                                              }
                                        }
                                    }
                                 }
     class RunnableDemo{
   
                  public static void main(String args[])
                      {
                        ChildThread1  cth1=new ChildThread1();                    
                        ChildThread2  cth2=new ChildThread2();
                        Thread t1=new Thread(cth1);
                         Thread t2=new Thread(cth2);
                        t1.start();                  
                        t2.start();
                      }
                                                }

