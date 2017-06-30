import java.util.*;
class Trycontrolflow2
{
    public static void main(String args[])
    {
        int x=10,y=0;
    try{
        int num= x/y;//on seeing this the control is transferred to catch
        System.out.println(num);
        System.out.println("Inside try");
    }catch(ArithmeticException ex)
    {
        System.out.println("Exception occured" +ex);
    }
    System.out.println("Outside try");
    }
}
