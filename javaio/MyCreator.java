import java.io.*;
class MyCreator
{
public static void main(String[] arr)
{
try
{
BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
PrintStream myout = new PrintStream ( new FileOutputStream(arr[0]));
System.out.println("Enter text, end to save.");
PrintStream temp=System.out;
//output stream is used.
System.setOut(myout); // Standard output is redirected to file.
while(true)
{
String s = b.readLine();
if(s.equals("end"))
break;
System.out.println(s); //data shall be written to the file
}
myout.close();
System.setOut(temp); //standard output is reset.
System.out.println("Successfully created.");
}
catch(Exception e)
{
System.out.println(e);
}
}
}