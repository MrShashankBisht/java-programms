  class Demo{

                   static int count;  //static variable
                   int val;   //instance variable
                  Demo()
                  {
                    count++;
                    val++;
                  }
                    static{
                       System.out.println("static block called...");
                       count=10;
                           }
                
                static void showCount()    //static function
                    {
                 System.out.println("count="+count);
                 // System.out.println("val="+val);    
                     }
                void showVal()    //non-static function
                    {
                   System.out.println("val="+val);
                      }
                }
class StaticBlockDemo{
                    public static void main(String... args)
                        {
                        
                        Demo d1=new Demo();
                        Demo.showCount();
                        d1.showVal();
                        Demo d2=new Demo();
                        Demo.showCount();
                        d2.showVal();
                        } }