import java.util.*;
interface TestInterface
{
    void display();
}
class Anonymousinner2Test 
{
    public static void main(String args[])
    {
        // difference from normal interface 
        TestInterface interfaceobject = new TestInterface()
        {
        public void display()
        {
            System.out.println("Anonymous Inner class using interface");
        }
    };
    //calling of interface
    interfaceobject.display();
    }
}