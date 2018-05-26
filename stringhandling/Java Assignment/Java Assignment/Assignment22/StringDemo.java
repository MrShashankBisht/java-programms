class StringDemo
  {
    
    static void triangle2(String s1 )
     {
       for(int i=s1.length()-1;i>=0;i--)
        {
          for(int j=0;j<=i;j++)
           {
             System.out.print(s1.charAt(j));
           }
          System.out.println();
        }  
     }
    public static void main(String...s)
     {
       
         triangle2("ducat");
       
     }  
  }
