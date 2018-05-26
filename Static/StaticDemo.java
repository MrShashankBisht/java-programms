class Demo{

                   static int count;  //static variable
                   int val;   //instance variable
                  Demo()
                  {
                    count++;
                    val++;
                  }
                void showCount()
                    {
                 System.out.println("count="+count);
                     }
                void showVal()
                    {
                   System.out.println("val="+val);
                      }
                }
class StaticDemo{
                    public static void main(String... args)
                        {
                        Demo d1=new Demo();
                        d1.showCount();
                        d1.showVal();
                        Demo d2=new Demo();
                        d2.showCount();
                        d2.showVal();
                        }
}