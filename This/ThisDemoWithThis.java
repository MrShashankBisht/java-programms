
 class Demo{
                   int x=10;
                   public void show(int x,int y)
                     {
                    System.out.println("x="+x);
                    System.out.println("y="+y);
                    System.out.println("intance variable x="+this.x);
                     }
                  }
class ThisDemoWithThis{
                           public static void main(String ar[])
                           {
                              Demo d=new Demo();
                               d.show(40,50);
                           }

                        }
                   
