import java.util.*;
 class ThrowExample {
   static void checkEligibilty(int stuage, int stuweight)throws ArithmeticException{ 
    try{
      if(stuage<12 && stuweight<40)
      {
        System.out.println("hai");
         throw  new ArithmeticException("Student is not eligible for registration"); 
      }
      else 
         System.out.println("Entries Valid!!"); 
   }
         catch(ArithmeticException ex)
         {
           System.out.println("inside catch" +ex);
         }
      
   } 

   public static void main(String args[]){ 
   checkEligibilty(11, 33);
  System.out.println("Have a nice day.."); 
 } 
  
}
