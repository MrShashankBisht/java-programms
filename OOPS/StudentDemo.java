       class Student{
                     private int id;
                     private String name;
                     void setValue(int a,String b)
                      {
                         id=a;
                         name=b;
                       }
                   void getValue()
                      {
                    System.out.println("id:"+id+",  name:"+name);}}
   class StudentDemo{
                            public static void main(String... args)
                             {
                            Student st=new Student();
                            System.out.println("refrence id:"+st);
                            st.setValue(101,"raja");
                            st.getValue();
                             Student kt=new Student();
                            System.out.println("refrence id:"+kt);
                            kt.setValue(103,"rajan");
                            kt.getValue();
                             new Student().getValue();  //anonymous object...
                            }

                            }