       class Student{
                     private int id;
                     private String name;
                     Student()   //default constructor
                       {
                         id=100;
                         name="rajan";
                       }
                   void getValue()
                      {
                    System.out.println("id:"+id+", name:"+name);
                      }
                        }
       class StudentDemoConsDefault{
                            public static void main(String args[])
                             {
                            Student st=new Student();
                            st.getValue();
                              Student kt=new Student();
                            kt.getValue();
                            }

                            }