class Parent{
                  Parent(String s)
                       {
                    System.out.println("parameterized constructor parent:"+s);  
                        }
                
                 }
class Child extends Parent{
                    Child()
                    {
                  super("value from child");
                   System.out.println("default constructor child");  
                    }
                  }
class ParamConstructor{

                       public static void main(String ar[])
                          {
                            Child c=new Child();
                           
                          }
                     }
