interface MyInterface1{        
                                   void show();
                                  }
interface MyInterface{
                                   void display();
                                  }
class MyClass implements MyInterface,MyInterface1{
                  public void show()
                      {
                       
         System.out.println("implementation of show() method");
                      }
                public void display()
                      {
         System.out.println("implementation of display() method");
                      }
               
                                                         }

class InterfaceDemo3{
         public static void main(String args[])
                           {
                      MyClass f=new MyClass();
                    f.show();
                    f.display();
                           }
                               }
                                 