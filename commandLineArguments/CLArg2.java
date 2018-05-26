import java.util.Arrays;

class CLArg2{

           public static void main(String args[])
                {
              System.out.println("sorted list..."); 
              Arrays.sort(args);
               for(String item:args)
                  {
                 System.out.println(item);
                  }
              }

                 }