class Matrix {
                      int a[][],i,j;
                     Matrix()
                       {
                        a=new int[3][3]; 
                        for(i=0;i<=2;i++)
                         {
                        for(j=0;j<=2;j++)
                         {
                           a[i][j]=i+j;
                          }
                        }

                       }
                      void display()
                       {
                        for(i=0;i<=2;i++)
                         {
                        for(j=0;j<=2;j++)
                         {
                           System.out.print(a[i][j]+"\t");
                          }
                         System.out.println();
                        }                    
                      }
                      
                     Matrix sum(Matrix m1,Matrix m2)
                      {
                     
                           for(i=0;i<=2;i++)
                         {
                        for(j=0;j<=2;j++)
                         {
                            this.a[i][j]=m1.a[i][j]+m2.a[i][j];
                          }
                      
                        }                 
                                 return this;
                                              

                      }



           }

class MatrixDemo{
     public static void main(String ar[])
          {
                 Matrix m1=new Matrix();
                 Matrix m2=new Matrix();
                 System.out.println();
                 m1.display();
                 System.out.println();
                 m2.display();
                 Matrix m3=new Matrix();
                 m3=m3.sum(m1,m2);
                 System.out.println();
                  m3.display();
            }

}