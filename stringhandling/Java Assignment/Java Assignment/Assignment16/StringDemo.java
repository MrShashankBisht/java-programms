class StringDemo
  {
    static String sortedOrder(String s1)
     {
        
       byte b[]=s1.getBytes();

       for(int i=0;i<b.length;i++)
        {
          for(int j=0;j<b.length-i-1;j++)
           {
             if(b[i]>=65&&b[i]<=90||b[i]>=97&&b[i]<122)
              {
                byte temp;
                 if (b[j]>b[j+1])
                  {
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                  }
              }
            }
              
        }
       String s2=new String(b);
        
       return  s2;

     }
    public static void main(String...s)
     {
      String s1="india";
      String s2 =sortedOrder(s1);
       System.out.println("sorted Order of the String "+s1+"   is -  "+s2);
     } 
  }
