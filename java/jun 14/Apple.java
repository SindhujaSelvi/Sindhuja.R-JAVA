import java.io.*;
import java.util.*;
class multi
{
   //static int[] a=new int[4];
    public static void main(String args[])
{
     int [][]a=new int[2][2];
     int [][]b=new int[2][2];
     int [][]c=new int[2][2];
     
     
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<b.length;j++)
        {
              c[i][j]=sc.nextInt();
        }
 }
    

for(int i=0;i<a.length;i++)
{
    for(int j=0;j<b.length;j++)
System.out.println(c[i][j]);

}
}
}