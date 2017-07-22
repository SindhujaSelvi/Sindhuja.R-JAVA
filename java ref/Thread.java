import java.util.*;
public class Thread
{
public int method1()
{
int c=5+3;
//System.out.println("ans" +c);
return c;
}
public void method2()
{
int i=method1();
System.out.println("print i" +i);
}
public static void main(String args[])
{
Thread t=new Thread();
t.method2();

}

}
 