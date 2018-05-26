/*
1. if we put final before any variable then value of this variable can not be changed
2. if we put final before any method then value of this method can not be overridden
3. if we put final before any class then this class can not be inherited
*/
final class Parent{
                   final int x=20;
                  final void show()
                       {
                    x=x+12;
                    System.out.println("final parent class method");  
                        }
                
                 }
class Child extends Parent{
                   void show()
                    {
                   System.out.println("child class method");
                    }
                  }
class FinalKeyword{

                       public static void main(String ar[])
                          {
                            Child c=new Child();
                           
                          }
                     }
