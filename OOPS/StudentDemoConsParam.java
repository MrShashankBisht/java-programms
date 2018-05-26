import java.util.Scanner;       
class Student{
                     private int id;
                     private String name;
                     Student(int a,String b)
                      {
                         id=a;
                         name=b;
                       }
                   void getValue()
                      {
                    System.out.println("id:"+id+",  name:"+name);
                     }
                  }
       class StudentDemoConsParam{
                            public static void main(String... args)
                             {
                            Scanner sc=new Scanner(System.in);
                            System.out.print("enter the id \n");
                            int id=sc.nextInt();
                            sc.nextLine();      //new line character is consumed by this line...
                            System.out.println("enter the name:");
                            String name=sc.nextLine();
                            Student st=new Student(id,name);
                            st.getValue();
                            }

                            }