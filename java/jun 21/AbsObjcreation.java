abstract class Base
{
    void display()
    {
        System.out.println("Hai");
    }
}
class AbsObjcreation
{
    public static void main(String args[])
    {
        Base base=new Base()
        {};
        base.display();
    }
}