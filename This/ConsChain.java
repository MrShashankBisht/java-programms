
 class Demo{
                 
                    Demo()
                    {
                        this(10);
                       System.out.println("Default constructor...");
                     }
                   Demo(int x)
                    {
                       this(12,50);
                       System.out.println("Parameterized constructor with 1 parameter");
                   }
                  Demo(int x,int y)
                    {
                       System.out.println("Parameterized constructor with 2 parameter");
                   }
               
                  }
class ConsChain{
                           public static void main(String ar[])
                           {
                              Demo d=new Demo();
                           }

                        }
                   
