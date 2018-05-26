class StringDemo
  {
    static String changeCase(String s1)
     {
        
       byte b[]=s1.getBytes();

       for(int i=0;i<b.length;i++)
        {
          if(b[i]>=65&&b[i]<=90)
             b[i]=(byte)(b[i]+32);
          else if(b[i]>=97&&b[i]<=122)
             b[i]=(byte)(b[i]-32);
             
              
        }
       String s2=new String(b);
        
       return  s2;

     }
    public static void main(String...s)
     {
      String s1="InDiA iS a GoOd CoUnTrY";
      String s2 =changeCase(s1);
       System.out.println("Case change of the String "+s1+"   is -  "+s2);
     } 
  }
