/*
Restrictions:-
1.  non-static variables can not be used directly.
2.  this keyword can not be used.
3.  super keyword can not be used.
*/

class Demo{

                   static int count;  //static variable
                   int val;   //instance variable
                  Demo()
                  {
                    count++;
                    val++;
                  }
                static void showCount()    //static method
                    {
                 System.out.println("count="+count);
                 // System.out.println("val="+val);    
                     }
                void showVal()    //non-static method
                    {
                   System.out.println("val="+val);
                      }
                }
class StaticFunctionDemo{
                    public static void main(String... args)
                        {
                        Demo d1=new Demo();
                        Demo.showCount();
                        d1.showVal();
                        Demo d2=new Demo();
                        Demo.showCount();
                        d2.showVal();
                        } }