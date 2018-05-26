/*
StringBuffer
•	Objects of StringBuffer represents mutable strings. Each StringBuffer object
                creates an array of default or specified capacity that is used to hold the contents of StringBuffer.
•	Default capacity of StringBuffer object is 16 characters.
•	StringBuffer objects can be created using following constructors:-

public StringBuffer();
public StringBuffer(int capacity);
public StringBuffer(String s);

*/

    class   StringBufferDemo1{
   
               public static void main(String args[])
                  {
              
                  StringBuffer sb1=new StringBuffer();
                 StringBuffer sb2=new StringBuffer(10);
                 StringBuffer sb3=new StringBuffer("Hello");
                  System.out.println(sb1.capacity());
                  System.out.println(sb2.capacity());
                  System.out.println(sb3.capacity());

                 }
                                 }

                