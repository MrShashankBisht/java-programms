import java.io.*;
class Student implements Serializable
{
private String name, course;
int fee;
public Student(String n, String c, int f)
{
name = n;
course = c;
fee = f;
}
public void display()
{
System.out.println(name + "\t" + course + "\t" + fee);
}
}

class ObjectSerialization
{
public static void main(String[] args)
{
try
{
Student s1 = new Student("Amar", "Java", 12000);
Student s2 = new Student("Ravi", ".Net", 8000);
System.out.println("Serializing following objects...");
s1.display();
s2.display();
ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("std.obj"));
out.writeObject(s1);
out.writeObject(s2);
out.close();
System.out.println("Successfully serialized.");

try
{
System.out.println("Deserializing following objects...");
ObjectInputStream in = new ObjectInputStream(new FileInputStream("std.obj"));
Student s3 = (Student) in.readObject();
Student s4 = (Student) in.readObject();
System.out.println("Following objects are serialized.");
s3.display();
s4.display();
}
catch(Exception e)
{
System.out.println(e);
}


}
catch(Exception e)
{
System.out.println(e);
}
}
}