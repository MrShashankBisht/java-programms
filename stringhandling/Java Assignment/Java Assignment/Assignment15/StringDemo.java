class StringDemo
 {
   static String SingleOccurance(String s1)
    {
      char ch[]=new char[s1.length()+1];
      int i=0;
      for(i=0;i<ch.length-1;i++)
       {
         ch[i]=s1.charAt(i); 
       }
      ch[i]='\0';
      int totalc=0;
      for (int j=0;j<ch.length-1;j++)
       {
         if(ch[j]!=ch[j+1])
           totalc++;
       }
      char ch1[]=new char[totalc];
      int k=0; 
      for (int j=0;j<ch.length-1;j++)
       {
         if(ch[j]!=ch[j+1])
           ch1[k++]=ch[j];
          
       }
      return new String(ch1);
    }
   public static void main(String...s)
    {
      String s1=SingleOccurance("nniittin iiisdfs ssdsdfg");
      System.out.println(s1);
    }
  }      