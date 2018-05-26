package MyPack2;

 public class PackDemo2{
    
         public static void main(String ar[])
          {
         MyPack1.PackDemo1 p=new MyPack1.PackDemo1();
         p.showPublic();        //it will be accessed
         //p.showProtected();   //it will not be accessed
         //p.showDefault();     //it will not be accessed

            }
                                  }