  class LocalInner{
                   int x=50;
                  void show()
                     {
                   class MyLocal{
                                     void display()
                                        {
                                    System.out.println("Local inner class x="+x);
                                         }
                                  
                                        }
                     MyLocal Lobj=new MyLocal();
                      Lobj.display();
                     } }
  class LocalInnerDemo{
                    public static void main(String ar[])
                                  {
                             LocalInner Lob=new LocalInner();
                             Lob.show();
                                  }  }
  