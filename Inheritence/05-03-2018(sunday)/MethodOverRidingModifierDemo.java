     class A{
                      static void show()
                       {
                       System.out.println("static base class..");

                       }
                  }
       class B extends A{
                 
                      void show()
                          {
                         A.show();
                         System.out.println("Child class..");
                           }
                                   }
   class MethodOverRidingModifierDemo{
                            public static void main(String... args)
                             {
                                B obj=new B();
                                obj.show();
                             }
                            }