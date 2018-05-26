class Base{
                  void print()
                     {
                      System.out.println("print() of Base");
                     } }
class A extends Base{
       void print()
       {
          System.out.println("print() of A");
        } }
class B extends Base{
       void print()
       {
          System.out.println("print() of B");
        } }
class DynamicPolymor{
  public static void main(String ar[])
     {
     Base bsref;
     bsref=new A();
     bsref.print();
     bsref=new B();
     bsref.print();
    } }