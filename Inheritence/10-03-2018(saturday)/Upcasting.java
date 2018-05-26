class Parent{
                  void show()
                    {
                   System.out.println("Show method of parent");
                    }
                 }
class Child extends Parent{
                  void show()
                    {
                   System.out.println("Show method of child");
                    }
                   void display()
                    {
                   System.out.println("Personal method of child");
                    }
                  }
class Upcasting{

                       public static void main(String ar[])
                          {
                         Parent p=new Child();   //upcasting
                         p.show();
                         //p.display();
                         Child c=(Child)p;     //downcasting
                         c.display();
                         c.show();
                           
                          }
                     }
