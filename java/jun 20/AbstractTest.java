abstract class Base
{
    abstract void calculate();
    abstract void display();
}
class Derive extends Base
{
    int a=5, b=5, c;
  void calculate()
  {
      c=a+b;
  }
  /*void display()
  {
      System.out.println(c);
      System.out.println("Abstract method called");
  }*/
}
class Extra extends Base
{
    int a=3, b=3, c;
 /* void calculate()
    {
      c=a+b;
    }*/
   void display()
    {
        System.out.println(c);
        System.out.println("Method extended");
    }
}
class AbstractionTest
{
    public static void main(String args[])
    {
        Base derive=new Extra();
    derive.calculate();
       derive.display();
        //Extra extra=new Extra();
       // extra.calculate();
        //extra.display();
    }
}