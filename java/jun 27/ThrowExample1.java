import java.util.*;
class ThrowExample1
{
    public void method1(int sum) 
    {
       if(sum==1)
       {
           System.out.println("Sum is one");
       }
       else{
           System.out.println("Sum is not one");
       }
    }
public static void main(String args[]) throws ArithmeticException
{
   try{
       method(1);
   }catch(ArithmeticException ex)
   {
       System.out.println("catch block" +ex);
   }
}
}
