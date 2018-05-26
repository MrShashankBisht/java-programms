class StaticOuter{  
 static int data=30;  
  int y=50;
 static class StaticInner{  
  void msg()
     {
       System.out.println("data is "+data);
     }  
 }  

} 

class StaticInnerDemo{

 public static void main(String args[])
  {  
  StaticOuter.StaticInner in=new StaticOuter.StaticInner();  
  in.msg();  
  }  
}