//class Nested
//{
    class Square extends InterfaceAbstraction
{
    
    abstract public void calc(int Side)
    {
        int area = Side * 4;
    }
    abstract public void display()
    {
        System.out.println("Area of square is" +area);
    }
}
class Rectangle extends InterfaceAbstraction
{
    abstract public void calc(int Side)
    {
        int area = Side * 2;
    } 
    abstract public void display()
    {
        System.out.println("Area of rectangle is" +area);
    }
}
//}
class Swi
{
    public static void main(String args[])
    {
     /*Nested nested = new nested();
     nested.calc(25);
     nested.display();*/
     Square square=new Square();
     square.calc(5);
     square.display(); 
     Rectangle rectangle=new Rectangle();
     rectangle.calc(6);
     rectangle.display(); 
    }
}