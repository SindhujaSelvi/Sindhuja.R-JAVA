import java.util.*;
 class Trycontrolflow1
 {
     public static void main(String args[])
     {
         int x=10;
         int y=10;
         try{
             int num = x/y;
             System.out.println(num);
            System.out.println("Inside try");
         }catch(Exception ex)
         {
             //when there is no exception the catch block doesn't work
             System.out.println("Exception occured");
         }
         System.out.println("Outside try");
     }
 }