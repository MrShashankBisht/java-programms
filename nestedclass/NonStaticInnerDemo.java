class NonStaticOuter{  
 private int data=30;  
 class NonStaticInner{  
  void msg()
     {
       System.out.println("data is "+data);
     }  
 }  

} 

class NonStaticInnerDemo{

 public static void main(String args[])
  {  
  NonStaticOuter obj=new NonStaticOuter();   //create the object of outer class
  NonStaticOuter.NonStaticInner in=obj.new NonStaticInner();   //with the help outer class reference 
                                                     //variable create the object of inner class
  in.msg();  
  }  


}