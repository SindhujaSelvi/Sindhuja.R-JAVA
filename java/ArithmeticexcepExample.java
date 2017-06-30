import java.util.*;
public class ArithmeticexcepExample
{
    public static void main(String args[])
    {
        int a=9;b=0;
        System.out.println("Example for arithmetic exception");
        try
        {
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Do not divide by zero" +e);
        }
        
        System.out.println("Enters out");
    }
}