class Parent{
                  Parent()
                       {
                    System.out.println("parent class constructor");  
                        }
                
                 }
class Child extends Parent{
                    Child()
                    {
                   System.out.println("child class constructor");
                    }
                  }
class Constructor{

                       public static void main(String ar[])
                          {
                            Child c=new Child();
                           
                          }
                     }
