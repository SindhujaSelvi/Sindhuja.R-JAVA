class ArrayPassing
{
    
     public void SingleArray(int a[])
     {
       // int aa[]=new int[2];
        for(int i=0;i<a.length;i++)
        
        System.out.println(a.length);
     }
     
     
     public void MultiArray(int b[][])
     {
        //int b[][]=new int[2][2];
        for(int i=0;i<2;i++)
        {
        for(int j=0;j<b.length;j++)
     {
        System.out.println(b[i][j]+"");
     }
     System.out.println("");
        }
     }
public static void main(String args[])
{
    ArrayPassing pass=new ArrayPassing();
    //int a[]={1,2};
    int b[][]={{1,2},{3,4}};
    pass.SingleArray(1,2);
    System.out.println("");
    pass.MultiArray(b);
}
}