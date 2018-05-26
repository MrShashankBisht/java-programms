/*
int num=Integer.parseInt(item);
float num=Float.parseFloat(item);
long num=Long.parseLong(item);
*/
class CLArg1{

           public static void main(String args[])
                {
       
                int sum=0;
             //you can display multiple values through for-each loop...  
               for(String item:args)
                  {
                   int num=Integer.parseInt(item);
                    sum=sum+num;
                  }
               System.out.println("sum of values are:"+sum);
    
                 }

                 }