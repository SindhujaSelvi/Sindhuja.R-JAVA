class overload
{
static int calculate(int a)
{
    return a;
    
}
static int calculate(int x, int y)
{
    return x+y;
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