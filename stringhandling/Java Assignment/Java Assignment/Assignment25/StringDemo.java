class StringDemo
  {
    
    static int compare(String s1,String s2)
     {
        byte b1[]=s1.getBytes();
        byte b2[]=s2.getBytes();
        int x=0;
        int length=0;

        if(s1.length()<s2.length())
          length=s1.length();
        else
          length=s2.length();
        
        for(int i=0;i<length ;i++)
          {
            
            if(b1[i]-b2[i]==0)
             {
               x=0;
               continue;
             }
            else if(b1[i]-b2[i]<0)
               {
                 x=-1;
                 break;
               }
            else
               {
                 x=1;
                 break;
               }
          }
          
         if(x==0&&(s2.length() <s1.length()))
           x=1;
         if(x==0&&(s2.length() >s1.length()))
           x=-1;
         
        return x; 
     }
    public static void main(String...s)
     {
      String s1="Hello java";
      int b =compare(s1,"Hello java");
       if(b==0)
          System.out.println("Both Strings are equals");
       else if(b<0)
          System.out.println("First Strings is bigger");
       else
          System.out.println("First Strings is smaller");
     }  
  }
