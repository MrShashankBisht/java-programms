class StringDemo
  {
    static String allTrim(String s1)
     {
       int count=0;
       int lspace=0;
       int rspace=0;
       
       for(int i=0;i<s1.length();i++)
        {
         char ch=s1.charAt(i);
          if(ch==' ')
           {
             lspace++;
             continue;
           }
          else
           break;
        }

       for(int i=s1.length()-1;i>=0;i--)
        {
         char ch=s1.charAt(i);
          if(ch==' ')
           {
             rspace++;
             continue;
           }
          else
           break;
        }

       char ch[]=new char[s1.length()-lspace-rspace];

       for(int i=lspace;i<s1.length()-rspace;i++)
        {
         ch[count++]= s1.charAt(i);  
              
        }

       String s2=new String(ch);
       return  s2;

     }
    public static void main(String...s)
     {
      String s1="          Java is best programming technology     ";
      String s2 =allTrim(s1);
      System.out.println(" After  All trim String is  -");
      System.out.println(s2);
        
     } 
  }