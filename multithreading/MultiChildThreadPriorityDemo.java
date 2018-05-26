class ChildThread1 extends Thread{
                                    ChildThread1(String val)
                                       {
                                        super(val);
                                       }

                                  public void run()
                                     {
                                           //thread logic here...
                                       for(int i=1;i<=10;i++)
                                        {
                                       
                                            
                                              try{
                                            
                               System.out.println("child thread1-["+i+"]"+Thread.currentThread().getName());
                                        
                                           }
                                            catch(Exception ex)
                                              {
                                       System.out.println(ex);
                                              }
 
                                 
                                           }
                                    }
                                 }
 class ChildThread2 extends Thread{
                                   ChildThread2(String val)
                                       {
                                        super(val);
                                       }

                                    public void run()
                                     {
                                           //thread logic here...
                                       for(int i=1;i<=10;i++)
                                        {
                                     
                                              try{
                                          
                               System.out.println("child thread2-["+i+"]"+Thread.currentThread().getName());
                                        
                                           }
                                            catch(Exception ex)
                                              {
                                       System.out.println(ex);
                                              }
                                        }
                                    }
                                 }
     class MultiChildThreadPriorityDemo{
   
                  public static void main(String args[])
                      {
                        ChildThread1  cth1=new ChildThread1("mythread1");                    
                        ChildThread2  cth2=new ChildThread2("mythread2");
                        cth1.setPriority(Thread.MIN_PRIORITY);  //1
                        cth2.setPriority(Thread.MAX_PRIORITY);  //10
                        cth1.start();                  
                        cth2.start();
                      }
                                                }

