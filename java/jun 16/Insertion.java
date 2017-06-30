import java.util.*;
class Insertion
{
    public static void main(String args[])
    {
    int position,n;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    n= sc.nextInt();
    int array[]= new int[n+1];
    System.out.println("Enter the array elements");
    for (int i=0;i<n;i++)
    array[i]=sc.nextInt();
    System.out.println("Enetr the position of element to be inserted");
    position=sc.nextInt();
    System.out.println("Enter the elemtnt to be inserted");
    int element=sc.nextInt();
    for(int i=n;i>=position;i--)
    {
        array[i]=array[i-1];
    }
        array[position-1]= element;
        System.out.println("Afetr insertion");
        for(int i=0;i<=n;i++)
        {
            System.out.println(array[i]);

        }
    }
}