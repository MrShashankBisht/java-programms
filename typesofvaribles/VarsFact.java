class VarsFact{
                 
        public static void main(String ar[])
          {
                 Fact();
                 Fact(5);
                 Fact(5,6);
                 Fact(5,6,7);         
          }

          public static void Fact(int... data)
            {
              int s,n;
               for(int i=0;i<data.length;i++)
                  {
                      s=1;
                      n=data[i];
                       for(;n>0;n--)
                           s=s*n;
                       System.out.println("factorial of "+data[i]+"is"+s);
                  }
            
           }


          }