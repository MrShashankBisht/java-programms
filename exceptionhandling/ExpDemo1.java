class ExpDemo1{
       
           public static void main(String args[])
                        {
                 try{
                  int x=Integer.parseInt(args[0]);
                  int y=Integer.parseInt(args[1]);
                  int z=x/y;
                  System.out.println("result="+z);
                    }
                  catch(ArithmeticException exp)
                   {
                 System.out.println("arith Eception : "+exp);

                  }
              catch(NumberFormatException exp)
                   {
                 System.out.println("number format Eception : "+exp);

                  }
                  System.out.println("method is ending here....");
                        }
           
                      }
    