class StringDemo
  {
    
    static boolean equals(String s1,String s2)
     {
        boolean b1=new Boolean(true);
           
        if (s1.length()==s2.length())
         {
           for(int i=0;i<s1.length();i++)
            {
              if(s1.charAt(i)!=s2.charAt(i)) 
               {
                boolean b=new Boolean(false);
                b1=b;
  
                break; 
               }
             }
          
         }
        else
          b1=new Boolean(false);
        return b1; 
     }
    public static void main(String...s)
     {
      String s1="india is";
      boolean b =equals(s1,"india is");
       if(b)
          System.out.println("Both Strings are equals");
       else
          System.out.println("Both Strings are not equals");
     }  
  }
