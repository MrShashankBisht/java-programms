class StringDemo
 {
   static void WordFrequency(String s1)
    {
      int n=0;
       char ch1[]=new char[s1.length()+1];
       for(n=0;n<s1.length();n++)
        {
          ch1[n]=s1.charAt(n);
         }
        ch1[n]='\0';
         
        
       int w=0;
       for(int i=0;i<s1.length();i++)
        {
         char ch= s1.charAt(i);  
          if(ch==' '|| ch=='.' )
           {
            w++;
           }
         
        }
       if (s1.charAt(s1.length()-1)!='.')
         w= w+1;
       
      
      
       char ch[][]=new char[w][];
       int a[]=new int[w];
       int count=0;
       int counter=0;
       int j=0;
      for(int i=0;i<s1.length();i++)
       {
        if(s1.charAt(i)==' '||s1.charAt(i)=='.'||ch1[i]=='\0')
          {
          }
        else
          {
           count++;
           continue;
          }
        a[j]=count;
        count=0;
         j++;
        }
      for(int i=0;i<w;i++)
        {
          ch[i]=new char[a[i]];
        }
      j=0;
      for(int i=0;i<ch1.length-1;i++)
        {
        if(s1.charAt(i)==' '||s1.charAt(i)=='.'||ch1[i]=='\0')
          {
          }
        else
          {
           ch[j][counter++]=ch1[i];
           continue;
          }
         counter=0;
         j++;
        }

     
      for (int i=0;i<ch.length;i++)
       {
         count=0;
         for(int k=i;k<ch.length;k++)
          {
            if(new String(ch[k]).compareTo(new String(ch[i]))==0)
             {
                count++;
             }
             else
              {
                for(int l=0;l<i;l++)
                  {
                    if(new String(ch[l]).compareTo(new String(ch[i]))==0)
                       count=0;
                  }
                 if(count==0)
                     break;
               }
         }
        if(count!=0)
          {
            for( int m=0;m<ch[i].length;m++)
             { 
               System.out.print(ch[i][m]);
             }
            System.out.println("   "+count+"   times  ");
            System.out.println();
           }
        

    }
  }
 public static void main(String...s)
  {
    WordFrequency("This is the commputer This is a pen.");
  }
 }