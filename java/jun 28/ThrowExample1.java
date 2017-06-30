import java.util.*;
class ThrowExample1
{
    static public void method1(int sum) //throws ArithmeticException
    {
       if(sum==1)
       {
           System.out.println("Sum is one");
           //throw new ArithmeticException("exception");
       }
       else{
           System.out.println("Sum is not one");
       }
    }
public static void main(String args[]) throws Throwable
{
   try{
       ThrowExample1 throw1 = new ThrowExample1();
       throw1.method1(17);
   }catch(Throwable ex)
   {
       System.out.println("catch block" +ex);
   }
}
}
