class overload
{
static void calculate(int a)
{
    System.out.println(a);
}
static void calculate(int x, int y)
{
    System.out.println(x,y);
}
}
class methodoverloading
{
    public static void main(String args[])
{
    
    System.out.println(overload.calculate(1));
    System.out.println(overload.calculate(2,3));
}
}