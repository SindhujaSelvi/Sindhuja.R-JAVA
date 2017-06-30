class overloading
{
public static void main(int x)
{
    System.out.println(x);
}

public static void main(int x,int y)
{
    System.out.println(x+y);
}
    public static void main(String args[])
     {overloading over=new overloading();
         over.main(1);
         over.main(1,2);
}
}





