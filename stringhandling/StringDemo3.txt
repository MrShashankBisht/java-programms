/*
Commonly used methods of String class:-
1.length() method returns the size of a string.
public int length();

2.charAt() method is used to obtain a character stored at the given index in the string.
public char charAt(int index);

3.toCharArray() method returns a character array initialized by the contents of the string.
public char[] toCharArray();

4.getBytes() method returns a byte array initialized with the contents of the string.
public byte[] getBytes();

5.indexOf() method is used to find out the index of the first occurrence of the given character 
or string in the string.

public int  indexOf(char ch);
public int  indexOf(String s);

6.lastIndexOf() method is used to find out the index of the last occurrence of the given 
character or string in a string.

public int  lastIndexOf(char ch);
public int  lastIndexOf(String s);

7.compareTo( ) method is used to find out the order of strings.
public int compareTo (String s);

•return +ve integer if invoking String comes after parameter String, -ve integer otherwise. 
•0 if both strings are same.

8.substring( ) method is used to extract part of a string.

public String substring (int startIndex);

public String substring (int startIndex, int endIndex);

9. UpperCase() & toLowerCase() methods are used for converting the contents in Upper & Lower case respectively.

public String toLowerCase ( );

public String toUpperCase ( );

*/


class StringDemo3
{
	static void BytesMethodDemo()
	{
		String s = "abcdef";
                                System.out.println("character at 0 position :"+s.charAt(0));
		char[] c = s.toCharArray();
		for(int i=0; i<c.length; i++)
		 c[i]-=32;
                                String s1=new String(c);
		System.out.println("Character string:"+s1);
                                byte[]b=s.getBytes();
                                String s2=new String(b);
		System.out.println("byte string:"+s2);
                        

	}

              static void IndexOfDemo()
	{
		String s = "abcdefgh";
		System.out.println("index of character c: "+s.indexOf('c'));
                                System.out.println("last index of character c:"+ s.lastIndexOf('c'));
	}
              static void CompareToDemo()
	{
		String s1 = "Rajan";
                                String s2 = "Rajan";
                                String s3 = "Aman";
                                String s4 = "Suresh";
		System.out.println("Equal :"+s1.compareTo(s2));
                                System.out.println("greater:"+s1.compareTo(s3));
                                System.out.println("smaller:"+s1.compareTo(s4));
	}
            static void SubStringDemo()
	{
		String s1 = "JavaIsRobust";
                                System.out.println(s1.substring(2));
                                System.out.println(s1.substring(3,6));
                                
	}

            static void ConcatDemo()
	{
		String s1 = "I am Not";
                                s1.concat("sleeping");
                                String s2=s1.concat("sleeping");
                                System.out.println(s1);
                                System.out.println(s2);
                                
	}

            static void CaseDemo()
	{
		String s1 = "Rajan";
                             
                                System.out.println(s1.toLowerCase());
                                System.out.println(s1.toUpperCase());
                                
	}

             public static void main(String args[])
              {
                   BytesMethodDemo();
                   IndexOfDemo();
                   CompareToDemo();
                   SubStringDemo();
                   ConcatDemo();
                   CaseDemo();
              }

             
}
