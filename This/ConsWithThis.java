
 class Demo{
                   int x,y;
                    Demo(int x,int y)
                    {
                      this.x=x;
                      this.y=y;
                     }

                   public void show()
                     {
                    System.out.println("x="+x);
                    System.out.println("y="+y);
                    }

                  }
class ConsWithThis{
                           public static void main(String ar[])
                           {
                              Demo d=new Demo(40,50);
                               d.show();
                           }

                        }
                   
