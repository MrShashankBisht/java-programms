class StringDemo
  {
    
    static boolean find(String s1,String s2)
     {
        boolean b1=new Boolean(false);
                 
           for(int i=0;i<s1.length();i++)
            {
              int k=i;
              int r=0;
              for(int j=0;j<s2.length();j++)
               {
                if(s2.charAt(j)==s1.charAt(k)) 
                 {
                   k++;
                   r++; 
                 }
               }
              if(r==s2.length())
               {
                b1=new Boolean(true);
                break;
               }
      
             else
               continue;
            }
         return b1; 
     }
    public static void main(String...s)
     {
      String s1="india is great country";
      boolean b =find(s1,"is great");
       if(b)
          System.out.println(" String is exist in tha string    \'"+s1+"\'");
       else
          System.out.println(" String dose not exist in tha string     \'"+s1+"\'");
     }  
  }
