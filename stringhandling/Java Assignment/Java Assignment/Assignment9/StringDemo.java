class StringDemo
  {
    static String squeeze(String s1)
     {
       int count=0;
       int space=0;
        
       
       for(int i=0;i<s1.length();i++)
        {
         char ch=s1.charAt(i);
          if(ch==' ')
             space++;
                        
        }

       

       char ch[]=new char[s1.length()-space];

       for(int i=0;i<s1.length();i++)
        {
         char ch1=s1.charAt(i);
          if(ch1!=' ')
            ch[count++]= s1.charAt(i);  
              
        }

       String s2=new String(ch);
       return  s2;

     }
    public static void main(String...s)
     {
      String s1="          Java is best programming technology     ";
      String s2 =squeeze(s1);
      System.out.println(" After  squeezing String is  -");
      System.out.println(s2);
        
     } 
  }