     class Base{
                     int x=100;
                  }
      class A extends Base{
                     int x=10;
                  }
       class B extends A{
                     int x=20;
                      void show()
                          {
                      System.out.println("x="+x);
                      System.out.println("super x="+super.x);
                      System.out.println("Base x="+((Base)this).x);
                           }
                                   }
   class DataHidingDemo2{
                            public static void main(String... args)
                             {
                                B obj=new B();
                                obj.show();
                            }
                            }