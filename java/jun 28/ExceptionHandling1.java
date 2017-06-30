import java.util.*;
public class ExceptionHandling1
{
    public static void main(String[] args)
    {
        try
        {
            methodWithThrow();
        }
        catch(NumberFormatException ex)
        {
            System.out.println("NumberFormatException object thrown in methodWithThrow() method will be handled here");
            ArithmeticException ex1 = new ArithmeticException("This is an object of ArithmeticException");
 
             throw ex1;     
    }

    }
 
    static void methodWithThrow()
    {
        try
        {
            NumberFormatException ex = new NumberFormatException("This is an object of NumberFormatException");
           // ArithmeticException ex1 = new ArithmeticException("This is an object of ArithmeticException");
 
            throw ex; 
                 //throwing NumberFormatException object explicitly using throw keyword
        }
        catch(ArithmeticException ex1)
        {
            System.out.println("hii");
            System.out.println("Explicitly thrown NumberFormatException object will not be caught here" +ex1);
        }
    }
}