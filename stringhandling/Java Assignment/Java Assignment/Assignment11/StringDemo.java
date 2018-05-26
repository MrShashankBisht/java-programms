class StringDemo
 {
  static int length(String s1)
   {
     int length=0;
     char ch[]=s1.toCharArray();
     
     for(int i=0;i<ch.length;i++) 
      {
          
        length++;
            
      }
    return length;
  }
   public static void main(String...s)
    {
     String s1="Confidence is the plant of growth";
     int length=length(s1);
     System.out.println("Lengths of the String - "+s1+":  is  -   "+length);
    }
 }
          