class StringDemo
  {
    static int spaceCount(String s1)
     {
       int s=0;
       for(int i=0;i<s1.length();i++)
        {
         char ch= s1.charAt(i);  
          if(ch==' ')
           {
            s=s+1;
           }
         
        }

       return s;
     }
    public static void main(String...s)
     {
       int space=spaceCount("India is a great country");
       System.out.println("No. of spaces are "+space);
     } 
  }
