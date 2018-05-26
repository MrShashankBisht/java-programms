class StringDemo
  {
    static boolean polindrome(String s1)
     {
       int count=0;
       
       char ch[]=new char[s1.length()];
       for(int i=s1.length()-1;i>=0;i--)
        {
         ch[count++]= s1.charAt(i);  
              
        }
       String s2=new String(ch);
       boolean b=s1.equals(s2); 
 
       return  b;

     }
    public static void main(String...s)
     {
      String s1="madam";
      boolean b =polindrome(s1);
       if(b)
         System.out.println(" String "+s1+"   is  polindrome");
       else
         System.out.println(" String "+s1+"   is not polindrome");
     } 
  }
