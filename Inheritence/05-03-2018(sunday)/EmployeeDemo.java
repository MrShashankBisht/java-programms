       class Employee{
                     private int id;
                     private String name;
                     void setEmployee(int a,String b)
                      {
                         id=a;
                         name=b;
                       }
                   void getEmployee()
                      {
                    System.out.println("id:"+id+",  name:"+name);
                      }
                     }
       class Manager extends Employee{
                     private float salary;
               
                     void setManager(float x)
                      {
                         salary=x;
                       }
                   void getManager()
                      {
                    System.out.println("Salary:"+salary);
                      }
                                                        }
   class EmployeeDemo{
                            public static void main(String... args)
                             {
                                Manager m=new Manager();
                                m.setEmployee(101,"raman");
                                m.setManager(5000.45f);
                                m.getEmployee();
                                m.getManager();
                            }
                            }