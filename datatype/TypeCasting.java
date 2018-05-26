class TypeCasting
            {
          public static void main(String ar[])
            {
             int x=10;
             long y=x;  //widening
             System.out.println("widening y="+y);
             long z=12;
             int w=(int)z; //narrowing
             System.out.println("narrowing w="+w);
             System.out.println("now type promotion demo....");
             short a=10;
             show(a);                      
             }
      
       public static void show(short x)
            {
           System.out.println("short x"+x);
            } 
      public static void show(int x)
            {
           System.out.println("int x"+x);
            } 
      public static void show(long x)
            {
           System.out.println("long x"+x);
            } 
       public static void show(float x)
           {
           System.out.println("float x"+x);
            }   
           public static void show(double x)
            {
           System.out.println("double x"+x);
            }

}