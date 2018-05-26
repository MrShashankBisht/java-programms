class StringDemo
  {
    
    static String Replace(String s1,String s2,String s3)
     {
         int position=0;
         int count=0;       
           for(int i=0;i<s1.length();i++)
            {
              int k=i;
               
              int r=0;
              for(int j=0;j<s2.length();j++)
               {
                if(s2.charAt(j)==s1.charAt(k)) 
                 {
                   k++;
                   r++;
                   position=i;
                 }
               }
              if(r==s2.length())
                break;
             }
           char ch1[]=new char[position ];
           char ch2[]=new char[s1.length()-ch1.length-s2.length()];
           char ch3[]= new char[s1.length()-s2.length()+s3.length()+1];
 
              for(int j=0;j<ch1.length;j++)
                 ch1[j]=s1.charAt(j); 
 
              int i=ch1.length+s2.length();

              for(int j=0;j<ch2.length;j++)
                ch2[j]=s1.charAt(i++);  
              
              for(int j=0;j<ch1.length;j++)
                 {ch3[count]=ch1[j]; 
                  count++; 
                 }
              for(int j=0;j<s3.length();j++)
                 {
                   ch3[count+1]=s3.charAt(j);
                   count++; 
                 }
              for(int j=0;j<ch2.length;j++)
                 {
                   ch3[count+1]=ch2[j];
                   count++;
                 }
        return new String(ch3); 
     }
    public static void main(String...s)
     {
      String s1="india is great country";
      String st =Replace(s1,"is great","is a best");
      System.out.println(st);
     }
       
  }
