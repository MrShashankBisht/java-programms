interface MyInterface{
                                   int x=20;
                                   void show();
                                   void display();
                                  }
class MyClass implements MyInterface{
                  public void show()
                      {
                      
         System.out.println("implementation of show() method"+x);
                      }
                public void display()
                      {
         System.out.println("implementation of display() method");
                      }
               
                                                         }

class InterfaceDemo{
         public static void main(String args[])
                           {
                   MyInterface f=new MyClass();
                    f.show();
                    f.display();
                           }
                               }
                                 