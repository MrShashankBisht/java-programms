class StringDemo
 {
  static int vowelCount(String s1)
   {
     int vowel=0;
     for(int i=0;i<s1.length();i++)
      {
       switch(s1.charAt(i))
        {
         case 'A':
         case 'a':
         case 'E':
         case 'e':
         case 'I':
         case 'i':
         case 'O':
         case 'o':
         case 'U':
         case 'u': vowel++;
        }
      }
    return vowel;
  }
   public static void main(String...s)
    {
     String s1="Confidence is the plant of growth";
     int vowel=vowelCount(s1);
     System.out.println("No. of vowels in the String - "+s1+":  is  -   "+vowel);
    }
 }
          