/*
Equals to (==) operator when used to compare objects compares the 
value of references not the contents of objects.

To facilitate content wise comparison of objects equals() define by Object class is used.
public boolean equals(Object o);

Default implementation of equals() in Object class compares the references of objects not their contents. 
String class overrides this method to facilitate content wise comparison of Strings.

*/

class StringDemo2
{
		
	public static void main(String args[])
	{
                  String name1="Ram";
                  String name2="Ram";
                  String name3=new String("Ram");
                  String name4=new String("Ram");
                  String name5=new String("ram");
                  System.out.println((name1==name2));
                  System.out.println((name3==name4));
                  System.out.println((name1.equals(name2)));
                  System.out.println((name3.equals(name4)));
                  System.out.println(name4.equals(name5));
                   System.out.println(name4.equalsIgnoreCase(name5));
	}
}
