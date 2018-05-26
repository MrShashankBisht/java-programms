class StringDemo
 {
   static String wordSort(String s1)
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
      for(int i=0;i<ch1.length;i++)
       {
        if(ch1[i]==' '||ch1[i]=='.'||ch1[i]=='\0')
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
         if(ch1[i]==' '||ch1[i]=='.'||ch1[i]=='\0')
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

     //ch[j][counter++]=s1.charAt(s1.length()-1);
      for (int i=0;i<ch.length;i++)
       {
         for(int k=0;k<ch.length-i-1;k++)
          {
            if(new String(ch[k]).compareTo(new String(ch[k+1 ]))>0)
             {
                char temp[]=ch[k];
                ch[k]=ch[k+1];
                ch[k+1]=temp;
             }
          }
       }
    j=0;
    for(int i=0;i<ch.length;i++)
     {
       for(int k=0;k<ch[i].length;k++)
        {
         ch1[j++]=ch[i][k];
        }
       ch1[j++]=' ';
     }
    return new String(ch1);
  }
 public static void main(String...s)
  {
   String s1= wordSort("Raj Vijay Ajay Gaurav");
   System.out.println("The string in the sorting word order is : --  ");
   System.out.println(s1);
  }
 }