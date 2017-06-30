//class Nested
//{
    class Square extends InterfaceAbstraction
{    int area;
    
     public void calc(int Side)
    {
        area = Side * 4;
    }
     public void display()
    {
        System.out.println("Area of square is" +area);
    }
}
class Rectangle extends InterfaceAbstraction
{int area;
     public void calc(int Side)
    {
         area = Side * 2;
    } 
     public void display()
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