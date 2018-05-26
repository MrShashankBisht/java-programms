class StringDemo
  {
    static String reverse(String s1)
     {
       int count=0;
       char ch[]=new char[s1.length()];
       for(int i=s1.length()-1;i>=0;i--)
        {
         ch[count++]= s1.charAt(i);  
              
        }
       String s2=new String(ch);
        
       return  s2;

     }
    public static void main(String...s)
     {
      String s1="India is a great country";
      String s2 =reverse(s1);
       System.out.println("Reverse of the String "+s1+"   is -  "+s2);
     } 
  }
