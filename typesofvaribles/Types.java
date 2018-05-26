class Types{
                  boolean y;  //instance variable
                  static int z; //static variable
        public static void main(String ar[])
          {
             //static area....
            int x=12; //local variable
            System.out.println("local varible x:"+x); 
             Types t=new Types();
             t.Show();
             Demo();
          }
     
        public void Show()
          {
            //instance area....
              System.out.println("output from Show...");
              System.out.println("instance varible y:"+y);          
              System.out.println("static varible z:"+z);          

          }
      
        public static void Demo()
          {
             //static area..
             System.out.println("output from Demo...");
             Types t=new Types();
             System.out.println("instance varible y:"+t.y);          
             System.out.println("static varible z:"+z);     
          }
        }