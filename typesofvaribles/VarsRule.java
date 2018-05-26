/*
 Rules:-
        1. we can have only one var-args in method. example:- void sum(int... data, int... meta);  not allowed 
        2. always keep position of var-args in last in arguments  example:- void sum(int x,int y,int...data)
*/

class VarsRule{
                 
        public static void main(String ar[])
          {
                 Sum(11);
                 Sum(12);
                 Sum(10,20);
                 Sum(10,20,30);         
          }

          public static void Sum(int x,int... data)
            {
              int s=0;
              System.out.println("X="+x);
               for(int i=0;i<data.length;i++)
                  {
                      s=s+data[i];
                  }
              System.out.println("sum is:"+s); 
           }


          }