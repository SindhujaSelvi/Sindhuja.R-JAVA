import java.util.*;
class Retrieve
{
    public static void main(String args[])
    {
        System.out.println("Enter the n value");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int array[]= new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        array[i]=sc.nextInt();
        System.out.println("Enter the Retrieval element");
        int element=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        if(array[i]==element)
          System.out.println("position of the element" +element+"is" +i); 
        }
        
        }
}