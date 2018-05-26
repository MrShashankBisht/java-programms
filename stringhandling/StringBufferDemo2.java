/*
Commonly used methods of StringBuffer class:-
1.append ( ) method is used to append a primitive value or contents of a string to the StringBuffer.

public StringBuffer append(int i);
public StringBuffer append(char c);
public StringBuffer append(String s);


2.insert( ) method is used to insert a string at the given position in the StringBuffer object.


public StringBuffer insert(int index, String s);


3.replace( ) method is used to replace part of a StringBuffer object with the given string.

public StringBuffer replace(int startIndex, int endIndex, String s);


4.reverse ( ) method reverses the contents of StringBuffer.

public StringBuffer reverse();

5.toString( ) method returns the content of StringBuffer as an immutable string.

public StringBuffer toString();


*/


class StringBufferDemo2
{
	static void AppendDemo()
	{
		  StringBuffer sb1=new StringBuffer("Hello");
                                  sb1.append(" Raj");
		System.out.println(sb1);
	}

              static void InsertDemo()
	{
		  StringBuffer sb1=new StringBuffer("Rn");
                                  sb1.insert(1,"aja");
		System.out.println(sb1);
	}

            static void ReplaceDemo()
	{
		  StringBuffer sb1=new StringBuffer("Rajan");
                                  sb1.replace(0,5,"Rahul");
		System.out.println(sb1);
	}

             public static void main(String args[])
              {
                   AppendDemo();
                   InsertDemo();
                   ReplaceDemo();
                  
              }

             
}