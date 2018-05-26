
     class ChildThread extends Thread{
                                 
                                 public void run()
                                  {
                                    for(int i=1;i<=5;i++)
                                     {
                                         
                                       try{
                                              Thread.sleep(1000);
                                              System.out.println(i+":"+Thread.currentThread().getName());
                                            }
                                       catch(Exception ex)
                                            {
                                             System.out.println(ex);   
                                            }

                                     }
                                 }
                              }


    class ThreadJoin{
   
                    public static void main(String args[])
                      {
                     System.out.println("main thread started...");
                    ChildThread t1=new ChildThread();
                   ChildThread t2=new ChildThread();
                    t1.start();
                    t2.start();
                        try{
                        t1.join();
                        t2.join();
                         }
                        catch(Exception ex)
                        {
                        System.out.println(ex);   
                        }
                    System.out.println("main thread finished...");
                      }
                      }