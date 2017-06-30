import java.util.*;
class RethrowExample
{
    public static void main(String[] args)
    {
        try
        {
            methodRethrow();
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException2");
        }
    }
 
    static void methodRethrow()
    {
        try
        {
            String s = null;
            System.out.println(s.length());   // Throws NullPointerException
        }
        catch(NullPointerException ex)
        {
            System.out.println("NullPointerException");
 
            throw ex;     //Re-throwing NullPointerException
        }
    }
}
