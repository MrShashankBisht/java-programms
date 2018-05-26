       class Student{
                     private int id;
                     private String name;
                     Student()   //default constructor
                       {
                         id=100;
                         name="rajan";
                       }
                       Student(Student Ref)   //parameterize constructor
                       {
                         id=Ref.id;
                         name=Ref.name;
                       }
                   void getValue()
                      {
                    System.out.println("id:"+id+", name:"+name);
                      }
                 void increment()
                      {
                        id=id+1;
                       } 
                    

                        }
       class StudentDemoConsCopy{
                            public static void main(String args[])
                             {
                            Student st=new Student();
                            st.getValue();
                            Student kt=new Student(st);
                            kt.getValue();
                            kt.increment();
                            System.out.println("after increment second object values...");
                            kt.getValue();
                            System.out.println("after increment first object values...");
                            st.getValue();
                            }

                            }