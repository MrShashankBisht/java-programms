     class A{
                      protected void show()
                       {
                       System.out.println("base class..");

                       }
                  }
       class B extends A{
                 
                      protected void show()
                          {
                         super.show();
                         System.out.println("Child class..");
                           }
                                   }
   class MethodOverRidingDemo{
                            public static void main(String... args)
                             {
                                B obj=new B();
                                obj.show();
                            }
                            }