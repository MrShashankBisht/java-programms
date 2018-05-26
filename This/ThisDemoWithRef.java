
 class Demo{
                   int x=10;
                   public void show(int x,int y,Demo d)
                     {
                    System.out.println("x="+x);
                    System.out.println("y="+y);
                    System.out.println("intance variable x="+d.x);
                     }
                  }
class ThisDemoWithRef{
                           public static void main(String ar[])
                           {
                              Demo d=new Demo();
                               d.show(40,50,d);
                           }

                        }
                   
