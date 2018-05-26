class CLArg{

           public static void main(String... args)
                {
             System.out.println("value:"+args[0]);    //access first value of command line argument..
             //you can display multiple values through for-each loop...  
               for(String item:args)
                  {
                   System.out.println("args value:"+item);
                   }
    
                 }

                 }