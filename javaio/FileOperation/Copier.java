import java.io.*;
// to copy contents of two files to a file.
// file names are provided as command line arguments.
class Copier
{
public static void main(String[] arr)
{
try
{
SequenceInputStream in = new SequenceInputStream(new
FileInputStream(arr[0]), new FileInputStream(arr[1]));
FileOutputStream out = new FileOutputStream(arr[2]);
while(true)
{
int ch = in.read();
if(ch==-1)
break;
out.write(ch);
}
out.close();
System.out.println("Successfully copied.");
}
catch(Exception e)
{
System.out.println(e);
}
}
}