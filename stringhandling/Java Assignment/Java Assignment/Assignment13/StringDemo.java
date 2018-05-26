class StringDemo
 {
   static void frequency(String s1)
    {
      char ch[]=new char[s1.length()+1];
       int k=0;
      for( k=0;k<ch.length-1;k++)
       {
         ch[k]=s1.charAt(k); 
       }
       ch[k]='\0';

       int i=0;
       while(i<ch.length-1)
       {
        int totalc=0;
        if(ch[i]==' ')
         {
           i++;
          continue;
         
         }
        int j=0;
        for (j=i;j<ch.length;j++)
         {
          if(ch[j]==ch[i])
           {
             totalc++;
           }
          else
           {
             for(int l=0;l<i;l++)
              {
               if(ch[l]==ch[i])
                {
                  totalc=0;
                  break;
                }
              }
             if(totalc==0)
               break;
           }
         }
        if(totalc>0)
            System.out.println(ch[i] +"  in sequence  "+totalc+ "times");
        i++;
       }
       
      
    }
   public static void main(String...s)
    {
      frequency("nnii  hjhj ttin");
      
    }
  }      