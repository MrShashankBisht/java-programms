class StringDemo
  {
    static String rTrim(String s1)
     {
       int count=0;
       int space=0;

       for(int i=s1.length()-1;i>=0;i--)
        {
         char ch=s1.charAt(i);
          if(ch==' ')
           {
             space++;
             continue;
           }
          else
           break;
        }

       char ch[]=new char[s1.length()-space];

       for(int i=0;i<s1.length()-space;i++)
        {
         ch[count++]= s1.charAt(i);  
              
        }

       String s2=new String(ch);
       return  s2;

     }
    public static void main(String...s)
     {
      String s1="Java is best programming technology     ";
      String s2 =rTrim(s1);
      System.out.println(" After Right trim String is  -");
      System.out.println(s2);
        
     } 
  }