interface MyInterface1{        
                                   void show();
                                  }
interface MyInterface extends MyInterface1{
                                   void display();
                                  }
class MyClass implements MyInterface{
                  public void show()
                      {
                       
         System.out.println("implementation of show() method");
                      }
                public void display()
                      {
         System.out.println("implementation of display() method");
                      }
               
                                                         }

class InterfaceDemo2{
         public static void main(String args[])
                           {
                   MyInterface f=new MyClass();
                    f.show();
                    f.display();
                           }
                               }
                                 