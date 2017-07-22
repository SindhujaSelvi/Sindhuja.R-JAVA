import java.util.*;
public class ThreadLock extends Thread{
    int a,b;
    public int method1()
    {
      int c = a+b;
      return c;
    }
    public void method2()
    {
        int i = method1();
        System.out.println("Method2 called..");
        System.out.println("value of i" +i);
    }
}