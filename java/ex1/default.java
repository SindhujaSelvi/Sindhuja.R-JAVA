class default1
{
default1()
{
    System.out.println("Default constructor");
}
int addition(int x,int y)
{
    x=x+y;
     System.out.println("x="+x);
}
public static void main(String args[])
{

    default1 D=new default1();
    D.default1();
    D.addition(1,2);
}





}
