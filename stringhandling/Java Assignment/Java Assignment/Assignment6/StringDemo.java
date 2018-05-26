class StringDemo
  {
    static String lTrim(String s1)
     {
       int count=0;
       int space=0;

       for(int i=0;i<s1.length();i++)
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

       char ch[]=new char[s1.length()];

       for(int i=space;i<s1.length();i++)
        {
         ch[count++]= s1.charAt(i);  
              
        }

       String s2=new String(ch);
       return  s2;

     }
    public static void main(String...s)
     {
      String s1="  Java is best programming technology";
      String s2 =lTrim(s1);
      System.out.println(" After left trim String is  -");
      System.out.println(s2);
        
     } 
  }