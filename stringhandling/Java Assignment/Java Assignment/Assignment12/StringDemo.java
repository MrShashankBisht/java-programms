class StringDemo
 {
   static void sequenceCount(String s1)
    {
      char ch[]=new char[s1.length()+1];
       int k=0;
      for(  k=0;k<ch.length-1;k++)
       {
         ch[k]=s1.charAt(k); 
       }
       ch[k]='\0';
       int i=0;
       while(i<ch.length-1)
       {
        int totalc=0;
        int j=0;

        if(ch[i]==' ')
         {
            i++;
            continue;
         }
        for (  j=i;j<ch.length-1;j++)
         {
          
          if(ch[j]==ch[i])
           {
             totalc++;
            
           }
          else
           {
            
            break;
           }
        }
          
          System.out.println(ch[i] +"  in sequence  "+ totalc +" times");
          i=j;
      }
       
      
    }
   public static void main(String...s)
    {
      sequenceCount("nniittin");
      
    }
  }      