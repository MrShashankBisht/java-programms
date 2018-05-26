class StringDemo
  {
    static int charCount(String s1)
     {
       int c=0;
       for(int i=0;i<s1.length();i++)
        {
         char ch= s1.charAt(i);  
          if(ch!=' ')
           {
            c=c+1;
           }
         
        }

       return c;
     }
    public static void main(String...s)
     {
       int ch=charCount("India is a great country");
       System.out.println("No. of character are "+ch);
     } 
  }
