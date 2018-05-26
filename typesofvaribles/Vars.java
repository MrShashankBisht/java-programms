class Vars{
                 
        public static void main(String ar[])
          {
           System.out.println("hello java");
            Sum();
            Sum(12);
            Sum(10,20);
            Sum(10,20,30);         
          }

       static void Sum(int... List)
            {
              int s=0;
             for(int item:List)
                {
                   s=s+item;
                }
              
             /*  for(int i=0;i<List.length;i++)
                  {
                      s=s+data[i];
                  }
              */
              System.out.println("sum is:"+s); 
           }


          }