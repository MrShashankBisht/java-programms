       class Student{
                     private int id;
                     private String name;
                   
                      {
                         //anonymous block
                         id=200;
                         System.out.println("anonymous block...");
                      }
                     Student()   //default constructor
                       {
                       System.out.println("default constructor called...");
                         //id=100;
                         name="rajan";
                       }
                       Student(int x,String y)   //Parameterized constructor
                       {
                       System.out.println("Parameterized constructor called...");
                         id=x;
                         name=y;
                       }
 
                   void getValue()
                      {
                    System.out.println("id:"+id+", name:"+name);
                      }
                        }
       class StudentDemoConsBlock{
                            public static void main(String args[])
                             {
                            Student st=new Student();
                            st.getValue();
                            Student kt=new Student(100,"rakesh");
                            kt.getValue();
                            }

                            }