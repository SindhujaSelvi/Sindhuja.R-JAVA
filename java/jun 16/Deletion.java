import java.util.*;
class Deletion
{
  
    public static void main(String args[]) 
    {
      int n;
      System.out.println("Enter the n value");
      Scanner sc = new Scanner(System.in);
      n=sc.nextInt();
      int array[]= new int[n];
      System.out.println("Enter the element");
      for(int i=0;i<n;i++)
      array[i]=sc.nextInt();
      System.out.println("Enter the element to delete");
      int element=sc.nextInt();
      for(int i=0;i<n;i++)
      {
          if(array[i]==element)
          {
              //array[i]=array[i+1];
              for(int j=i;j<n-1;j++)
              array[j]=array[j+1];
          }

      }
      System.out.println("After deletion");
      for(int i=0;i<n-1;i++)
      System.out.println(array[i]);
     
    }
}