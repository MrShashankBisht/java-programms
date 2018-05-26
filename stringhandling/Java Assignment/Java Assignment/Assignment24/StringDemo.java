class StringDemo
  {
    
    static void triangle3(String s1 )
     {
       for(int i=0;i<s1.length();i++)
        {
          for(int k=0;k<s1.length()-i;k++)
           {
             System.out.print(s1.charAt(k));
           }

          for(int l=1;l<=i;l++)
           {
             System.out.print(' ');
           }

          for(int l=1;l<=i;l++)
           {
             System.out.print(' ');
           }

          for(int j=i;j<s1.length();j++)
           {
             System.out.print(s1.charAt(j));
           }

          System.out.println();
        }  
     }
    public static void main(String...s)
     {
       
         triangle3("ducat");
       
     }  
  }
