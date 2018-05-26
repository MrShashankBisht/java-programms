      class A{
                     int x=10;
                  }
       class B extends A{
                     int x=20;
                      void show()
                          {
                      System.out.println("x="+x);
                      System.out.println("super x="+super.x);
                      System.out.println("super x using this="+((A)this).x);
                           }
                                   }
   class DataHidingDemo{
                            public static void main(String... args)
                             {
                                B obj=new B();
                                obj.show();
                            }
                            }