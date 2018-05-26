package MyPack2;
import MyPack1.PackDemo1;
  class PackDemo3 extends PackDemo1{

       public static void main(String args[])
                  {
        PackDemo3 p=new PackDemo3();
         p.showPublic();        //it will be accessed
         p.showProtected();   //it will be accessed
        //p.showDefault();     //it will not be accessed
                }
                                }