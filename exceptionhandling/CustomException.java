class MyException extends Exception{
                          
                         MyException(String value)
                         {
                          super(value);
                         }
                                                          }
class CustomException{
            
           public static void main(String ar[])
              {
            try{
              int x=Integer.parseInt(ar[0]);
              if(x>100)
               throw new MyException("no > 100");
              System.out.println("x="+x);
            }
             catch(MyException ex)
              {
            System.out.println("message :"+ex.getMessage());
             }
                                  }
              }       