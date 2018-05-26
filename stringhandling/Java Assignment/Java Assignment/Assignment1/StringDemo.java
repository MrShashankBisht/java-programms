class StringDemo
  {
    static int wordCount(String s1)
     {
       int w=0;
       for(int i=0;i<s1.length();i++)
        {
         char ch= s1.charAt(i);  
          if(ch==' '|| ch=='.')
           {
            w++;
           }
         
        }
       if (s1.charAt(s1.length()-1)!='.')
         w= w+1;
       
       return w;
     }
    public static void main(String...s)
     {
       int x=wordCount("India is a great country.");
       System.out.println("No. of words are "+x);
     } 
  }
