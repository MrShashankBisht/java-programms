class Base{
                 void display()
                  {
               System.out.println("Base Class..");
                  } }
interface MyInterface{
                                     void message();
                                   }
class Child extends Base implements MyInterface{
       public void message()
         {
        System.out.println("interface implementation..");
        } }
class MultipleDemo{
      public static void main(String ar[])
        {
            Child c=new Child();
             c.display();
             c.message();
        } }