class ExpDemo3{

                     static int division(int x,int y) throws ArithmeticException
                        {
                          return x/y;
                        }
                     public static void main(String args[])
                        {
                 try{
                  int x=Integer.parseInt(args[0]);
                  int y=Integer.parseInt(args[1]);
                  int z=division(x,y);
                  System.out.println("result="+z);
                    }
                  catch(ArithmeticException exp)
                   {
                 System.out.println("arith Eception : "+exp);

                  }
                  finally{
                  System.out.println("finally here....");
                           }
                        }
           
                      }
    